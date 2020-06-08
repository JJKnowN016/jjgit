// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class Selenium {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() throws MalformedURLException {
    driver = new RemoteWebDriver(new URL("http://localhost:9090"), DesiredCapabilities.chrome());
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void untitled() {
    driver.get("http://localhost:9090/");
    driver.manage().window().setSize(new Dimension(925, 1053));
    driver.findElement(By.linkText("New Game")).click();
    driver.findElement(By.id("submit")).click();
    driver.findElement(By.id("submit")).click();
    driver.findElement(By.linkText("home")).click();
    driver.findElement(By.linkText("New Game")).click();
    driver.findElement(By.cssSelector("tr:nth-child(1) > td:nth-child(1)")).click();
    driver.findElement(By.name("cell_0_0")).click();
    driver.findElement(By.id("submit")).click();
    driver.findElement(By.id("submit")).click();
    driver.findElement(By.id("submit")).click();
    driver.findElement(By.linkText("home")).click();
    driver.findElement(By.linkText("New Game")).click();
    driver.findElement(By.name("cell_0_0")).click();
    driver.findElement(By.name("cell_0_1")).click();
    driver.findElement(By.name("cell_0_2")).click();
    driver.findElement(By.name("cell_1_0")).click();
    driver.findElement(By.cssSelector("tr:nth-child(2) > td:nth-child(2)")).click();
    driver.findElement(By.name("cell_1_1")).click();
    driver.findElement(By.name("cell_1_2")).click();
    driver.findElement(By.name("cell_2_0")).click();
    driver.findElement(By.name("cell_2_1")).click();
    driver.findElement(By.name("cell_2_2")).click();
    driver.findElement(By.id("submit")).click();
    driver.findElement(By.id("submit")).click();
    driver.findElement(By.id("submit")).click();
    driver.findElement(By.id("submit")).click();
    driver.findElement(By.linkText("home")).click();
    driver.findElement(By.cssSelector("body")).click();
    driver.findElement(By.cssSelector("body")).click();
  }
}