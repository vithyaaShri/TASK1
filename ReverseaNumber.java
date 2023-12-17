import java.util.Scanner;

public class ReverseaNumber {
    public static void main(String[] args) {
        try (Scanner obj = new Scanner(System.in)) {
            int n=obj.nextInt();
            int num=n;
            int temp=0;
            int i=0;
            while(n>0){
                temp=n%10;
                n=n/10;
                i++;
            }
            int[] nums=new int[i];
            for(int j=0;j<nums.length;j++){
                temp=num%10;
                num=num/10;
                nums[j]=temp;
                //System.out.print(nums[j]);
            }
            for(int j=0;j<nums.length;j++)
                System.out.print(nums[j]);
        }
    }
    
}
