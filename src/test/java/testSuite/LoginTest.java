package testSuite;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test( description = "Login test")
    public void loginTest() {
        mainActivity.termsAndConditionsCheckBox.click();
        mainActivity.sipAccountButton.click();

        noticeActivity.understandButton.click();

        loginActivity.usernameTextBox.setText("+59150201005");
        loginActivity.passwordTextBox.setText("Paola2024");
        loginActivity.domainTextBox.setText("vozip.entel.bo");
        loginActivity.tcpTransportRadioButton.click();
        loginActivity.loginButton.click();

        String expected = dialScreenActivity.connectionStateLabel.getText();

        Assert.assertEquals(expected, "Conectado");
    }
}
