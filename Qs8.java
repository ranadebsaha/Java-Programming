class Employee {
    String name;
    int yoj;
    float salary;
    String add;

    void getdata(String n, int y, float s, String a) {
        name = n;
        yoj = y;
        salary = s;
        add = a;
    }

    void print() {
        System.out.println("Name \t Year of Joining \t Salary \t Address");
        System.out.println("------------------------------------------------------");
    }

    void printdata() {
        System.out.println(name + " \t\t" + yoj + " \t   " +salary + " \t\t" + add);
    }
}

class Qs8 {
    public static void main(String[] args) {
        Employee em = new Employee();
        em.print();
        em.getdata("Akash", 2018, 30000, "Hooghly");
        em.printdata();
        em.getdata("Arghajit", 2019, 40000, "Nadia");
        em.printdata();
        em.getdata("Bidyut", 2018, 35000, "Kolkata");
        em.printdata();
    }
}