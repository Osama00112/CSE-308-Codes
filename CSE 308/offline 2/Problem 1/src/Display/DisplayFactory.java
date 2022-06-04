package Display;

public class DisplayFactory {
    public Display getDisplay(String name){
        if (name == null){
            return null;
        }else if (name.equalsIgnoreCase("LED")){
            return new LED();
        }
        else if(name.equalsIgnoreCase("LCD")){
            return new LCD();
        }
        return null;
    }
}
