public class Carro {
  //Atributos de la clase 
    private static String Color;
    private static String Marca;
    private static String Placa; 
  
  public static void main (String[] argv){
    Valores ("negro","bently","323-best");
    System.out.print("este carro es de color "+Color+ " De Marca "+Marca+" y de Placa "+Placa );
  }
  public static void Valores(String col, String mar, String pla){
    Color= col; Marca=mar; Placa=pla;
  }
}


