package com.example.tests;

import org.junit.*;
import org.openqa.selenium.*;

public class ForgotPassword extends commons.commonCode{
  private WebDriver driver;
  private String baseUrl;

  @Test
  public void testForgotPassword() throws Exception {
    driver.get(baseUrl + "/users/sign_in");
    driver.findElement(By.linkText("Forgot your password?")).click();
  }
}
