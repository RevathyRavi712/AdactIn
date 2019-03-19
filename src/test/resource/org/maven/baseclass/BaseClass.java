package org.maven.baseclass;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {


	
	
	

	public static WebDriver driver  ;

	public static WebDriver browerLaunch(String browerName) throws Exception {

		try {
			if (browerName.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe");
				driver = new ChromeDriver();

			} else if (browerName.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver",
						System.getProperty("user.dir") + "\\src\\test\\reource\\Drivers\\geckodriver.exe");
				driver = new FirefoxDriver();
			} else if (browerName.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver",
						System.getProperty("user.dir") + "\\src\\test\\reource\\Drivers\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			} else {
				throw new Exception("Browser name id not valid");
			}

			return driver;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

	public static void getUrl(String url) throws Throwable {
		try {
			driver.get(url);
			driver.manage().window().maximize();
			//int implicitWait = FileReaderManager.getInstance().getConfigReader().getImplicitWait();
			//driver.manage().timeouts().implicitlyWait(implicitWait, TimeUnit.SECONDS);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();

		}
	}

	public static boolean elementDisplayed(WebElement element) {
		boolean displayed = false;
		try {
			displayed = element.isDisplayed();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();

		}
		return displayed;

	}

	public static boolean elementEnabled(WebElement element) {
		try {
			boolean enabled = element.isEnabled();
			return enabled;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();

		}
	}

	public static boolean elementSelected(WebElement element) {
		try {
			boolean selected = element.isSelected();
			return selected;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();

		}
	}

	public static void waituntilElementVisibility(WebElement element) {
		try {
			WebDriverWait wb = new WebDriverWait(driver, 50);
			wb.until(ExpectedConditions.visibilityOf(element));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

	public static void elementClear(WebElement element) {
		try {
			waituntilElementVisibility(element);
			if (elementDisplayed(element) && elementEnabled(element)) {
				element.clear();

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();

		}
	}

	public static void inputValuestoElement(WebElement element, String value) {
		try {
			waituntilElementVisibility(element);
			if (elementDisplayed(element) && elementEnabled(element)) {
				elementClear(element);
				element.sendKeys(value);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();

		}
	}

	public static void elementClick(WebElement element) {
		try {
			waituntilElementVisibility(element);
			element.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();

		}
	}

	public static String getElementText(WebElement element) {
		try {
			waituntilElementVisibility(element);
			String text = element.getText();
			return text;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();

		}
	}

	public static String getElementTextAttribute(WebElement element) {
		try {
			waituntilElementVisibility(element);
			String attribute = element.getAttribute("value");
			return attribute;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();

		}
	}

	public static String getTitle() {
		try {
			String title = driver.getTitle();
			return title;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();

		}
	}

	public static void selectValuesfromDD(WebElement element, String options, String value) {
		try {
			//waituntilElementVisibility(element);
			Select sc = new Select(element);
			if (options.equalsIgnoreCase("value")) {
				sc.selectByValue(value);
			} else if (options.equalsIgnoreCase("visibletext")) {
				sc.selectByVisibleText(value);
			} else if (options.equalsIgnoreCase("index")) {
				sc.selectByIndex(Integer.parseInt(value));
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();

		}
	}

	public static void movetoElement(WebElement element) {
		try {
			waituntilElementVisibility(element);
			Actions ac = new Actions(driver);
			ac.moveToElement(element).build().perform();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();

		}
	}

	public void dragAndDrop(WebElement source, WebElement target) {
		try {
			waituntilElementVisibility(source);
			Actions ac = new Actions(driver);
			ac.dragAndDrop(source, target).build().perform();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();

		}
	}

	public static void doubleClick(WebElement element) {
		try {
			waituntilElementVisibility(element);
			Actions ac = new Actions(driver);
			ac.doubleClick(element).build().perform();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();

		}
	}

	public static void contextClick(WebElement element) {
		try {
			waituntilElementVisibility(element);
			Actions ac = new Actions(driver);
			ac.contextClick(element).build().perform();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

	public static void elementClickusingActions(WebElement element) {
		try {
			waituntilElementVisibility(element);
			Actions ac = new Actions(driver);
			ac.click(element).build().perform();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();

		}
	}

	public static void elementinputValuesusingActions(WebElement element, String value) {
		try {
			waituntilElementVisibility(element);
			Actions ac = new Actions(driver);
			ac.sendKeys(element, value).build().perform();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();

		}
	}

	public void scrollUpandScrollDownusingElement(WebElement element) {
		try {
			waituntilElementVisibility(element);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", element);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();

		}
	}

	public static void scrollUpandDownusingCoordinates(String width, String height) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(" + width + "," + height + ")");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();

		}
	}

	public static File takeScreenShot(String fileName) throws IOException {
		try {
			File f = new File(System.getProperty("user.dir") + "\\Library\\" + fileName + ".png");
			TakesScreenshot ts = (TakesScreenshot) driver;
			File temp = ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(temp, f);
			return f;

		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();

		}
	}

	public static void scrolltoBottomPage() {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();

		}
	}

	public static void waitforAlertISPresent() {
		try {
			WebDriverWait wb = new WebDriverWait(driver, 50);
			wb.until(ExpectedConditions.alertIsPresent());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	
	
	



}
