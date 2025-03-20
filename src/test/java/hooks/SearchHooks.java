package hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class SearchHooks {

	@Before("@Smoke")
	public void setup(Scenario sc) {
		System.out.println("launch amazon application");
	}
	
	/*
	 * @Before(order=2) public void setup_url() { System.out.println("launch url");
	 * }
	 */
	
	@After("@Smoke")
	public void tearDown_close(Scenario sc) {
		System.out.println("close the browser");
	}
	

	/*
	 * @After(order=3) public void tearDown_logout() {
	 * System.out.println("logout from application"); }
	 */
	
	/*
	 * @BeforeStep public void takeScreenshot() {
	 * System.out.println("take the screenshot"); }
	 * 
	 * @AfterStep public void refreshPage() {
	 * System.out.println("refresh the page"); }
	 */
}
