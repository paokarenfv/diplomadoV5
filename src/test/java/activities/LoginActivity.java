package activities;

import controls.Button;
import controls.RadioButton;
import controls.TextBox;
import org.openqa.selenium.By;

public class LoginActivity {
    public TextBox usernameTextBox = new TextBox(By.xpath("//android.widget.EditText[@text='Nombre de usuario']"));
    public TextBox passwordTextBox = new TextBox(By.xpath("//android.widget.EditText[@text='Contrase\u00F1a']"));
    public TextBox domainTextBox = new TextBox(By.xpath("//android.widget.EditText[@text='Dominio']"));
    public RadioButton tcpTransportRadioButton = new RadioButton(By.xpath("//android.widget.RadioButton[@text='TCP']"));
    public Button loginButton = new Button(By.xpath("//android.widget.TextView[@text='INGRESAR']"));
}
