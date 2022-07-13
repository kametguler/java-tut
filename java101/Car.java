public class Car {
    String type = "Sedan";
    String model;
    String color;
    int speed;
    int speedLimit = 180;

    // constructor

    public Car() {
        color = "Mavi";
        model = "No model";
        speed = 35;
    }

    public void increaseSpeed(int increment) {
        if ((speed + increment) < speedLimit) {
            speed += increment;
        }
    }

    public void decreaseSpeed(int decrease) {
        if (speed > 0 && !(speed - decrease < 0)) {
            speed -= decrease;
        } else {
            speed = 0;
        }
    }

    public void printSpeed() {
        System.out.println("Hızınız: " + speed);
    }
}