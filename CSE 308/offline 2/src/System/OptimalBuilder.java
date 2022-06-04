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
        //type = factory.getDisplay(display);
        p.addDisplay(factory.getDisplay("LED"));
    }

    @Override
    public void buildChannel(Connectivity channel) {
        p.addConnectivity(channel);
    }

    @Override
    public void buildUnit() {
        //this.unit = mfactory.getController(unit);
        p.addUnit(mfactory.getController("Arduino"));
    }

    @Override
    public String getSystem(){
        return SystemName;
    }
    public Product getProduct() {
        return p;
    }
}
