package lt.vcs.project_name.test.app_name;

import lt.vcs.project_name.page.app_name.SearchPage;
import lt.vcs.project_name.test.TestBase;
import org.testng.annotations.BeforeMethod;

public class SearchTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        SearchPage.open("https://www.google.com");
    }
}
