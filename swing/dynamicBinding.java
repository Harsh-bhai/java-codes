class b{
    void m1(){
        System.out.println("hi");

    }
}
class a extends b{
    void m1(){
        System.out.println("hello");
    }
}
class dynamicBinding{
    
public static void main(String[] args) {
  b a1= new a();
  a1.m1();
    
}
}