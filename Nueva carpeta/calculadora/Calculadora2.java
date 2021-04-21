public class Calculadora2 {
//atrivutos
private static double Num1;
private static double Num2;
private static String  Operacion;

public static void main (String[] args){
  double Num1, Num2;
  Num1= 10;
  Num2= 5;

  System.out.println("el resultado es : "+ Suma(Num1,Num2));
}

  public static double Suma (double Num1, double Num2 ){
    double resul;
    resul=Num1+Num2;
  return resul;
  }

  public static double Resta (double Num1, double Num2 ){
    double resul;
    resul=Num1-Num2;
  return resul;
  }

  public static double Multi (double Num1, double Num2 ){
    double resul;
    resul=Num1*Num2;
  return resul;
  System.out.println("  El resultado de la operacion es :  "+ resul);
  }

 public static double Divi (double Num1, double Num2 ){
   double resul;
   resul=Num1/Num2;
  return resul;
  System.out.println("  El resultado de la operacion es :  "+ resul);
  }

}
