import java.util.Scanner;
public class percent {
	public static void main(String[]args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("welcome to the percentage calculator program:");
	System.out.println("enter the cn marks:");
    int cn = scan.nextInt();
    System.out.println("enter the spos marks");
    int spos = scan.nextInt();
    System.out.println("enter the toc marks");
    int toc = scan.nextInt();
    System.out .println("enter the iot marks");
    int iot = scan.nextInt();
    System.out.println("enter the dbms marks");
    int dbms = scan.nextInt();
    int total_marks = spos+cn+toc+iot+dbms;
    System.out.println("the total percentage is: "+total_marks); 
}
}