package algebra;
import java.util.Scanner;
class addition {

  public static void main(String[] args) {
	try(Scanner scanner = new Scanner(System.in)){
    int a = scanner.nextInt(); 
    
    int b = scanner.nextInt ();
    int c = a+b;
    System.out.println("addition is"  + c);
}
}
}