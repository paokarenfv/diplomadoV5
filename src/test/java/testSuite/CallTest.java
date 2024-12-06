package testSuite;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CallTest extends BaseTest{
    @BeforeTest
    public void login(){
        mainActivity.termsAndConditionsCheckBox.click();
        mainActivity.sipAccountButton.click();

        noticeActivity.understandButton.click();

        loginActivity.usernameTextBox.setText("+59150201005");
        loginActivity.passwordTextBox.setText("Paola2024");
        loginActivity.domainTextBox.setText("vozip.entel.bo");
        loginActivity.tcpTransportRadioButton.click();
        loginActivity.loginButton.click();
    }

    @Test(description = "Realizar una llamada ingresando un numero de telefono")
    public void callWithPhoneNumber() throws InterruptedException{

        SoftAssert softAssert = new SoftAssert();

        dialScreenActivity.dialButton.click();

        dialScreenActivity.numberSevenButton.click();
        dialScreenActivity.numberSevenButton.click();
        dialScreenActivity.numberSevenButton.click();
        dialScreenActivity.numberEightButton.click();
        dialScreenActivity.numberTwoButton.click();
        dialScreenActivity.numberSixButton.click();
        dialScreenActivity.numberThreeButton.click();
        dialScreenActivity.numberThreeButton.click();

        dialScreenActivity.callButton.click();

        Thread.sleep(12000);

        softAssert.assertTrue(callScreenActivity.callTitleLabel.isControlDisplayed());
        softAssert.assertTrue(callScreenActivity.cellphoneNumberLabel.isControlDisplayed());
        softAssert.assertAll();

        callScreenActivity.hangUpButton.click();
    }

    @Test(description = "Realizar una llamada seleccionando un contacto de la lista")
    public void callWithContact() throws InterruptedException {

        String contactName = "Prueba";

        SoftAssert softAssert = new SoftAssert();

        contactListScreenActivity.contactListButton.click();
        contactListScreenActivity.getContactButton(contactName).click();

        contactScreenActivity.callButton.click();

        Thread.sleep(12000);

        softAssert.assertTrue(callScreenActivity.callTitleLabel.isControlDisplayed());
        softAssert.assertTrue(callScreenActivity.cellphoneNumberLabel.isControlDisplayed());
        softAssert.assertAll();

        callScreenActivity.hangUpButton.click();
    }
}
