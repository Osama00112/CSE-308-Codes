package System;

import Connectivity.Connectivity;

public class DeluxeBuilder implements IBuilder {
    private final Product p;
    private final String SystemName;
    DeluxeBuilder(){
        p = new Product();
        SystemName = "Deluxe";
    }

    @Override
    public void buildDisplay() {
        p.addDisplay(factory.getDisplay("LCD"));
    }

    @Override
    public void buildChannel(Connectivity channel) {
        p.addConnectivity(channel);
    }

    @Override
    public void buildUnit() {
        p.addUnit(mFactory.getController("RaspberryPi"));
    }

    @Override
    public String getSystem(){
        return SystemName;
    }

    @Override
    public void buildAmount(int amount) {
        p.addAmount(amount);
    }

    public Product getProduct() {
        return p;
    }

//    public double getHardwarePrice(){
//
//    }

}
