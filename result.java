public class result {
    int mark;

    result(int a) {
        mark = a;
    }

    void checkpassfail() {
        if (mark >= 50) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
}

class Check {
    public static void main(String rds[]) {
        result m = new result(53);
        m.checkpassfail();
        System.out.print("Done");
    }
}