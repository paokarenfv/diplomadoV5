package activities;

import controls.Button;
import org.openqa.selenium.By;

public class ContactListScreenActivity {
    public Button contactListButton = new Button(By.xpath("//android.widget.ImageView[@content-desc='Contactos']"));

    public Button getContactButton(String contactName) {
        return new Button(By.xpath("//android.widget.TextView[@resource-id='org.linphone:id/name' and @text='"+contactName+"']"));
    }
}

