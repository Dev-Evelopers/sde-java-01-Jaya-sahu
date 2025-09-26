import java.util.Scanner;

abstract class Calculator {
    abstract int add(int a, int b);
}

class Adder extends Calculator {
    @Override
    int add(int a, int b) {
        System.out.println("Adding integers: " + a + " " + b);
        return a + b;
    }
}

class Multiplier {
    int multiply(int a, int b, Calculator calculator) {
        int result = 0;
        for (int i = 0; i < b; i++) {
            result = calculator.add(result, a);
        }
        return result;
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");

        int a = scanner.nextInt();
        System.out.println("Enter the Second number:");
        int b = scanner.nextInt();
        System.out.println("Enter two integers to add and multiply:");
        Adder adder = new Adder();
        Multiplier multiplier = new Multiplier();
        System.out.println("Testing Addition");
        int sum = adder.add(a, b);
        System.out.println("Sum = " + sum);
        System.out.println();
        System.out.println("Testing Multiplication");
        int product = multiplier.multiply(a, b, adder);
        System.out.println("Product = " + product);
        scanner.close();
    }
}
