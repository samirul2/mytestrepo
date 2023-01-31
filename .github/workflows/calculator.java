public class Main {

  static void calc(float a, float b, String opr) {

      if (opr.equals("add")) {
      		float c = a + b;
            System.out.println("a+b = " + c);     
	  } else if (opr.equals("subtract")) {
      		float c = a - b;
            System.out.println("a-b = " + c);
      } else if (opr.equals("multiply")) {
      		float c = a * b;
            System.out.println("a*b = " + c);
      } else if (opr.equals("divide")) {
      		float c = a / b;
            System.out.println("a/b = " + c);
      }
      else {
      		System.out.println("Sorry, I don't recognize this operation!");
      }
  } 

  public static void main(String[] args) { 
    calc(3,2, "add"); 
  } 
}

