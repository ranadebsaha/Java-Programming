public class Student {
    String name;
    int roll_no;

    void name_roll(String a, int b) {
        name = a;
        roll_no = b;
    }

    void printdata() {
        System.out.println("Name : " + name);
        System.out.println("Roll no : " + roll_no);
    }
}

class newst {
    public static void main(String[] rds) {
        Student s = new Student();
        s.name_roll("Ranadeb", 71);
        s.printdata();
    }
}
