package System;

import Connectivity.Connectivity;

public class OptimalBuilder implements IBuilder {
    private final Product p;
    private final String SystemName;
    OptimalBuilder(){
        p = new Product();
        SystemName = "Optimal";
    }

    @Override
    public void buildDisplay() {
        p.addDisplay(factory.getDisplay("LED"));
    }
    @Override
    public void buildChannel(Connectivity channel) {
        p.addConnectivity(channel);
    }

    @Override
    public void buildUnit() {
        p.addUnit(mfactory.getController("Arduino"));
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
