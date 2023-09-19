    public class variable {
        public static void main(String[] args) {
            A a1 =new A();
            a1.method();
            System.out.println("==============");
            System.out.println();
        }
    }

    class A{
        int a=100;
        static int b=200;
        void method(){
            int c=10;
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        }
    }
