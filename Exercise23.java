import java.util.Scanner;

public class Exercise23 {
public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.print("Enter weight in pounds: ");
    double weight=input.nextDouble();
    System.out.print("Enter height in inches: ");
    double height=input.nextDouble();

    double kilo= weight*0.45359237f;
    double inch= height*0.0254f;

    double BMI=kilo/Math.pow(inch, 2);
    
    System.out.println("BMI is "+BMI);

    input.close();

}
}
