class Student1 {
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

class Student {
    public static void main(String[] rds) {
        Student1 s = new Student1();
        s.name_roll("Ranadeb", 71);
        s.printdata();
    }
}
