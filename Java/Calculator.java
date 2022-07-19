public class Calculator{

    public Calculator(){
  
    }
  // Suma a y B
    public int add(int a, int b){
      return a + b;
    }
  // Resta a y b
    public int subtract(int a, int b){
      return a - b;
    }
  // Multiplica a por b
    public int multiply(int a, int b){
      return a * b;
    }
  // Divide a entre b
    public double divide(int a, int b){
      return (double) a / b;
    }
  // Modula a entre b
    public int modulo(int a, int b){
      return a % b;
    }
  
  public static void main(String[] args){
    Calculator myCalculator = new Calculator();
    System.out.println(myCalculator.add(5,7));
    System.out.println(myCalculator.subtract(45,11));
    System.out.println(myCalculator.multiply(3,25));
    System.out.println(myCalculator.divide(120,13));
    System.out.println(myCalculator.modulo(10,3));
  }
  
  }