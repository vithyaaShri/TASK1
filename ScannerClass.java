import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
    try (Scanner obj = new Scanner(System.in)) {
        String name=obj.nextLine();
        String mailId=obj.next();
        System.out.println(name);
        System.out.println(mailId);
    }
}
}
