public class FontFactory extends AbstractFactory {
    @Override
    public Parser getParser(String name) {
        return null;
    }

    public Fonts getFont(String name){
        if (name == null){
            return null;
        }
        else if(name.equalsIgnoreCase("Courier")){
            return new CourierNew();
        }
        else if(name.equalsIgnoreCase("Monaco")){
            return new Monaco();
        }
        else if(name.equalsIgnoreCase("Consolas")){
            return new Consolas();
        }
        return null;
    }
}
