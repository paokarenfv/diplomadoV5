package factoryDevices;

public class FactoryDevice{
    public static IDevices make(String deviceType) {
        IDevices device = null;
        switch (deviceType.toLowerCase()) {
            case "android":
                device = new Android();
                break;

            default:
                break;
        }
        return device;
    }
}
