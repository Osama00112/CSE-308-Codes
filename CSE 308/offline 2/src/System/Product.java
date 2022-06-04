package System;

import Connectivity.Connectivity;
import Display.Display;
import Units.mController;

import java.util.LinkedList;

public class Product {
    private mController unit;
    private Display display;
    private Connectivity channel;

    public Product(){
        unit = null;
        display = null;
        channel = null;
    }

    public void addUnit(mController unit){
        this.unit = unit;
    }
    public void addDisplay(Display display){
        this.display = display;
    }

    public void addConnectivity(Connectivity channel){
        this.channel = channel;
    }

    public void show(){
        System.out.println("Product Details:\n" +
                "mController : " + unit.getName()+ "\n" +
                "Display : " + display.getName()+ "\n"+
                "Connectivity : " + channel.getType());
    }

    //private LinkedList<>
}
