import java.util.Scanner;
public class dm4 {
    public static void main(String[] args){

    int a,b,c;

    Scanner scan = new Scanner(System.in);
    System.out.println("What is your name?");
    System.out.print("> ");
    String name = scan.nextLine();
    System.out.println("Hello, "+name+"!");

    System.out.println("Rolling the dice...");
    a = (int)(Math.random() * 6) + 1;
    b = (int)(Math.random() * 6) + 1;
    System.out.println("Die 1:" +a);
    System.out.println("Die 2:" +b);
    c=a+b;
    System.out.println("Total value:" +c);
    }
    }
    