class fibonacci {
    static int n;
    // float av = 0;
    static int a = 1;
    static int b = 1;
    static int num = 0;

    void cal(int c) {
        if (c >= 0) {
            num = a + b;
            System.out.print(a + " ");
            a = b;
            b = num;
            cal(c - 1);
        }
    }
}

class fibocal {
    public static void main(String rds[]) {
        fibonacci f = new fibonacci();
        f.cal(5);
        // f.avg();
    }
}
