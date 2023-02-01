package Class17HW;

public class Constructor {
    int year;
    double money;
    String name;

    //static -Unable to make static constructor
    Constructor(int sYear,double sMoney,String sName){
        year=sYear;
        money=sMoney;
        name=sName;


    }
    void display(){
        System.out.println("Year: "+year+" money: "+money+" name: "+name);
    }

    public static void main(String[] args) {
        Constructor st=new Constructor(1989,73000,"Jeff");
        st.display();
    }
}
