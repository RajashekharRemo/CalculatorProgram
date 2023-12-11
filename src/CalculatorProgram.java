import java.util.Scanner;

public class CalculatorProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your First Number");
        double a = sc.nextDouble();
        System.out.println("Enter your second Number");
        double b = sc.nextDouble();
        System.out.println("Enter\n1) Addition\n2) Subtraction\n3) Multiplication\n4) Division");
        int choice = sc.nextInt();
        CalculatorOperations c = new CalculatorOperations();
        switch (choice){
            case 1 -> System.out.println("Addition of two Num = "+c.addition(a,b));
            case 2 -> System.out.println("Subtraction of two Num = "+c.subtraction(a,b));
            case 3 -> System.out.println("Multiplication of two Num = "+c.multiplication(a,b));
            case 4 -> System.out.println("Division of two Num = "+c.division(a,b));
        }
    }
}
