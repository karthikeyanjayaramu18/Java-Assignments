package week3.day2;

public class Chrome extends Browser {
	
	public void openIncognito() {
		System.out.println("openIncognito");

	}
	
	public void clearCache() {
		System.out.println("clearCache");
	

	}

	public static void main(String[] args) {
		Chrome optionChrome = new Chrome();
		
		optionChrome.openIncognito();
		optionChrome.clearCache();
		optionChrome.openUrl();
		optionChrome.closeBrowser("4.5.7");
			

	}

}
