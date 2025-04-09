import java.util.Scanner;
public class swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1 number:");
        int a = sc.nextInt();

        System.out.println("Enter 2 number:");
        int b = sc.nextInt();

        System.out.println("Before swapping: a="+a+",b="+b);

        // Swapping logic
        int temp=a;
        a=b;
        b=temp;

        System.out.println("After swapping:a="+a+",b="+b);
        sc.close();
    }
}
