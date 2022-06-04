package System;

public class SystemFactory {
    public IBuilder getBuilder(String name){
        if(name == null){
            return null;
        }else if(name.equalsIgnoreCase("Deluxe")){
            return new DeluxeBuilder();
        }else if(name.equalsIgnoreCase("Optimal")){
            return new OptimalBuilder();
        }else if(name.equalsIgnoreCase("Poor")){
            return new PoorBuilder();
        }
        return null;
    }
}
