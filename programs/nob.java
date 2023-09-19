class outer{
    int i=20;
    static int j=30;
    static class inner{
        void m1(){
            System.out.println(j);
          //  System.out.println(i); //not accessable due to not a static data type 
        }
    }
}
public class nob {
    public static void main(String[] args) {
        outer.inner ob = new outer.inner();
        ob.m1();
    } 
}
