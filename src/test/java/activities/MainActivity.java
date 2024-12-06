package activities;

import controls.Button;
import controls.CheckBox;
import org.openqa.selenium.By;

public class MainActivity {
    public CheckBox termsAndConditionsCheckBox = new CheckBox(By.xpath("//android.widget.CheckBox"));
    public Button sipAccountButton = new Button(By.id("org.linphone:id/generic_connection"));
}
