import java.util.Scanner;

interface smartDevices {
    void setDeviceName(String name);

    String getDeviceName();

    void turnOn();

    void turnOff();
}

class smartLight implements smartDevices {
    private String name;
    boolean isOn = false;

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
        if (!isOn) {
            isOn = true;
            System.out.println("The Light is turned on!");
        } else {
            System.out.println("The Light is already on!");
        }
    }

    @Override
    public void turnOff() {
        if (isOn) {
            isOn = false;
            System.out.println("The Light is turned off!");
        } else {
            System.out.println("The Light is already off!");
        }
    }
}

class smartThermostat implements smartDevices {
    private String name;
    boolean isOn = false;

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
        if (!isOn) {
            isOn = true;
            System.out.println("Turned on the Thermostat!");
        } else {
            System.out.println("The Thermostat is already on!");
        }
    }

    @Override
    public void turnOff() {
        if (isOn) {
            isOn = false;
            System.out.println("Turned off the Thermostat!");
        } else {
            System.out.println("The Thermostat is already off!");
        }
    }
}

class smartFan implements smartDevices {
    private String name;
    boolean isOn = false;

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
        if (!isOn) {
            isOn = true;
            System.out.println("Turned on the Fan!");
        } else {
            System.out.println("The Fan is already on!");
        }
    }

    @Override
    public void turnOff() {
        if (isOn) {
            isOn = false;
            System.out.println("Turned off the Fan!");
        } else {
            System.out.println("The Fan is already off!");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        smartDevices light = new smartLight();
        smartDevices fan = new smartFan();
        smartDevices thermostat = new smartThermostat();
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Functionalities of Light");
            System.out.println("2. Functionalities of Fan");
            System.out.println("3. Functionalities of Thermostat");
            System.out.println("4. Exit");
            System.out.print("Enter Your Choice: ");
            int choice = input.nextInt();

            if (choice == 4) {
                System.out.println("Exiting program...");
                break;
            }

            System.out.println("1. Set Device Name");
            System.out.println("2. Turn On the Device");
            System.out.println("3. Turn Off the Device");
            System.out.print("What Function do you want to Perform? : ");
            int newChoice = input.nextInt();

            switch (choice) {
                case 1: // Light functionalities
                    switch (newChoice) {
                        case 1:
                            light.setDeviceName("Schneider Electric");
                            System.out.println("Device Make: " + light.getDeviceName());
                            break;
                        case 2:
                            light.turnOn();
                            break;
                        case 3:
                            light.turnOff();
                            break;
                        default:
                            System.out.println("Invalid option.");
                    }
                    break;

                case 2: // Fan functionalities
                    switch (newChoice) {
                        case 1:
                            fan.setDeviceName("Siemens");
                            System.out.println("Device Make: " + fan.getDeviceName());
                            break;
                        case 2:
                            fan.turnOn();
                            break;
                        case 3:
                            fan.turnOff();
                            break;
                        default:
                            System.out.println("Invalid option.");
                    }
                    break;

                case 3: // Thermostat functionalities
                    switch (newChoice) {
                        case 1:
                            thermostat.setDeviceName("Nest");
                            System.out.println("Device Make: " + thermostat.getDeviceName());
                            break;
                        case 2:
                            thermostat.turnOn();
                            break;
                        case 3:
                            thermostat.turnOff();
                            break;
                        default:
                            System.out.println("Invalid option.");
                    }
                    break;

                default:
                    System.out.println("Invalid device choice.");
            }
        }

        input.close();
    }
}
