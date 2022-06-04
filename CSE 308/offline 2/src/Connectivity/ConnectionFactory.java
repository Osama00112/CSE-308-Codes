package Connectivity;

public class ConnectionFactory {
    public Connectivity getConnectivity(String name){
        if(name == null){
            return null;
        }else if(name.equalsIgnoreCase("BroadBand")){
            return new broadBand();
        }else if(name.equalsIgnoreCase("Mobile")){
            return new mobileData();
        }
        return null;
    }

}
