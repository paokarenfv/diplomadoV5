package singletonSession;

import factoryDevices.FactoryDevice;
import io.appium.java_client.AppiumDriver;

public class Session {
    private static Session session = null;
    private AppiumDriver device;

    private Session() {
        device = FactoryDevice.make("android").create();
    }

    public static Session getSession() {
        if (session == null) {
            session = new Session();
        }
        return session;
    }

    public void closeSession() {
        device.quit();
        session = null;
        System.out.println("Session closed");
    }

    public AppiumDriver getDevice() {
        return device;
    }
}
