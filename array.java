import java.util.*;

class array_test {
    public static void main(String[] args) {
        int a[];
        int i;
        int n;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter no. of Elements: ");
        n = in.nextInt();
        a = new int[n];
        System.out.print("Enter elements: ");
        for (i = 0; i < n; i++)
            a[i] = in.nextInt();
        System.out.println("The entered numbers are: ");
        for (i = 0; i < n; i++)
            System.out.println(a[i] + " ");
    }
}
