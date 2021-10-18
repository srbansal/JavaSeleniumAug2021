// Parameterless Constructor

class Demo1 {

   int value1;
   int value2;
   
   Demo1() {
      value1 = 10;
      value2 = 20;
      System.out.println("Inside constructor");
   }
   
   public void display() {
       System.out.println("Value1 === " + value1");
       System.out.println("Value2 === " + value2");
   }

   public static void main(String[] args) {

       Demo1 d1 = new Demo1();
       d1.display();
    }
}