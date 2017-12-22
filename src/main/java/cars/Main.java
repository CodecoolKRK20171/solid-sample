package cars;

public class Main {
    public static void main(String[] args) {
        EngineFactory ef = new EngineFactory();

        BadCar car1 = new BadCar("Skoda Fabia",
                "black",
                2008,
                ef.getEngine("diesel"));


        BadCar car2 = new BadCar("Daewoo Tico",
                "silver",
                2000,
                ef.getEngine("gas"));


        car1.start();
        car2.start();
    }
}
