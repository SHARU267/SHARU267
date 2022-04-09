package hrmstestscript;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import Com.hrms.lib.General;

@Test
public class TC_002 {

	//public static void main(String[] args) throws InterruptedException {
	@Test
	public void tc002() throws Exception
	{
		
		DOMConfigurator.configure("log4j.xml");
		General gen=new General();
		gen.openApplication();
		gen.login();
		gen.addnewEmp();
		gen.logout();
		gen.closeApplication();
		

	}

}
