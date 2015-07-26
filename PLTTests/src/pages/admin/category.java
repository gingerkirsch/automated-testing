package com.example.tests;

import org.junit.*;
import org.openqa.selenium.*;

public class Category extends commons.CommonCode{
  private WebDriver driver;
  private String baseUrl;

  @Test
  public void testCategory() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.linkText("Category")).click();
  }
}
