public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("Parser"))
            return new parserFactory();
        else if(choice.equalsIgnoreCase("Font"))
            return new FontFactory();
        return null;
    }
}
