/*
 * @author Anjali
 * @since 2016-06-13
 * This class maintains page elements for Registration page.
 */
package PageObjectModel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import WebDriver.driver;


public class registrationPageElements
{
	private static WebElement element = null;
	
	/*
	 * @return Link to the cretae account page
	 */
	public static WebElement gotoCreateAccountLink()
	{
		element = driver.Instance.findElement(constants.gotoCreateAccountLink);
		return element;
	}
	
	/*
	 * @return Username field in the registration page.
	 */
	public static WebElement username()
	{
		element = driver.Instance.findElement(constants.username);
		return element;
	}
	
	/*
	 * @return Password field on the registration page.
	 */
	public static WebElement password()
	{
		element = driver.Instance.findElement(constants.signUpPassword);
		return element;
	}
	
	/*
	 * @return Host Country field on the registration page.
	 */
	public static WebElement hostCountry()
	{
		element = driver.Instance.findElement(constants.country);
		return element;
	}
	
	/*
	 * @return Email Id field in the registration page.
	 */
	public static WebElement emaiId()
	{
		element = driver.Instance.findElement(constants.signUpEmailId);
		return element;
	}

	/*
	 * @return confirm password field on the registration page.
	 */
	public static WebElement confirmPassword()
	{
		element = driver.Instance.findElement(constants.confirmPassword);
		return element;
	}
	
	/*
	 * @return Create Account button on the registration page.
	 */
	public static WebElement signUpButton()
	{
		element = driver.Instance.findElement(constants.signUpButton);
		return element;
	}

	/*
	 * @return country list dropdown
	 */
	public static WebElement countryListDropDown()
	{
		element = driver.Instance.findElement(constants.countryListDropDown);
		return element;
	}

	/*
	 * @return country option in dropdown
	 */
	public static WebElement countryOptionInDropdown(String countryName)
	{
		By countryOptionInDropdown = By.xpath(".//div[contains(@class, 'menu transition visible')]/div[text()=\"" + countryName +"\"]");
		element = driver.Instance.findElement(countryOptionInDropdown);
		return element;
	}

	/*
	 * @return Account created successfully sweet alert
	 */
	public static WebElement successfulRegistrationAlert()
	{
		element = driver.Instance.findElement(constants.successfulRegistrationAlert);
		return element;
	}
}
