package queueModelingLab;

public class Request {
    private int id;
    private double arriveTime;
    private double serviceTime;

    public Request(int id, double arriveTime, double serviceTime) {
        this.id = id;
        this.arriveTime = arriveTime;
        this.serviceTime = serviceTime;
    }

    public int getId() {
        return id;
    }

    public double getArriveTime() {
        return arriveTime;
    }

    public double getServiceTime() {
        return serviceTime;
    }
}
