package hrmstestscript;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import Com.hrms.lib.General;

public class TC_003 {

	//public static void main(String[] args) throws InterruptedException {
	@Test
	public void tc003() throws Exception
	{
		//need to configure xml file below statement
		DOMConfigurator.configure("log4j.xml");
		
		General gen=new General();
		gen.openApplication();
		gen.login();
		gen.editEmp();
		gen.logout();
		gen.closeApplication();

	} 

} 
