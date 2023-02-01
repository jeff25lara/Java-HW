package Class17HW;

import java.nio.channels.MembershipKey;

public class Cars {
     /*
    Write a java class that have 4 constructors with 4 different access levels of
    constructors(private,public,default,protected) and create 4 objects of this class:
    1 - inside same class; 2 - from outside the class;
     3 - from different class inside different package  and observe result.
     */

    String Make;
    String Model;
    int Cost;

    double Year;

    public Cars(String cMake,String cModel,int cost,double year){
        Make=cMake;
        Model=cModel;
        Cost=cost;
        Year=year;
    }
    private Cars(String cMake,String cModel,int cost) {
        Make = cMake;
        Model = cModel;
        Cost = cost;
    }

    Cars (String cMake,String cModel) {
        Make = cMake;
        Model = cModel;

    }

    protected Cars (String cMake) {
        Make = cMake;

    }
    public void printCars (){
        System.out.println("Car make "+ Make +" Car model "+Model+" Cost "+Cost+" Year "+Year);
    }

    public static void main(String[] args) {
        Cars cars=new Cars("Subaru","STi",20000);
        cars.printCars();
    }
}
