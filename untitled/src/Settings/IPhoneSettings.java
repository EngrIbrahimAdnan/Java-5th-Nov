package Settings;

public class IPhoneSettings {
    private static IPhoneSettings instance;
    private int brightness;
    private boolean Wifi;
    private int Volume;

    private IPhoneSettings(int brightness, boolean Wifi, int Volume) {
        this.brightness = brightness;
        this.Wifi = Wifi;
        this.Volume = Volume;
    }

    public static IPhoneSettings getInstance(int brightness, boolean Wifi, int Volume) {
        if (instance == null) {
            synchronized (IPhoneSettings.class) {
                if (instance == null) {  // Second check (with locking)
                    instance = new IPhoneSettings(brightness, Wifi, Volume);
                }
            }
        }
        return instance;
    }

    public void setBrightness(int NewBrightness) {
        this.brightness = NewBrightness;
    }

    public int getBrightness() {
        return this.brightness;
    }

    public void enableWiFi() {
        this.Wifi = true;
    }

    public void disableWiFi() {
        this.Wifi = false;
    }

    public void setVolume(int Volume) {
        this.Volume = Volume;
    }

    public int getVolume() {
        return this.Volume;
    }

    @Override
    public String toString() {
        return "brightness Value:" + brightness +
                ", Wifi Status:" + Wifi +
                ", Volume: " + Volume;
    }
}
