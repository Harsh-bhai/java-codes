// object oriented concepts
// 1 object
// 2 class 
// 3 encapsulation
// 4 abstraction
// 5 data hiding 
// 6 inheritance 
// 7 polymorphism   --> achived through function overloading 
// 8 dynamic binding
// 9 message passing


class Account{
    double balamt;
    void fill(double amt){
        balamt=amt;
    }
    void show(){
        System.out.println("balance amount ="+balamt);
    }
}

public class oops{
    public static void main(String[] args) {
        Account a1=new Account();
        a1.show();
        a1.fill(100);
        a1.show();
    }
}