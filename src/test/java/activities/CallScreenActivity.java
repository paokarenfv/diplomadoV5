package activities;

import controls.Button;
import controls.Label;
import org.openqa.selenium.By;

public class CallScreenActivity {
    public Label callTitleLabel = new Label(By.id("org.linphone:id/outgoing_call_title"));
    public Button hangUpButton = new Button(By.id("org.linphone:id/hangup"));
    public Label cellphoneNumberLabel = new Label(By.id("org.linphone:id/callee_name"));
}
