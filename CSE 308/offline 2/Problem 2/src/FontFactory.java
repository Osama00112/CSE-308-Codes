public class FontFactory {
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
