package lt.vcs.project_name.page.app_name;

import lt.vcs.project_name.page.Common;

public class LoginPage {
    public static void open(String url) {
        Common.setUpChrome();
        Common.openUrl(url);
    }

    public static void login(String username, String password) {
        // Do registration
    }
}
