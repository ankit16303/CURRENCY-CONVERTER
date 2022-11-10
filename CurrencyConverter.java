import java.util.*;
import java.text.DecimalFormat;

public class CurrencyConverter {

    public static void main(String[] args) {
        double rupee, dollar, pound, euro, kwd;
        int code;

        DecimalFormat f = new DecimalFormat("##.###");
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println("Enter the currency code -> \n 1.RUPEES \n 2.DOLLAR \n 3.POUND \n 4.EURO \n 5.KUWAITI DINAR");
        code = sc.nextInt();

        switch (code) {
            case 1:
                System.out.println("Enter amount in rupees: ");
                rupee = sc.nextDouble();
                dollar = rupee / 77.34;
                System.out.println("Dollar : " + f.format(dollar));
                pound = rupee / 94.46;
                System.out.println("Pound : " + f.format(pound));
                euro = rupee / 80.36;
                System.out.println("Euro : " + f.format(euro));
                kwd = rupee / 251.92;
                System.out.println("Kuwaiti dinar : " + f.format(kwd));
                break;

            case 2:
                System.out.println("Enter amount in dollar: ");
                dollar = sc.nextDouble();
                rupee = dollar * 77.34;
                System.out.println("Dollar : " + f.format(rupee));
                pound = dollar * .82;
                System.out.println("Pound : " + f.format(pound));
                euro = dollar * .96;
                System.out.println("Euro : " + f.format(euro));
                kwd = dollar * .31;
                System.out.println("Kuwaiti dinar : " + f.format(kwd));
                break;

            case 3:
                System.out.println("Enter amount in Pound: ");
                pound = sc.nextDouble();
                rupee = pound * 94.93;
                System.out.println("Rupee : " + f.format(rupee));
                dollar = pound * 1.22;
                System.out.println("Dollar: " + f.format(dollar));
                euro = pound * 1.17;
                System.out.println("Euro : " + f.format(euro));
                kwd = pound * .3748;
                System.out.println("Kuwaiti dinar : " + f.format(kwd));
                break;

            case 4:
                System.out.println("Enter amount in Kuwaiti Dinar : ");
                kwd = sc.nextDouble();
                rupee = kwd * 251.96;
                System.out.println("Rupees : " + f.format(rupee));
                dollar = kwd * 3.26;
                System.out.println("Dollar : " + f.format(dollar));
                pound = kwd * 2.67;
                System.out.println("Pound : " + f.format(pound));
                euro = kwd * 3.13;
                System.out.println("Euro : " + f.format(euro));
                break;

            default:
                System.out.println("invalid code entered...");
        }
        }
        

    }

}