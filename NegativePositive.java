import java.util.Scanner;

public class NegativePositive {

    public static void main(String[] args) {
        try (Scanner obj = new Scanner(System.in)) {
            int n=obj.nextInt();
            if(n<0){
                System.out.println("Negative number");
            }
            else
                System.out.println("Positive Number");
        }

    }
}