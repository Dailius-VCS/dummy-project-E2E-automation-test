package lt.vcs.project_name.test;


import lt.vcs.project_name.page.Common;
import lt.vcs.project_name.util.TestListener;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

@Listeners(TestListener.class)
public abstract class TestBase {
    @BeforeMethod
    public abstract void setUp();

    @AfterMethod
    public void tearDown(){
        Common.quitChromeDriver();
    }
}
