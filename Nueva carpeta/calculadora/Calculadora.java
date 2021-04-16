public class Calculadora {
//atrivutos
private static double Num1;
private static double Num2;


public static void main (String[] args){
  double Num1, Num2;
  Num1= 10;
  Num2= 5;
  
  System.out.println("  El resultado de la operacion es :  "+Suma(Num1,Num2));
  System.out.println("  El resultado de la operacion es :  "+Resta(Num1,Num2));
  System.out.println("  El resultado de la operacion es :  "+Multi(Num1,Num2));
  System.out.println("  El resultado de la operacion es :  "+Divi(Num1,Num2));
  
}
  public static double Suma (double Num1, double Num2 ){

  return Num1+Num2;
  }

  public static double Resta (double Num1, double Num2 ){

  return Num1-Num2;
  }
  public static double Multi (double Num1, double Num2 ){

  return Num1*Num2;
  }
 public static double Divi (double Num1, double Num2 ){

  return Num1/Num2;
  }

}
