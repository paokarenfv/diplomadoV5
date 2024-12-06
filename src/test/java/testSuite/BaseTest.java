package testSuite;

import activities.*;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import singletonSession.Session;

public class BaseTest {
    public MainActivity mainActivity;
    public NoticeActivity noticeActivity;
    public LoginActivity loginActivity;
    public CallScreenActivity callScreenActivity;
    public ContactScreenActivity contactScreenActivity;
    public DialScreenActivity dialScreenActivity;
    public ContactListScreenActivity contactListScreenActivity;

    @BeforeTest
    public void openApp(){
        mainActivity = new MainActivity();
        noticeActivity = new NoticeActivity();
        loginActivity = new LoginActivity();
        callScreenActivity = new CallScreenActivity();
        contactScreenActivity = new ContactScreenActivity();
        dialScreenActivity = new DialScreenActivity();
        contactListScreenActivity = new ContactListScreenActivity();
    }
    @AfterTest
    public void closeApp(){
        Session.getSession().closeSession();
    }
}
