package controls;

import org.openqa.selenium.By;

public class TextBox extends Control {
    public TextBox(By locator) {
        super(locator);
    }

    public void setText(String value) {
        this.findControl();
        this.control.sendKeys(value);
    }

    public void clearText(String value) {
        this.findControl();
        this.control.clear();
        this.control.sendKeys(value);
    }
}