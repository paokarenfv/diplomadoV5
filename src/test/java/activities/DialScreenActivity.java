package activities;

import controls.Button;
import controls.Label;
import controls.TextBox;
import org.openqa.selenium.By;

public class DialScreenActivity {
    public Label connectionStateLabel = new Label(By.xpath("//android.widget.TextView[@text='Conectado']"));
    public Button dialButton = new Button(By.xpath("//android.widget.ImageView[@content-desc='Marcador telef\u00F3nico']"));
    public TextBox cellphoneNumberTextBox = new TextBox(By.id("org.linphone:id/sip_uri_input"));
    public Button numberOneButton = new Button(By.xpath("//android.widget.ImageView[@content-desc='1']"));
    public Button numberTwoButton = new Button(By.xpath("//android.widget.ImageView[@content-desc='2']"));
    public Button numberThreeButton = new Button(By.xpath("//android.widget.ImageView[@content-desc='3']"));
    public Button numberFourButton = new Button(By.xpath("//android.widget.ImageView[@content-desc='4']"));
    public Button numberFiveButton = new Button(By.xpath("//android.widget.ImageView[@content-desc='5']"));
    public Button numberSixButton = new Button(By.xpath("//android.widget.ImageView[@content-desc='6']"));
    public Button numberSevenButton = new Button(By.xpath("//android.widget.ImageView[@content-desc='7']"));
    public Button numberEightButton = new Button(By.xpath("//android.widget.ImageView[@content-desc='8']"));
    public Button numberNineButton = new Button(By.xpath("//android.widget.ImageView[@content-desc='9']"));
    public Button numberZeroButton = new Button(By.xpath("//android.widget.ImageView[@content-desc='0']"));
    public Button callButton = new Button(By.xpath("//android.widget.ImageView[@content-desc='Iniciar una llamada']"));

}
