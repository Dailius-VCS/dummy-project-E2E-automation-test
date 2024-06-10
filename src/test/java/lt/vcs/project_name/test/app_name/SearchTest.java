package lt.vcs.project_name.test.app_name;

import lt.vcs.project_name.page.app_name.SearchPage;
import lt.vcs.project_name.test.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        SearchPage.open("https://www.google.com");
    }

    @Test(groups = {"smoke", "regression"})
    public void testSearchWithValidData() {
        SearchPage.search();
        // More test steps
        // Asserts
    }

    @Test (groups = {"regression"})
    public void testSearchWithInvalidDataSomeDataA() {
        SearchPage.search();
        // More test steps
        // Asserts
    }

    @Test (groups = {"regression"})
    public void testSearchWithInvalidDataSomeDataB() {
        SearchPage.search();
        // More test steps
        // Asserts
    }

    @Test (groups = {"regression"})
    public void testSearchWithInvalidDataSomeDataC() {
        SearchPage.search();
        // More test steps
        // Asserts
    }
}
