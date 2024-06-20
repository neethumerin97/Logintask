package logintest;

import org.testng.annotations.Test;

import basepkg.Baseclass;
import loginpkg.Loginclass;
import utils.Excelutils;


public class Logintest extends Baseclass {
	@Test(priority=1)
	public void logintest() throws InterruptedException {
		Loginclass ob=new Loginclass(driver);
		String x1="C:\\Users\\neeth\\OneDrive\\Desktop\\Signpage.xlsx";
		String Sheet="Sheet2";
		int rowCount=Excelutils.getRowCount(x1,Sheet);
		for(int i=1;i<=rowCount;i++) {
			String UserName=Excelutils.getcellValues(x1, Sheet, i, 0);
			System.out.println("username--"+UserName);
			String pwd=Excelutils.getcellValues(x1, Sheet, i, 1);
			System.out.println("password----"+pwd);
			ob.setvalues(UserName,pwd);
			ob.loginbutton();
			driver.manage().window().maximize();
			Thread.sleep(3000);
			driver.navigate().refresh();
		}
		
		
	}
	@Test(priority=2)
	public void currenttitle() { //throws InterruptedException 
		driver.get("https://pathfinder.w3schools.com/");
		System.out.println("page title is: " +driver.getTitle());
	//	Thread.sleep(3000);
	//	driver.close();
		
		
	
}
	
	
	
	
	

}
