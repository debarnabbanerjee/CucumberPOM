package utils;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;


public class utiliyFactory {	
	//private static Logger log;
	private static Properties prop;
	private static FileInputStream ip;
	private static utiliyFactory ufactory;	
	private static String returnpath;
	private static HttpClient client;
	private static HttpGet request;
	private static HttpResponse response;
	private utiliyFactory(){}
	private static Class cls;
	private static Object obj;

	
	public static void getutiliyInstance(){
		if(ufactory==null){			
			//log = Logger.getLogger("devpinoyLogger");
			System.out.println("Testing log files and starting the testing process");
			//log.debug("Testing log files and starting the testing process");
			System.out.println("loaded log 4 j params");
			
			try{
				prop = new Properties();
				ip = new FileInputStream(System.getProperty("user.dir")+"//env.properties");
				prop.load(ip);
				//log.debug("Loaded the config file");
				System.out.println("Env Properties files loaded");

				String p = prop.getProperty("env");
				System.out.println(p);
				ip = new FileInputStream(System.getProperty("user.dir")+"//"+p+".properties");
				prop.load(ip);

			}catch(Exception e){
				e.printStackTrace();
			}
			
			//createExecutionFolders();
			ufactory = new utiliyFactory();
			System.out.println("utility class instantantiated");
			
		}else if(ufactory!=null)
			return;
		
	}
	
	public static void main(String[] args){
		utiliyFactory.getutiliyInstance();
		System.out.println(getProp("baseUrl"));
		writeLogs("I am still testing");
	}
	
	public static void writeLogs(String s){
		//log.debug(s);
	}
	
	public static String getProp(String key){
		try{
			writeLogs("Loaded the property " + key);
			return prop.getProperty(key);			
		}catch(Exception e){
			writeLogs("Unable to load the property" + key);
			return null;
		}
	}
	
	
	
	private static void createExecutionFolders(){
		String path =new SimpleDateFormat(prop.getProperty("dateformat")).format(new Date()).toString().replaceAll(":", "-");
		//System.out.println(path);
		returnpath = path;
		try{
			new File(System.getProperty("user.dir")+"//Execution Results//"+path).mkdirs();
			//log.debug("Created results folder at " + path);
		}catch(Exception e){
			//log.debug("Unable to create results folder" + e.getMessage());
		}
		
	}
	
	public static int checkResponse(String url){
		try{
			client = HttpClientBuilder.create().build();
			request = new HttpGet(url);		
			response = client.execute(request);
			writeLogs("Response Code : "+ response.getStatusLine().getStatusCode());
			return response.getStatusLine().getStatusCode();
		}catch(Exception e){
			writeLogs("Error in getting server response ... " + e.getMessage());
			return 0;
		}
	}

	public static String returnPath(){
		return returnpath;
	}

	public static void instantiateClass(String className,String methodName){
		try{
			System.out.println("Class name is " + className + " and  method name is " + methodName);
			cls = Class.forName("com.debarnab.cucumbePOM.WebPages."+className);
			obj = cls.newInstance();
			Method m = cls.getMethod(methodName,WebDriver.class);
			m.invoke(obj);
		}catch (Exception e){
			e.printStackTrace();
		}


	}
}
