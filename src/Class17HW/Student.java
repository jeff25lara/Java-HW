package Class17HW;

public class Student {
     /*
    Write a Student class that have instance variables name and address. Create a constructor that will
    initialize those variables. Print name & address of given  student using displayInfo method.
     */

    String name;
    String address;

    Student(String studentName, String studentAddress){
        name=studentName;
        address=studentAddress;
    }
    void displayInfo(){
        System.out.println("Student Name: "+name+" Student Address: "+address);
    }

    public static void main(String[] args) {
        Student student=new Student("Jefferson", "123 Student Ave.");
        student.displayInfo();
    }
}
