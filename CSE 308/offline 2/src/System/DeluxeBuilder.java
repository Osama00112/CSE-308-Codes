package System;

import Display.DisplayFactory;
import Display.Display;

public class DeluxeBuilder implements IBuilder {
    private Display type;
    private DisplayFactory factory = new DisplayFactory();
    private String SystemName;
    DeluxeBuilder(){
        SystemName = "Deluxe";
    }

    @Override
    public void buildDisplay() {
        type = factory.getDisplay("Display.LCD");
    }

//    @Override
//    public void buildChannel(String name) {
//
//    }

    @Override
    public String getSystem(){
        return SystemName;
    }
}
