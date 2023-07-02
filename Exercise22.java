import java.util.Scanner;

public class Exercise22 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the subtotal and a gratuity rate: ");
        int subtotal= input.nextInt();
        double gratuity=input.nextDouble();
        double gratuity_rate = (gratuity/100)*subtotal;
        double total = gratuity_rate+subtotal;
        System.out.println("The gratuity is "+"$"+gratuity_rate+" and total is "+"$"+total);
    }
}
