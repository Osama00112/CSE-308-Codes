package Units;
public class ArduinoMega implements mController {
    private String name;
    private double price;

    ArduinoMega(){
        name = "Arduino Mega";
        price = 1500;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
