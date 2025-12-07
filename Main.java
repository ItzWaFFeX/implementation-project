interface Vehicle {
    void changeGear(int gear);
    void applyBrakes(int decrement);
    void speedUp(int incerment);
    void displaySpeed();
}

class Car implements Vehicle {
    private int speed;
    private int gear;

    public void changeGear(int gear) {
        this.gear = gear;
        this.speed = this.gear * 20;
    }

    public void applyBrakes(int decrement){
        speed -= decrement;
        if (speed < 0) speed = 0;
    }

    public void speedUp(int incerment) {
        speed += incerment;
    }

    public void displaySpeed() {
        System.out.println("Current speed"  +  speed  + "km/h");
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.changeGear(2);
        myCar.displaySpeed();

        myCar.applyBrakes(10);
        myCar.displaySpeed();

        myCar.speedUp(20);
        myCar.displaySpeed();
    }
}