package System;

import Connectivity.Connectivity;
import Display.DisplayFactory;
import Units.mController;
import Units.mControllerFactory;

public interface IBuilder {
    DisplayFactory factory = new DisplayFactory();
    mControllerFactory mFactory = new mControllerFactory();
    void buildDisplay();
    void buildChannel(Connectivity channel);
    void buildUnit();

    Product getProduct();
    String getSystem();

    void buildAmount(int amount);
}
