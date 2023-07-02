import java.util.Scanner;

public class Exercise26 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the monthly saving amount: ");
        double saving = input.nextDouble();
        double valuepermonth = 100*(1+(0.05/12));
        double value2month = (100+ valuepermonth)*(1+(0.05/12));
        double value3month = (100+ value2month)*(1+(0.05/12));
        double value4month = (100+ value3month)*(1+(0.05/12));
        double value5month = (100+ value4month)*(1+(0.05/12));
        double value6month = (100+ value5month)*(1+(0.05/12));
        System.out.println(" After the sixth month, the account value is "+value6month);
    }
    
}
