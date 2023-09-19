class dekhte{
    int i =10;
}
class hai extends dekhte{
    int j;
    void m1(){
        System.out.println(i);
    }
}
public class test1 {
    public static void main(String[] args) {
        hai h=new hai();
        h.m1();
    //     int a=5;
    //     a+=6;
    //     switch (10) {
    //         case 5:
    //             System.out.println("10");
    //             break;
    //         case 10:
    //             System.out.println("15");
    //             System.out.println((a%2==0?"-even-":"-odd-"));
    //             break;
        
    //         default:System.out.println(a%2);
    //             break;
    //     }
    }
}


