import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {

    @Test
    public void loginEmptyEmailPassword() {

//      Added ChromeOptions argument below to fix websocket error
navigateToLoginPage();

        Assert.assertEquals(driver.getCurrentUrl(), url);
        driver.quit();
    }

    @Test
    public void loginValidEmailPassword (){
        //Pre-condition: Chrome browser should be opened

        // Step 1: Open Koel login page
    navigateToLoginPage();

        // Step 2: Enter existing username (email)
    provideEmail("daria.chebotnyagina@testpro.io");

        // Step 3: Enter correct password
    providePassword("Asdfasdf1");

        // Step 4: Click login button
    clickSubmit();

        WebElement avatar = driver.findElement(By.cssSelector("img[class='avatar']"));

        // Expected result
        Assert.assertTrue(avatar.isDisplayed());
        //driver.quit();
    }

    @Test
    //Negative test
    public void loginInvalidEmailValidPassword (){
        //Pre-condition: Chrome browser should be opened

        // Step 1: Open Koel login page
    navigateToLoginPage();

        // Step 2: Enter existing username (email)
    provideEmail("invalidemail@testpro.io");

        // Step 3: Enter correct password
    providePassword("Asdfasdf1");

        // Step 4: Click login button
    clickSubmit();

        WebElement avatar = driver.findElement(By.cssSelector("img[class='avatar']"));

        // Expected result
        Assert.assertTrue(avatar.isDisplayed());
        //driver.quit();
    }

    @Test
    //Negative test
    public void loginValidEmailNoPassword (){
        //Pre-condition: Chrome browser should be opened

        // Step 1: Open Koel login page
    navigateToLoginPage();

        // Step 2: Enter existing username (email)
    provideEmail("daria.chebotnyagina@testpro.io");

        // Step 3: Enter correct password
        //WebElement passwordField = driver.findElement(By.cssSelector("input[type='password']"));
        //passwordField.clear();
        //passwordField.sendKeys("Asdfasdf1");

        // Step 4: Click login button
    clickSubmit();

        WebElement avatar = driver.findElement(By.cssSelector("img[class='avatar']"));

        // Expected result
        Assert.assertTrue(avatar.isDisplayed());
        //driver.quit();
    }

}
