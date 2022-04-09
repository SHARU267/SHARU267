package Com.hrms.lib;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Global
{
	//to provide text data and objects
	WebDriver driver;
String url="http://183.82.103.245/nareshit/login.php";
String un="nareshit";
String pw="nareshit";
String empfname="Nimmatota";
String emplname="Ashok kumar";
String editfname="Sharu";
String editlname="vema";
String empid="1636";

//object identification 
public String txt_loginname="txtUserName";
public String txt_password="txtPassword";
public String btn_login="Submit";
public String link_logout="Logout";
public String link_addemp="//*[@id=\"pim\"]/ul/li[2]/a/span";
public String lpim="PIM";
public String addnewemp="//*[@id=\"standardView\"]/div[3]/div[1]/input[1]";
public String oempfn="txtEmpFirstName";
public String oempln="txtEmpLastName";
public String osave="//*[@id=\"btnEdit\"]";
public String emplist="//*[@id=\"pim\"]/ul/li[1]/a/span";
public String editemp1="//*[@id=\"standardView\"]/table/tbody/tr[1]/td[3]/a";
public String btn_edit="//*[@id=\"btnEditPers\"]";
public String editempfn="//*[@id=\"txtEmpFirstName\"]";
public String editempln="//*[@id=\"txtEmpLastName\"]";
public String editsave="//*[@id=\"btnEditPers\"]";
public String selectdrop="Emp. ID";
public String searchdroptext="loc_name";
public String searchbtndrop="//*[@id=\"standardView\"]/div[2]/input[2]";
public String checkboxsdrop="//*[@id=\"allCheck\"]";
public String deletedrop="//*[@id=\"standardView\"]/div[3]/div[1]/input[2]";


}
