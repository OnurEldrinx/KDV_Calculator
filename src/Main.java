import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        double capital,kdvPercentage,moneyWithTax,tax;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please,enter your amount of money: ");
        capital = keyboard.nextDouble();

        kdvPercentage = (0<capital && capital<1000) ? 0.18 : 0.08;

        tax = capital * kdvPercentage;

        moneyWithTax = capital + tax;

        System.out.println("---------------------------------");
        System.out.println("--> Your Capital        : " + capital);
        System.out.println("--> Price with tax(KDV) : " + moneyWithTax);
        System.out.println("--> KDV Percentage      : " + kdvPercentage);
        System.out.println("--> KDV Price           : " + tax);
        System.out.println("---------------------------------");


    }
}
