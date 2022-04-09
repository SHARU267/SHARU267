  package hrmstestscript;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import Com.hrms.lib.General;


public class TC_001login {

	
	@Test
	public void tc001()
	{
		//need to configure xml file below statement
		DOMConfigurator.configure("log4j.xml");
		General gen=new General();
         gen.openApplication();
         gen.login();
         
         gen.closeApplication();
         
	
	}
}
