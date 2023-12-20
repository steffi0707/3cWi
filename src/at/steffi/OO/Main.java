package at.steffi.OO;

public class Main {
    public static void main(String[] args) {

        Engine e1 = new Engine(140, Engine.TYPE.DIESEL);
        Engine e2 = new Engine(250, Engine.TYPE.GAS);
        Engine e3 = new Engine(310, Engine.TYPE.DIESEL);

        Tank tank1 = new Tank(100,40,"alu");

        RearMirror r1 = new RearMirror(100, 0);
        RearMirror r2 = new RearMirror(90, -40);

        Car c1 = new Car(e1, 4, "Audi", "A1234", tank1, 3, "red");
        Car c2 = new Car(e2, 12, "Mercedes", "M1234",  tank1, 4,"green");
        Car c3 = new Car(e3, 5, "Opel", "O1234", tank1, 6, "blue");

        //Car 1
        System.out.println(c1.serialNumber);
        c1.Break();
        c1.turboBoost();
        c1.honk(c1.amountOfRepetitions);
        c1.addMirror(r1);
        c1.addMirror(r2);

        System.out.println(c1.getMirrors().get(0).getPosition());

        //Car 2
        System.out.println(c2.getTank().getFuelAmount());
        c2.drive();
        System.out.println(c2.serialNumber);
        c2.getRemainingRange();

        //Car 3
        System.out.println(c3.serialNumber);


    }
}
