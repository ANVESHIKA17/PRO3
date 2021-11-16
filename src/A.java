import java.util.*;

class A{
public static void main(String args[]) {
    int a, b, res;
    Scanner s = new Scanner(System.in);
    System.out.println("Enter numerator and denominator");
    try {
        a = s.nextInt();
        b = s.nextInt();
        res = a / b;
        System.out.println("Result" + res);
    } catch (ArithmeticException e) {
        System.out.println("cant divide by zero");

    } catch (InputMismatchException e) {
        System.out.println("only numbers are accepted");
    }
}

    }



