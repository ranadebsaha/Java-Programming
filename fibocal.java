class fibonacci {
    int n;
    float av = 0;
    // int a = 1;
    // int b = 1;
    int num = 0;

    // fibonacci(int a) {
    // n = a;
    // }

    int cal(int a) {
        n = a;
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return cal(n - 1) + cal(n - 2);
        }
    }

    // void avg() {
    // av = av / n;
    // System.out.print("\nAverage is: " + av);
    // }
}

class fibocal {
    public static void main(String rds[]) {
        fibonacci f = new fibonacci();
        System.out.print(f.cal(5));
        // f.avg();
    }
}