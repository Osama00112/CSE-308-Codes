package Units;
public class mControllerFactory {
    public mController getController(String name){
        if(name == null)
            return null;
        else if(name.equalsIgnoreCase("ATMega32")){
            return new ATMega323();
        }
        else if(name.equalsIgnoreCase("Arduino")){
            return new ArduinoMega();
        }
        else if(name.equalsIgnoreCase("RaspberryPi")){
            return new RaspberryPi();
        }
        return null;
    }
}
