package at.steffi.OO.Lamp;


public class Main {
    public static void main(String[] args) {

        Lamp lamp = new Lamp();

        LightElement l1 = new LightElement("1", "yellow");
        LightElement l2 = new LightElement("2", "red");
        LightElement l3 = new LightElement("3", "pink");

        lamp.addLightElement(l1);
        lamp.addLightElement(l2);
        lamp.addLightElement(l3);

        System.out.println(lamp.getOverallPowerUsage());
        lamp.turnAllOn();
        System.out.println(lamp.getOverallPowerUsage());
        lamp.turnAllOn();
        lamp.printNamesOfLightElements();

    }
}
