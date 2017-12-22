package cars;

public class EngineFactory {

    public Engine getEngine(String type) throws IllegalArgumentException{
        switch (type){
            case "diesel":
                return new DieselEngine();
            case "gas":
                return new GasEngine();
            default:
                throw new IllegalArgumentException();
        }
    }
}
