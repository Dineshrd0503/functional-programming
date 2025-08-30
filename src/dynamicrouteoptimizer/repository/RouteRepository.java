package dynamicrouteoptimizer.repository;

import dynamicrouteoptimizer.model.Delivery;
import dynamicrouteoptimizer.model.TrafficData;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RouteRepository {
    private List<Delivery> deliveries=new ArrayList<>();
    private List<TrafficData> trafficData=new ArrayList<>();
    public void addTrafficData(TrafficData data){
        trafficData.add(data);
    }
    public void addDelivery(Delivery delivery){
        deliveries.add(delivery);
    }
    public List<Delivery> getDeliveries(){
        return new ArrayList<>(deliveries);
    }
    public List<TrafficData> getTrafficData(){
        return trafficData
                .stream()
                .filter(t->t.getDelayMinutes()>0)
                .collect(Collectors.toList());
    }

}
