package testPlaywright.playWright;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class PlayWrightSessionWithActualBrowser {

	public static void main(String[] args) {
		Playwright playwright = Playwright.create();
		
		LaunchOptions lp = new LaunchOptions();
		lp.setChannel("chrome");
		lp.setHeadless(false);
		Browser browser = playwright.chromium().launch(lp);
		
		Page page = browser.newPage();
		page.navigate("https://www.amazon.com");
		
		String title = page.title();
		
		System.out.println(title);
		//playwright.close();
	}
	
	
	
	
}
