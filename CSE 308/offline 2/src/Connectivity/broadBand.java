package Connectivity;

import Connectivity.Connectivity;
public class broadBand implements Connectivity {
    public String name;
    public double modulePrice;

    broadBand(){
        name = "BroadBand";
        modulePrice = 0;
    }

    @Override
    public String getType() {
        return name;
    }

    @Override
    public double getPrice() {
        return modulePrice;
    }

    @Override
    public void serPrice(double price) {
        modulePrice = price;
    }
}
