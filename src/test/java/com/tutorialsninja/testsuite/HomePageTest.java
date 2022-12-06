package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.testbase.BaseTestClass;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTestClass {

    HomePage homePage = new HomePage();

    @Test

    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() {
        homePage.mouseHoverAndClickOnElement(By.linkText("Desktops"));
        homePage.selectMenu("Show All Desktops");
        String expectedMessage = "Desktops";
        Assert.assertEquals(homePage.verifyDesktopText(), expectedMessage, "Not on Desktop Page");
    }

    @Test
    public void verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully() {
        homePage.mouseHoverAndClickOnElement(By.linkText("Laptops & Notebooks"));
        homePage.selectMenu("Show All Laptops & Notebooks");
        String expectedMessage = "Laptops & Notebooks";
        Assert.assertEquals(homePage.verifyLaptopAndNotebookText(), expectedMessage, "Not on Laptops & Notebooks Page");
    }
    @Test
    public void verifyUserShouldNavigateToComponentsPageSuccessfully() {
        homePage.mouseHoverAndClickOnElement(By.linkText("Components"));
        homePage.selectMenu("Show All Components");
        String expectedMessage = "Components";
        Assert.assertEquals(homePage.verifyComponentsText(), expectedMessage, "Not on Components Page");
    }
}
