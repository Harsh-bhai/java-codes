class Rectangle {
   float length, breath;

   Rectangle(float l, float b) {
       this.length = l;
       this.breath = b;
   }

   float CalcArea(){
       return this.length*this.breath;
   }
   float CalcPerimeter(){
       return 2*(this.length+this.breath);
   }
}

class Cuboid extends Rectangle {
   float height;

   Cuboid(float l, float b, float h) {
       super(l, b);
       this.height = h;
   }

   float CalcVol(){
       return super.CalcArea()*this.height;
   }

   float CalcSurfaceArea(){
       return 2*(this.length*this.breath+this.breath*this.height+this.height*this.length);
   }
}


public class inheritance {

    

    public static void main(String[] args) {
        Rectangle r1=new Rectangle(10, 4);
        float area=r1.CalcArea();
        System.out.println("Area="+area);

        Cuboid c1=new Cuboid(10, 20, 30);
        System.out.println("volume="+c1.CalcVol());

    }
}
