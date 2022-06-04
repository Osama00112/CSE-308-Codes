package Connectivity;

import Connectivity.Connectivity;

public class mobileData implements Connectivity {
    public String name;
    public double SIMPrice;

    mobileData(){
        name = "Mobile";
        SIMPrice = 75;
    }

    @Override
    public String getType() {
        return name;
    }

    @Override
    public double getPrice() {
        return SIMPrice;
    }

    @Override
    public void serPrice(double price) {
        SIMPrice = price;
    }
}
