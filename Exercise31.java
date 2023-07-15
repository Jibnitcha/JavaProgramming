import java.util.Scanner;

public class Exercise31 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter your lottery pick (two digits): ");
        int lotterypick =input.nextInt();
        input.close();
        int lotterypick_1 = lotterypick/10;
        int lotterypick_2 = lotterypick %10;
        int guess_num=(int)(Math.random()*100);
        if(guess_num<9)
        {
            System.out.println("The lottery number is 0"+ guess_num);
        }else
        {
            System.out.println("The lottery number is "+ guess_num);
        }
        int guess_num_1 = guess_num/10;
        int guess_num_2 = guess_num%10;

        boolean exact_match = lotterypick == guess_num;
        boolean match_all_digits = lotterypick_1 == guess_num_2 && lotterypick_2== guess_num_1;
        boolean match_one_digit = lotterypick_1 == guess_num_1 || 
                                  lotterypick_1 == guess_num_2 ||
                                  lotterypick_2 == guess_num_1 ||
                                  lotterypick_2 == guess_num_2;

        if(exact_match)
        {
            System.out.println("Exact match: you win $10,000");
        }else if(match_all_digits)
        {
            System.out.println("Match all digits: you win $3,000");
        }else if(match_one_digit)
        {
            System.out.println("Match one digit: you win $1,000");
        }else
        {
            System.out.println("Sorry no match");
        }
    }}
