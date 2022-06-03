package System;

import Display.DisplayFactory;
import Display.Display;

public class OptimalBuilder implements IBuilder {
    private Display type;
    private DisplayFactory factory = new DisplayFactory();
    private String SystemName;
    OptimalBuilder(){
        SystemName = "Optimal";
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
