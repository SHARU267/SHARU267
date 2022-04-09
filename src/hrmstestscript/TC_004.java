package hrmstestscript;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Com.hrms.lib.General;

public class TC_004 {

	//public static void main(String[] args) throws InterruptedException {
	@Test
	public void tc004() throws Exception
	{
		//need to configure xml file below statement
		DOMConfigurator.configure("log4j.xml");
		General gen=new General();
		gen.openApplication();
		Reporter.log("login completed");
		gen.login();
		gen.enterFrame();
		gen.deleteEmp();
		gen.exitFrame();
		gen.logout();
		Reporter.log("logout completed");
		gen.closeApplication();

	}

}
