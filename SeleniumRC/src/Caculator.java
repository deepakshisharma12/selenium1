import com.thoughtworks.selenium.DefaultSelenium;

public class Caculator {

    public static void main(String[] args) {
	DefaultSelenium selenium = new DefaultSelenium("localhost", 4444, "firefox", "http://google.com/");
	selenium.start();
	selenium.windowMaximize();
	selenium.open("/");
	System.out.println(selenium.getTitle());

    }

}
