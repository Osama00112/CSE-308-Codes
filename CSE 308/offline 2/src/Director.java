import Connectivity.ConnectionFactory;
import System.IBuilder;

public class Director {
    IBuilder builder;
    ConnectionFactory cFactory = new ConnectionFactory();

    public void construct(IBuilder clientReq, String connectivity, int unitAMount){
        builder = clientReq;
        builder.buildUnit();
        builder.buildDisplay();
        builder.buildChannel(cFactory.getConnectivity(connectivity));
    }
}
