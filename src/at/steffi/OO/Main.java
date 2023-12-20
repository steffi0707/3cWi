package at.steffi.OO;

public class Main {
    public static void main(String[] args) {

        Engine e1 = new Engine(140, Engine.TYPE.DIESEL);
        Engine e2 = new Engine(250, Engine.TYPE.GAS);
        Engine e3 = new Engine(310, Engine.TYPE.DIESEL);

        Tank tank1 = new Tank(100,40,"Alu");
        Tank tank2 = new Tank(95, 30, "Alu");
        Tank tank3 = new Tank(90, 35, "Alu");

        Wheel w1 = new Wheel(50, 12);
        Wheel w2 = new Wheel(50, 42);
        Wheel w3 = new Wheel(50, -12);
        Wheel w4 = new Wheel(50, -42);

        RearMirror r1 = new RearMirror(100, 0);
        RearMirror r2 = new RearMirror(90, -40);

        Car c1 = new Car(e1, 4, "Audi", "A1234", tank1, 3, "red");
        Car c2 = new Car(e2, 12, "Mercedes", "M1234",  tank2, 4,"green");
        Car c3 = new Car(e3, 5, "Opel", "O1234", tank3, 6, "blue");

        //Car 1
        System.out.println(c1.getSerialNumber());
        c1.drive();
        c1.Break();
        c1.turboBoost();
        c1.honk(c1.getAmountOfRepetitions());
        c1.addMirror(r1);
        c1.addMirror(r2);
        c1.addWheel(w1);
        c1.addWheel(w2);
        c1.addWheel(w3);
        c1.addWheel(w4);

        System.out.println(c1.getMirrors().get(0).getPosition());
        System.out.println(c1.getWheels().get(0).getPosition());

        //Car 2
        System.out.println(c2.getTank().getFuelAmount());
        c2.drive();
        System.out.println(c2.getSerialNumber());
        c2.getRemainingRange();

        //Car 3
        System.out.println(c3.getSerialNumber());


    }
}
