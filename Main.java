import java.util.Scanner;
class Main {
  public static void main(String[] args) {

     Scanner scanner = new Scanner(System.in);

    System.out.print("Podaj pierwsza liczbe: ");
    int a = scanner.nextInt();
   
    System.out.print("");

    System.out.print("Podaj druga liczbe: ");
    int b = scanner.nextInt();

    System.out.print("");

    System.out.print("Podaj trzecia liczbe: ");
    int c = scanner.nextInt();
    
    if (Math.max(a, b) > Math.max(b, c)){
      System.out.println("Najwieksza liczba z podanych to: ");
      System.out.println(Math.max(a, b)); 
    }
    else
    {
      System.out.println("Najwieksza liczba z podanych to: ");
      System.out.println(Math.max(b, c)); 
      
    }
    
  }
}