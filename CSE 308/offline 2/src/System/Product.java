package System;

import Connectivity.Connectivity;
import Display.Display;
import Units.mController;

import java.util.LinkedList;

public class Product {
    private mController unit;
    private Display display;
    private Connectivity channel;
    private double price;
    private int amount;

    public Product(){
        unit = null;
        display = null;
        channel = null;
        price = 0;
        amount = 0;
    }

    public void addUnit(mController unit){
        this.unit = unit;
        price += unit.getPrice();
    }
    public void addDisplay(Display display){
        this.display = display;
        price += display.getPrice();
    }
    public void addAmount(int amount){ this.amount = amount; }
    public void addConnectivity(Connectivity channel){
        this.channel = channel;
        price += channel.getPrice();
    }
    public double singleUnitPrice(){
        return unit.getPrice() + display.getPrice() + channel.getPrice();
    }
    public double totalPrice(){
        return (amount * singleUnitPrice());
    }

    public void show(){
        System.out.println("Product Details:\n" +
                "mController : " + unit.getName()+ "\n" +
                "Display : " + display.getName()+ "\n"+
                "Connectivity : " + channel.getType()+ "\n"+
                "SingleUnit Price : " + singleUnitPrice()+ "\n"+
                "Total amount : " + amount + "\n"+
                "Total Price : " + totalPrice() + "\n");
    }

    //private LinkedList<>
}
