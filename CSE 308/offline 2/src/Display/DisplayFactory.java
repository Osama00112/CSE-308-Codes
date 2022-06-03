package Display;

public class DisplayFactory {
    public Display getDisplay(String name){
        if (name == null){
            return null;
        }else if (name.equalsIgnoreCase("Display.LED")){
            return new LED();
        }
        else if(name.equalsIgnoreCase("Display.LCD")){
            return new LCD();
        }
        return null;
    }
}
