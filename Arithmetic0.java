class Arithmetic0 {
    public static void main(String[] rds) {
        if (rds.length != 3) {
            System.out.print("Please enter right input.");
        } else {
            int x = Integer.parseInt(rds[0]);
            int y = Integer.parseInt(rds[1]);
            int a;
            if (rds[2].equals("+")) {
                a = x + y;
                System.out.print(x + "+" + y + "=" + a);
            } else if (rds[2].equals("-")) {
                a = x - y;
                System.out.print(x + "-" + y + "=" + a);
            } else if (rds[2].equals("x")) {
                a = x * y;
                System.out.print(x + "*" + y + "=" + a);
            } else {
                a = x / y;
                System.out.print(x + "/" + y + "=" + a);
            }
        }
    }
}
