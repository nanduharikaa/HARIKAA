package maven_sample1;

import org.testng.annotations.Test;

public class ReadingdataFromcommandlineTest {
	@Test(groups="smoke")
	public void readingdataFromcmdlinetest()
	{
		String URL=System.getProperty("url");
		String UN=System.getProperty("username");
		String PWD=System.getProperty("password");
		
		System.out.println(URL);
		System.out.println(UN);
		System.out.println(PWD);

}
	
	@Test(groups="regression")
	public void regressionTest()
	{
		String URL=System.getProperty("url");
		String UN=System.getProperty("username");
		String PWD=System.getProperty("password");
		
		System.out.println(URL);
		System.out.println(UN);
		System.out.println(PWD);
}}
