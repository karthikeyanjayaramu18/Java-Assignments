package week3.day2;

public class Browser {
	
	public void openUrl() {
		String browserName = "Chrome";
		System.out.println(browserName);
		
	}
	
	public void closeBrowser(String browserVersion) {
		System.out.println(browserVersion);

	}

	public static void main(String[] args) {
		Browser optionBrowser = new Browser();
		optionBrowser.openUrl();
		optionBrowser.closeBrowser("4.5.6");
		

	}

}
