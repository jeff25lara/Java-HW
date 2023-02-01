package Class17HW;

public class Students {
    String name;
    String id;
    int age;
    double weight;

    Students(String studentName, String studentId, int studentAge, double studentWeight ){

        name=studentName;
        id=studentId;
        age=studentAge;
        weight=studentWeight;
    }
    void printInfo(){
        System.out.println("Name "+name+" ID "+id+" Age "+age+ " Weight "+weight);
    }
}
