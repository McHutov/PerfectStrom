package Module2.lesson8.Task1;

public class Car {
    public Engine engine = new Engine();
    public Wheel[] wheels = new Wheel[4];
    public Door left = new Door();
    public Door right = new Door();
    public Passengers passenger = new Passengers();

    public Car(){
        for(int i = 0; i < 4; i++){
            wheels[i] = new Wheel();
        }
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.left.window.rollUp();
        car.wheels[0].inflate(72);
    }
    /*
        In this example connection between car and engine is composition since engine cannot exist in many cars at once,
        also connection between passengers and car is agregation since the in car can exist passenger A or B.
     */
}
