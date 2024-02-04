import java.util.*;

class Average {
    Scanner sc = new Scanner(System.in);
    int n1;
    int n2;
    int n3;
    float avr;

    void getdata() {
        System.out.print("Enter first number: ");
        n1 = sc.nextInt();
        System.out.print("Enter second number: ");
        n2 = sc.nextInt();
        System.out.print("Enter Third number: ");
        n3 = sc.nextInt();
    }

    void avrcal() {
        avr = (n1 + n2 + n3) / 3f;
    }

    void printdata() {
        System.out.print("Average of this three number is: " + avr);
    }
}

class Qs6 {
    public static void main(String[] rds) {
        Average ar = new Average();
        ar.getdata();
        ar.avrcal();
        ar.printdata();
    }
}