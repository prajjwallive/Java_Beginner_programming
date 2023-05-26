import java.util.Scanner;

public class simple_calc {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        Scanner str = new Scanner(System.in);
        System.out.println("Welcome to Simple Calculator Program.\n");
        int num1, num2, operation, counter;
        counter = 1;
        while (counter != 0) {
            System.out.println("Select Operation you want to perform\n");
            System.out.println("1.Add\n");
            System.out.println("2.Multiply\n");
            System.out.println("3.Divide\n");
            System.out.println("4.Subtract\n");
            System.out.println("5.Exit");
            operation = ip.nextInt();
            switch (operation) {
                case 1:
                    System.out.println("Enter value of num1 and num2");
                    num1 = ip.nextInt();
                    num2 = ip.nextInt();
                    System.out.println("Sum of two digits is:" + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Enter value of num1 and num2");
                    num1 = ip.nextInt();
                    num2 = ip.nextInt();
                    System.out.println("Product of two digits is:" + (num1 * num2));
                    break;
                case 3:
                    System.out.println("Enter value of num1 and num2");
                    num1 = ip.nextInt();
                    num2 = ip.nextInt();
                    try {
                        System.out.println("Divident of two digits is:" + (num1 / num2));
                    } catch (ArithmeticException o) {
                        System.out.println("Error occured:" + o.getMessage());
                    }
                    break;
                case 4:
                    System.out.println("Enter value of num1 and num2");
                    num1 = ip.nextInt();
                    num2 = ip.nextInt();
                    System.out.println("Difference of two digits is:" + (num1 - num2));
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Please choose the valid option\n");
            }
            System.out.println("Do you want to perform again?\n Press y/n\n");
            char x = str.next().charAt(0);
            if (x == 'n' || x == 'N') {
                counter = 0;
            }
            System.out.flush();
        }
        str.close();
        ip.close();
    }

}