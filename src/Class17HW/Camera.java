package Class17HW;

public class Camera {
    /*
    Write a java class that have 4 constructors with 4 different access levels of constructors
    (private, public, default, protected) and create 4 objects of this class: 1 - inside same class;
    2 - from outside the class; 3 - from different class inside different package  and observe result.
     */

    String model;
    String color;
    int year;
    double price;

    private Camera (String CameraModel, String CameraColor, int CameraYear, double CameraPrice){
        model=CameraModel;
        color=CameraColor;
        year=CameraYear;
        price=CameraPrice;


    }
    Camera (String cameraModel, String cameraColor, int cameraYear){
        model=cameraModel;
        color=cameraColor;
        year=cameraYear;
    }
    protected Camera(String cameraColor, String cameraModel, double cameraPrice){
        color=cameraColor;
        model=cameraModel;
        price=cameraPrice;
    }
    public Camera (String cameraModel, String cameraColor){
        model=cameraModel;
        color=cameraColor;
    }

    public void printInfo(){
        System.out.println("Camera Model: "+model+" Camera Color: "+color+" Camera Year: "+year+" Camera Price: "+price);
    }
    public static void main(String[] args) {

        Camera camera=new Camera("Canon", "Black", 2022, 5000);
        camera.printInfo();
        Camera camera1=new Camera("Nikon","Grey",2004,500);
        camera1.printInfo();
        Camera camera2=new Camera("Fujifilm","Matt Black",2020, 1400);
        camera2.printInfo();
        Camera camera3=new Camera("Sony","Black",2022,2500);
        camera3.printInfo();
    }
}
