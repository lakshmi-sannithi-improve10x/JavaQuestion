public class Test1 {
    int num = 12;

    public static void main(String[] args) {
        Test1 obj = new Test1();
       obj.displayNumber();
       Test2  object = new Test2();
       object.showName();
    }
    public  void displayNumber(){
        Test1 test1 = new Test1();
        int num1 = test1.num;
        Test2 myObj = new Test2();
        myObj.name = "sai";
        System.out.println(myObj.name);
        System.out.println(num1);
    }
}
