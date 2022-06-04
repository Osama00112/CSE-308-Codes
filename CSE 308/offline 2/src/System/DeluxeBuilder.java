package System;

import Connectivity.Connectivity;

public class DeluxeBuilder implements IBuilder {
    private final Product p;
    private final String SystemName;
    DeluxeBuilder(){
        p = new Product();
        SystemName = "Deluxe";
        //buildDisplay("LCD");
        //buildUnit("ATMega32");
    }

    @Override
    public void buildDisplay() {
        //type = factory.getDisplay(display);
        p.addDisplay(factory.getDisplay("LCD"));
    }

    @Override
    public void buildChannel(Connectivity channel) {
        p.addConnectivity(channel);
    }

    @Override
    public void buildUnit() {
        //this.unit = mfactory.getController(unit);
        p.addUnit(mfactory.getController("ATMega32"));
    }

    @Override
    public String getSystem(){
        return SystemName;
    }
    public Product getProduct() {
        return p;
    }

}
