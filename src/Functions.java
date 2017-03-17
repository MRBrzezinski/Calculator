
public class Functions {
  


public Functions() {
  
}

public static int add(int a, int b){
  return a + b;
}
  
public static int subtract(int a, int b){
  return a-b;
}
  
 public static int multiply(int a, int b){
   return a*b;
 }
  
 public static int divide(int a, int b){
   	if (b == 0){
      System.out.println("Error! Dividing by zero is not allowed.");
      return 0;
    }   
    else{   
   		return a/b;}
 }
  
  public static int mod(int a, int b){
    if (b == 0){
      System.out.println("Error! Dividing by zero is not allowed.");
      return 0;
    }
    else{
    return a%b;}
  }
  
}