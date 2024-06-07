package lt.vcs.project_name.test.app_name;

import lt.vcs.project_name.page.app_name.RegistrationPage;
import lt.vcs.project_name.test.TestBase;
import org.testng.annotations.BeforeMethod;

public class RegistrationTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        RegistrationPage.open("some_url");
    }
}
