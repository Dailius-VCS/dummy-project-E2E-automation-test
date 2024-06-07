package lt.vcs.project_name.test.app_name;

import lt.vcs.project_name.page.app_name.LoginPage;
import lt.vcs.project_name.page.app_name.RegistrationPage;
import lt.vcs.project_name.test.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        LoginPage.open("some_url");
    }
}
