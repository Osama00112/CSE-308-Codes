package System;

import Display.DisplayFactory;
import Display.Display;

public class PoorBuilder implements IBuilder {
    private Display type;
    private DisplayFactory factory = new DisplayFactory();
    private String SystemName;
    PoorBuilder(){
        SystemName = "Poor";
    }

    @Override
    public void buildDisplay() {
        type = factory.getDisplay("Display.LED");
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
