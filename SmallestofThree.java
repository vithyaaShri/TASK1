import java.util.Scanner;

public class SmallestofThree {
    public static void main(String[] args) {
    try (Scanner obj = new Scanner(System.in)) {
        int a=obj.nextInt();
        int b=obj.nextInt();
        int c=obj.nextInt();
        if(a<b && a<c)
            System.out.println("a is the smallest");
        else if(b<c)
            System.out.println("b is the smallest");
        else 
            System.out.println("c is the smallest");
    }
    
    }
    
}
