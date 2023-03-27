package activities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Plane{
    private List<String> passengers;
    private int maxpassengers;
    private Date lasttimetookoff;
    private Date lasttimelanded;

    public Plane(int maxpassengers){
        this.maxpassengers = maxpassengers;
        this.passengers = new ArrayList<>();
    }
    public void onboard(String passenger){
        this.passengers.add(passenger);
    }
    public Date takeoff(){
        this.lasttimetookoff = new Date();
        return lasttimetookoff;
    }
    public void land(){
        this.lasttimelanded = new Date();
        this.passengers.clear();
    }
    public Date getLasttimelanded(){
        return lasttimelanded;
    }
    public List<String> getPassengers(){
        return passengers;
    }
}
public class Activity6 {
    public static void main(String[] args) throws InterruptedException{
        Plane plane = new Plane (10);
        plane.onboard("Kiran");
        plane.onboard("kalyan");
        plane.onboard("swathi");
        System.out.println("Plane take off at: "+ plane.takeoff());
        System.out.println("People on the plane: "+plane.getPassengers());
        Thread.sleep(5000);
        plane.land();
        System.out.println("Plane last time landed at: "+plane.getLasttimelanded());
        System.out.println("People on the Plane after landed: "+plane.getPassengers());

    }
}
