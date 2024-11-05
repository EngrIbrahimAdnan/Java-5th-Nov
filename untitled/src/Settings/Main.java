package Settings;

public class Main{
    public static void main(String[] args) {
        //Let's make an instance with the values 80, true and 90 for brightness, WIFI status and Volume, respectively.
        IPhoneSettings newIphone = IPhoneSettings.getInstance(80, true, 90);

        //let's try making another variable of type IPhoneSettings with values of 55, false and 0
        IPhoneSettings newIphone2 = IPhoneSettings.getInstance(55, false, 0);

        //we will notice that the values 55, false and 0 are ignored since the instance is already created with variable newIphone
        System.out.println(newIphone2.toString());//same values
        System.out.println(newIphone.toString());// as newIphone2

        //Now lets set our desired values for brightness and Wifi status the proper way using singleton method with our new vairable newIphone2
        newIphone2.setBrightness(55);
        newIphone2.disableWiFi();
        newIphone2.setVolume(0);

        //We will see both variables are updated
        System.out.println(newIphone2.toString());
        System.out.println(newIphone.toString());

        //Let's change the values one last time with the first variable
        newIphone.setBrightness(100);
        newIphone.enableWiFi();
        newIphone.setVolume(100);

        //Finally, lets print the updates with both variables
        System.out.println(newIphone2.toString());
        System.out.println(newIphone.toString());
    }
}
