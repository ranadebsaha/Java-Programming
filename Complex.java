import java.util.*;

class Complex {
    int r1;
    int i1;

    Complex() {
    }

    void sum(Complex x, Complex y) {
        r1 = x.r1 + y.r1;
        i1 = x.i1 + y.i1;
        System.out.println("The Sum of two Complex number is: " + r1 + "+" + i1 + "i");
    }

    void difference(Complex x, Complex y) {
        r1 = x.r1 - y.r1;
        i1 = x.i1 - y.i1;
        System.out.println("The Difference of two Complex number is: " + r1 + "+" + i1 + "i");
    }

    void product(Complex x, Complex y) {
        r1 = x.r1 * y.r1;
        i1 = x.i1 * y.i1;
        System.out.println("The Product of two Complex number is: " + r1 + "+" + i1 + "i");
    }
}

class Calcomplex {
    public static void main(String[] rds) {
        Scanner sc = new Scanner(System.in);
        Complex c1 = new Complex();
        System.out.print("Enter Real part of First Number: ");
        c1.r1 = sc.nextInt();
        System.out.print("Enter Imaginary part of First Number: ");
        c1.i1 = sc.nextInt();
        Complex c2 = new Complex();
        System.out.print("Enter Real part of Second Number: ");
        c2.r1 = sc.nextInt();
        System.out.print("Enter Imaginary part of Second Number: ");
        c2.i1 = sc.nextInt();
        Complex c3 = new Complex();
        c3.sum(c1, c2);
        c3.difference(c1, c2);
        c3.product(c1, c2);
    }
}