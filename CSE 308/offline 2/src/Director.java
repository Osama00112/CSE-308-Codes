import Connectivity.ConnectionFactory;
import System.IBuilder;

public class Director {
    IBuilder builder;
    ConnectionFactory cFactory = new ConnectionFactory();

    public void construct(IBuilder clientReq, String connectivity, int unitAMount){
        clientReq.buildUnit();
        clientReq.buildDisplay();
        clientReq.buildChannel(cFactory.getConnectivity(connectivity));
    }
}
