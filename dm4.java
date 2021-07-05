public class dm4 {
    public static void main(String[] args){
    System.out.println("Rolling the dice...");
    int a,b,c;

    a = (int)(Math.random() * 6) + 1;
    b = (int)(Math.random() * 6) + 1;
    System.out.println("Die 1:" +a);
    System.out.println("Die 2:" +b);
    c=a+b;
    System.out.println("Total value:" +c);
    }
    }
    