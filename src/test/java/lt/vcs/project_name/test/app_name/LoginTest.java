package lt.vcs.project_name.test.app_name;

import lt.vcs.project_name.page.app_name.LoginPage;
import lt.vcs.project_name.test.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        LoginPage.open("some_url");
    }

    @Test(groups = {"regression", "smoke"})
    public void testLoginWithValidData() {
        LoginPage.login("username", "password");
        // Add some test steps
        // Add assertion
    }

    @Test(groups = {"regression"})
    public void testLoginWithInvalidUserName() {
        LoginPage.login("username2", "password");
        // Add some test steps
        // Add assertion
    }

    @Test(groups = {"regression"})
    public void testLoginWithInvalidPassword() {
        LoginPage.login("username3", "password3");
        // Add some test steps
        // Add assertion
    }

    @Test(groups = {"regression"})
    public void testLoginWithInvalidUserNameAndPassword() {
        LoginPage.login("username4", "password4");
        // Add some test steps
        // Add assertion
    }
}
