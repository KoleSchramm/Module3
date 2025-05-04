import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double income;
        double tax;

        Scanner scan = new Scanner(System.in);

        System.out.println("Input weekly income: ");
        income = scan.nextDouble();
        if(income>=2500) tax = income*0.3;
        else if(income>=1500) tax = income*0.2;
        else if(income>=500) tax = income*0.15;
        else tax = income*0.1;
        System.out.println("Tax Withholding: $" + tax);
    }
}