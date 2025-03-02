import java.util.*;

class Student {
    int roll, s_mark1, s_mark2, s_mark3;
    String name, sub1, sub2, sub3;
    int avg, total;

    void setName() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        name = sc.nextLine();
    }

    String getName() {
        return name;
    }

    void showName() {
        System.out.println("Student Name: " + name);
    }

    void setRoll() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roll No: ");
        roll = sc.nextInt();
    }

    int getRoll() {
        return roll;
    }

    void showRoll() {
        System.out.println("Roll no: " + roll);
    }

    void setSub() {
        if (!(sub1 == null)) {
            System.out.println("Subject already Entered");
            return;
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Subject 1 Name: ");
        sub1 = sc.nextLine();
        System.out.print("Enter Subject 2 Name: ");
        sub2 = sc.nextLine();
        System.out.print("Enter Subject 3 Name: ");
        sub3 = sc.nextLine();
    }

    void updateSub() {
        if (sub1 == null) {
            System.out.println("Enter Subject Name First");
            return;
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Subject 1 Name: ");
        sub1 = sc.nextLine();
        System.out.print("Enter Subject 2 Name: ");
        sub2 = sc.nextLine();
        System.out.print("Enter Subject 3 Name: ");
        sub3 = sc.nextLine();
    }

    void getSub() {
        if (sub1 == null) {
            System.out.println("Please enter Subject Name");
            return;
        }
        System.out.println("Subject 1 Name: " + sub1);
        System.out.println("Subject 2 Name: " + sub2);
        System.out.println("Subject 3 Name: " + sub3);
    }

    void setMark() {
        if (!(s_mark1 == 0)) {
            System.out.println("Marks already Entered");
            return;
        } else if (sub1 == null) {
            System.out.println("Enter Subject Name First");
            return;
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Subject 1 Marks: ");
        s_mark1 = sc.nextInt();
        System.out.print("Enter Subject 2 Marks: ");
        s_mark2 = sc.nextInt();
        System.out.print("Enter Subject 3 Marks: ");
        s_mark3 = sc.nextInt();
    }

    void updateMark() {
        if (s_mark1 == 0) {
            System.out.println("Enter Marks First");
            return;
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Subject 1 Marks: ");
        s_mark1 = sc.nextInt();
        System.out.print("Enter Subject 2 Marks: ");
        s_mark2 = sc.nextInt();
        System.out.print("Enter Subject 3 Marks: ");
        s_mark3 = sc.nextInt();
    }

    void getMark() {
        if (s_mark1 == 0) {
            System.out.println("Please enter Marks");
            return;
        }
        System.out.println("Subject 1 Marks" + s_mark1);
        System.out.println("Subject 2 Marks" + s_mark2);
        System.out.println("Subject 3 Marks" + s_mark3);
    }

    void getTotal() {
        total = s_mark1 + s_mark2 + s_mark3;
        System.out.println("Total Marks: " + total);
    }

    void getAvg() {
        avg = (s_mark1 + s_mark2 + s_mark3) / 3;
        System.out.println("Average: " + avg);
    }

    void getGrade() {
        int mark = (s_mark1 + s_mark2 + s_mark3) / 3;
        if (mark > 90) {
            System.out.println("Grade: A+");
        } else if (mark > 80) {
            System.out.println("Grade: A");
        } else if (mark > 70) {
            System.out.println("Grade: B");
        } else if (mark > 60) {
            System.out.println("Grade: C");
        } else if (mark > 50) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }
    }

    void show() {
        if (getStatus() == 0) {
            System.out.println("No data Found");
            return;
        }
        showRoll();
        showName();
        System.out.println(sub1 + ": " + s_mark1);
        System.out.println(sub2 + ": " + s_mark2);
        System.out.println(sub3 + ": " + s_mark3);
        getTotal();
        getAvg();
        getGrade();
    }

    int getStatus() {
        if (sub1 == null || s_mark1 == 0) {
            return 0;
        } else {
            return 1;
        }
    }
}

class student_mng {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> arr = new ArrayList<Student>();
        int st, ch;
        do {
            System.out.println("===----------------Student Management---------------===");
            System.out.println("1.Show Individual Student");
            System.out.println("2.Add Student");
            System.out.println("3.Enter Subject Name");
            System.out.println("4.Enter Subject Marks");
            System.out.println("5.Student Report");
            System.out.println("6.Update Student Details");
            System.out.println("7.Remove Student");
            System.out.println("8.Exit");
            System.out.print("Enter Your Choice: ");
            ch = sc.nextInt();
            int ck, temp = 0;
            switch (ch) {
                case 1:
                    if (arr.size() == 0) {
                        System.out.println("No Students Found!!, Please Add a Student First");
                        break;
                    }
                    temp = 0;
                    for (Student i : arr) {
                        System.out.println(i.getRoll() + ". " + i.getName());
                    }
                    System.out.print("Enter Roll no: ");
                    ck = sc.nextInt();
                    for (Student i : arr) {
                        if (i.getRoll() == ck) {
                            i.show();
                            temp = 1;
                            break;
                        }
                    }
                    if (temp == 0) {
                        System.out.println("Invalid Roll no!!");
                    }
                    break;
                case 2:
                    System.out.println("--Adding a new Student--");
                    Student s1 = new Student();
                    s1.setRoll();
                    temp = 0;
                    for (Student i : arr) {
                        if (i.getRoll() == s1.getRoll()) {
                            System.out.println("Roll No. already Registered");
                            temp = 1;
                            break;
                        }
                    }
                    if (temp == 0) {
                        s1.setName();
                        arr.add(s1);
                        break;
                    }
                    break;

                case 3:
                    if (arr.size() == 0) {
                        System.out.println("No Students Found!!, Please Add a Student First");
                        break;
                    }
                    temp = 0;
                    for (Student i : arr) {
                        System.out.println(i.getRoll() + ". " + i.getName());
                    }
                    System.out.print("Enter Roll no: ");
                    ck = sc.nextInt();
                    for (Student i : arr) {
                        if (i.getRoll() == ck) {
                            temp = 1;
                            i.setSub();
                            break;
                        }
                    }
                    if (temp == 0) {
                        System.out.println("Invalid Roll no!!");
                    }
                    break;
                case 4:
                    if (arr.size() == 0) {
                        System.out.println("No Students Found!!, Please Add a Student First");
                        break;
                    }
                    temp = 0;
                    for (Student i : arr) {
                        System.out.println(i.getRoll() + ". " + i.getName());
                    }
                    System.out.print("Enter Roll no: ");
                    ck = sc.nextInt();
                    for (Student i : arr) {
                        if (i.getRoll() == ck) {
                            temp = 1;
                            i.setMark();
                            break;
                        }
                    }
                    if (temp == 0) {
                        System.out.println("Invalid Roll no!!");
                    }
                    break;
                case 5:
                    if (arr.size() == 0) {
                        System.out.println("No Students Found!!, Please Add a Student First");
                        break;
                    }
                    temp = 0;
                    for (Student i : arr) {
                        if (i.getStatus() == 0) {
                            temp = 1;
                            System.out.println("Please Fill " + i.getName() + "'s Data..");
                            break;
                        }
                    }
                    if (temp == 0) {
                        System.out.println("-------Student Report-------");
                        for (Student s : arr) {
                            s.show();
                            System.out.println(' ');
                        }
                    }
                    break;
                case 6:
                    if (arr.size() == 0) {
                        System.out.println("No Students Found!!, Please Add a Student First");
                        break;
                    }
                    temp = 0;
                    for (Student i : arr) {
                        System.out.println(i.getRoll() + ". " + i.getName());
                    }
                    System.out.print("Enter Roll no: ");
                    ck = sc.nextInt();
                    for (Student i : arr) {
                        if (i.getRoll() == ck) {
                            temp = 1;
                            int ich;
                            do {
                                System.out.println("1. Update Name");
                                System.out.println("2. Update Subject Names");
                                System.out.println("3. Update Subject Marks");
                                System.out.println("4. Back");
                                System.out.print("Enter Your Choice: ");
                                ich = sc.nextInt();
                                switch (ich) {
                                    case 1:
                                        i.setName();
                                        break;
                                    case 2:
                                        i.updateSub();
                                        break;
                                    case 3:
                                        i.updateMark();
                                        break;
                                    case 4:
                                        break;
                                    default:
                                        System.out.println("Invalid Input");
                                        break;
                                }
                            } while (ich != 4);
                            break;
                        }
                    }
                    if (temp == 0) {
                        System.out.println("Invalid Roll no!!");
                    }
                    break;
                case 7:
                    if (arr.size() == 0) {
                        System.out.println("No Students Found!!, Please Add a Student First");
                        break;
                    }
                    temp = 0;
                    for (Student i : arr) {
                        System.out.println(i.getRoll() + ". " + i.getName());
                    }
                    System.out.print("Enter Roll no: ");
                    ck = sc.nextInt();
                    for (Student i : arr) {
                        if (i.getRoll() == ck) {
                            arr.remove(i);
                            temp = 1;
                            break;
                        }
                    }
                    if (temp == 0) {
                        System.out.println("Invalid Roll no!!");
                    }
                    break;
                case 8:
                    System.out.println("Thank you for using RDS code, Have a Great Day");
                    break;
                default:
                    System.out.println("Invalid Choice, Try again..");
                    break;
            }
        } while (ch != 8);
    }
}
