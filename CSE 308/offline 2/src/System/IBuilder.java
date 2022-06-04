package System;

import Connectivity.Connectivity;
import Display.DisplayFactory;
import Units.mController;
import Units.mControllerFactory;

public interface IBuilder {
    DisplayFactory factory = new DisplayFactory();
    mControllerFactory mfactory = new mControllerFactory();
    void buildDisplay();
    void buildChannel(Connectivity channel);
    void buildUnit();

    Product getProduct();
    String getSystem();
}
