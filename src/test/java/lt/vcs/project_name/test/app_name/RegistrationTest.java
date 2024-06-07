package lt.vcs.project_name.test.app_name;

import lt.vcs.project_name.page.app_name.RegistrationPage;
import lt.vcs.project_name.test.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegistrationTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        RegistrationPage.open("some_url");
    }

    @Test(groups = {"regression", "smoke"})
    public void testRegistration() {
        RegistrationPage.register("username", "password");
        // Add some test steps
        // Add assertion
    }

    @Test(groups = {"regression"})
    public void testRegistrationWithInvalidUserName() {
        RegistrationPage.register("username2", "password");
        // Add some test steps
        // Add assertion
    }

    @Test(groups = {"regression"})
    public void testRegistrationWithInvalidPassword() {
        RegistrationPage.register("username3", "password3");
        // Add some test steps
        // Add assertion
    }

    @Test(groups = {"regression"})
    public void testRegistrationWithInvalidUserNameAndPassword() {
        RegistrationPage.register("username4", "password4");
        // Add some test steps
        // Add assertion
    }
}
