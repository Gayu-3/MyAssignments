package week1.day2;

public class Browser {

	public String launchBrowser (String browserName) {
		// TODO Auto-generated method stub
		System.out.println("Browser launched successfully");
		return("browserName is :"+browserName);
	}
	public void loadUrl() {
		System.out.println("Application url loaded successfully");
		
	}
	public static void main(String[] args) {
		Browser br= new Browser();
		String b = br.launchBrowser("Google");
		System.out.println(b);
		br.loadUrl();		
	}

}
