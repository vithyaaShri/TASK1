import java.util.Scanner;

public class Discountamount {
    public static void main(String[] args) {
    try (Scanner obj = new Scanner(System.in)) {
        int a=obj.nextInt();
        if(a<500){
            System.out.println("No Discount");
            System.out.println("Amount to be paid:"+a);
        }
        else if(a>=500 && a<=1000){
            System.out.println("hello you have a discount of 10%");
            int disamount=a-a*10/100;
            System.out.println("Amount to be paid:"+disamount);
        }
        else{
            System.out.println("hello you have a discount of 20%");
            int disamount=a-a*20/100;
            System.out.println("Amount to be paid:"+disamount);
        }
    }
    }
}
