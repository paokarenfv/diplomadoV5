package activities;

import controls.Button;
import controls.Label;
import org.openqa.selenium.By;

public class ContactScreenActivity {
    public Label getContactName(String contactName) {
        return new Label(By.xpath("(//android.widget.TextView[@text='"+contactName+"'])[3]"));
    }

    public Button callButton = new Button(By.xpath("//android.widget.ImageView[@content-desc='Iniciar una llamada']"));
}
