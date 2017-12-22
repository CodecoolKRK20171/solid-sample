package cars;

public class BadCar {

    private String model;
    private String color;
    private int productionYear;
    private Engine engine;

    public BadCar(String model, String color, int productionYear, Engine engine) {
        this.model = model;
        this.color = color;
        this.productionYear = productionYear;
        this.engine = engine;
    }

    public void start(){
        engine.start();
    }
}
