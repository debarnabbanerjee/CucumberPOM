package com.debarnab.cucumbePOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage_Admin {

	HomePage_Admin(WebDriver driver){		
		PageFactory.initElements(driver,this);
	}
	@FindBy(how = How.XPATH, using = "//*[@id='branding']/img")
	public WebElement orangeHRMLogo ;
	
	@FindBy(how = How.XPATH, using = "//*[@id='branding']/a[1]")
	public WebElement joinHrmCommunity ;	
	
	@FindBy(how = How.XPATH, using = "//*[@id='welcome']")
	public WebElement welcomeLogo ;
	
	@FindBy(how = How.XPATH, using = "//*[@id='menu_admin_viewAdminModule']/b")
	public WebElement adminMenu ;
	
	@FindBy(how = How.XPATH, using = "//*[@id='menu_pim_viewPimModule']/b")
	public WebElement pimMenu ;
	
	@FindBy(how = How.XPATH, using = "//*[@id='menu_leave_viewLeaveModule']/b")
	public WebElement leaveMenu ;
	
	@FindBy(how = How.XPATH, using = "//*[@id='menu_time_viewTimeModule']/b")
	public WebElement timeMenu ;
	
	@FindBy(how = How.XPATH, using = "//*[@id='menu_recruitment_viewRecruitmentModule']/b")
	public WebElement recruitmentMenu ;
	
	@FindBy(how = How.XPATH, using = "//*[@id='menu_discipline_defaultDisciplinaryView']/b")
	public WebElement disciplineMenu ;
	
	@FindBy(how = How.XPATH, using = "//*[@id='menu_training_defaultTrainingModulePage']/b")
	public WebElement trainingMenu ;
	
	@FindBy(how = How.XPATH, using = "//*[@id='menu_performance_viewMyAppraisals']/b")
	public WebElement performanceMenu ;
	
	@FindBy(how = How.XPATH, using = "//*[@id='menu_onboarding_defaultMenuView']/b")
	public WebElement onboardingMenu ;

}
