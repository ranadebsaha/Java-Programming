class fibonacci {
    int n;
    float av = 0;
    int a = 1;
    int b = 1;
    int num = 0;

    fibonacci(int a) {
        n = a;
    }

    void cal() {
        for (int i = 0; i < n; i++) {
            System.out.print(a + "  ");
            av = av + a;
            num = a + b;
            a = b;
            b = num;
        }
    }

    void avg() {
        av = av / n;
        System.out.print("\nAverage is: " + av);
    }
}

class fibocal {
    public static void main(String rds[]) {
        fibonacci f = new fibonacci(20);
        f.cal();
        f.avg();
    }
}