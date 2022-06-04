package System;

import Connectivity.Connectivity;

public class PoorBuilder implements IBuilder {
    private final Product p;
    private final String SystemName;
    PoorBuilder(){
        p = new Product();
        SystemName = "Poor";
    }
    @Override
    public void buildDisplay() {
        //type = factory.getDisplay(display);
        p.addDisplay(factory.getDisplay("LED"));
    }

    @Override
    public void buildChannel(Connectivity channel) {
        p.addConnectivity(channel);
    }

    @Override
    public void buildUnit() {
        p.addUnit(mfactory.getController("RaspberryPi"));
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
}
