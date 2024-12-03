import java.util.Scanner;

interface smartDevices{
    void setDeviceName(String name);
    String getDeviceName();
    void turnOn();
    void turnOff();
}

class smartLight implements smartDevices{
    private String name;
    boolean isOn = true;

    @Override
    public void setDeviceName(String name) {
        this.name = name;
    }

    @Override
    public String getDeviceName() {
        return name;
    }

    @Override
    public void turnOn() {
        if (isOn){
            System.out.println("The Light is turned on!");
        }
    }

    @Override
    public void turnOff() {
        if (!isOn){
            System.out.println("Turned Off the Light!");
        }
    }
}

class smartThermostat implements smartDevices{

    private String name;
    boolean isOn = true;

    @Override
    public void setDeviceName(String name) {
        this.name = name;
    }

    @Override
    public String getDeviceName() {
        return name;
    }

    @Override
    public void turnOn() {
        if (isOn){
            System.out.println("Turned on The Thermostate!");
        }
    }

    @Override
    public void turnOff() {
        if (!isOn){
            System.out.println("Turned of The thermostate!");
        }

    }
}
class smartFan implements smartDevices{

    private String name;
    boolean isOn = true;

    @Override
    public void setDeviceName(String name) {
        this.name = name;
    }

    @Override
    public String getDeviceName() {
        return name;
    }
    
    @Override
    public void turnOn() {
        if (isOn){
            System.out.println("Turned on the Fan!");
        }
    }

    @Override
    public void turnOff() {
        if (!isOn){
            System.out.println("Turned off The Fan");
        }
    }
}

public class Main {
    public static void main(String[] args) {

        smartDevices light = new smartLight();
        smartDevices fan = new smartFan();
        smartDevices thermostat = new smartThermostat();
        Scanner input = new Scanner(System.in);
        Scanner newInput = new Scanner(System.in);

        while (true){
            System.out.println("1. Functionalities of Light");
            System.out.println("2. Functionalities of Fan");
            System.out.println("3. Functionalities of Thermostat");

            System.out.print("Enter Your Choice: ");
            int choice = input.nextInt();
            int newChoice = newInput.nextInt();
            switch (choice){
                case 1:
                    System.out.println("What Function do you want to Perform? : ");
                    System.out.println("1. Device Make");
                    System.out.println("2. Turn on the device");
                    System.out.println("3. Turn off the device");

                    switch (newChoice){
                        case 1:
                            light.setDeviceName("Schneider Electric");
                            light.getDeviceName();
                            break;

                        case 2:
                            light.turnOn();
                            break;

                        case 3:
                            light.turnOff();
                    }
                    break;

                case 2:
                    System.out.println("1. Device Make");
                    System.out.println("2. Turn on the device");
                    System.out.println("3. Turn off the device");
                    System.out.print("What Function do you want to Perform? : ");

                            switch (newChoice){
                                case 1:
                                    fan.setDeviceName("Siemens");
                                    fan.getDeviceName();
                                    break;

                                case 2:
                                    fan.turnOn();
                                    break;

                                case 3:
                                    fan.turnOff();
                            }
                            break;

                case 3:
                            System.out.println("What Function do you want to Perform? : ");
                            System.out.println("1. Device Make");
                            System.out.println("2. Turn on the device");
                            System.out.println("3. Turn off the device");

                            switch (newChoice){
                                case 1:
                                    thermostat.setDeviceName("Schneider Electric");
                                    thermostat.getDeviceName();
                                    break;

                                case 2:
                                    thermostat.turnOn();
                                    break;

                                case 3:
                                    thermostat.turnOff();
                            }
                            break;
            }
        }

    }
}