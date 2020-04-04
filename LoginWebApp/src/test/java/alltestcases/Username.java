package alltestcases;

import static org.junit.Assert.*;
import static net.sourceforge.jwebunit.junit.JWebUnit.setBaseUrl;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import static net.sourceforge.jwebunit.junit.JWebUnit.assertLinkPresent;
import static net.sourceforge.jwebunit.junit.JWebUnit.assertTitleEquals;
import static net.sourceforge.jwebunit.junit.JWebUnit.beginAt;
import static net.sourceforge.jwebunit.junit.JWebUnit.clickLink;
import static net.sourceforge.jwebunit.junit.JWebUnit.setTestingEngineKey;

import net.sourceforge.jwebunit.util.TestingEngineRegistry;

public class Username {
	WebDriver driver;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Set Up Before Class - @BeforeAll");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Tear Down After Class - @AfterAll");
	}

	@Before
	public void setUp() throws Exception {
		setTestingEngineKey(TestingEngineRegistry.TESTING_ENGINE_HTMLUNIT); 
		setBaseUrl("http://localhost:9090/junitwebapp");
		System.out.println("Set Up @BeforeEach");
	}

	

	@After
	public void tearDown() throws Exception {
		System.out.println("Tear Down @AfterEach");
	}

	@Test
	public void verifyPageTitleTest() {
		beginAt("index.jsp"); 
        assertTitleEquals("JSP Example");
        assertLinkPresent("register");
        clickLink("register");
        assertTitleEquals("Registration");
		
	}
	@Test
	public void Registrationpage() {
		beginAt("register.jsp"); 
        assertTitleEquals("Registration");
        assertLinkPresent("index");
        clickLink("index");
        assertTitleEquals("JSP Example");
		
	}
	@Test
	public void Welcomepage() {
		beginAt("welcome.jsp"); 
        assertLinkPresent("index");
        clickLink("index");
        assertTitleEquals("JSP Example");
		
	}
	@Test
	public void Successpage() {
		beginAt("success.jsp");
		
        assertLinkPresent("index");
        clickLink("index");
        assertTitleEquals("JSP Example");
		
	}
}
