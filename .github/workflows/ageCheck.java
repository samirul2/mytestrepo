public class Main {
 //added from Gitpod 22
 //added from Gitpod KhanAston
  // Create a checkAge() method with an integer parameter called age
  static void checkAge(int age) {

    if (age < 18) {
      System.out.println("Hello, Young One!"); 
      
    } else if (age < 60) {
      System.out.println("Hello, Adult!");
    }
    else {
      System.out.println("Hello, Pensioner!"); 
    }    
  } 

  public static void main(String[] args) { 
    checkAge(80); 
  } 
}
