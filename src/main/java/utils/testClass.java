package utils;

import org.openqa.selenium.WebDriver;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by Debar on 7/7/2017.
 */
public class testClass {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {

        String methodName ="returnString";
        Class<?> cls = Class.forName("utils.myString");
        Constructor<?> cons = cls.getConstructor(String.class);
        //The call to getConstructor specifies that you want the constructor that takes a single String parameter. Now to create an instance:
        Object o = cons.newInstance("myString");
        Method m = cls.getMethod(methodName);
        Object value = m.invoke(o);
        System.out.println(value.toString());





    }
}
