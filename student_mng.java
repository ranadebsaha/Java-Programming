import java.util.*;
class Student{
Scanner sc = new Scanner(System.in);
int roll,s_mark1,s_mark2,s_mark3;
String name,sub1,sub2,sub3;
int avg,total;
void setName(){
    System.out.print("Enter Student Name: ");
    sc.nextLine();
    name = sc.nextLine();
}
void getName(){
    System.out.print("Student Name: "+name);
}
void setRoll(){
    System.out.print("Enter Roll No: ");
    roll = sc.nextInt();
}
void getRoll(){
    System.out.print("Roll no"+roll);
}
void setSub(){
    System.out.print("Enter Subject 1 Name: ");
    sub1 = sc.nextLine();
    System.out.print("Enter Subject 2 Name: ");
    sub2 = sc.nextLine();
    System.out.print("Enter Subject 3 Name: ");
    sub3 = sc.nextLine();
}
void getSub(){
    System.out.println("Subject 1 Name: "+sub1);
    System.out.println("Subject 2 Name: "+sub2);
    System.out.println("Subject 3 Name: "+sub3);
}
void setMark(){
    System.out.print("Enter Subject 1 Marks: ");
    s_mark1 = sc.nextInt();
    System.out.print("Enter Subject 2 Marks: ");
    s_mark2 = sc.nextInt();
    System.out.print("Enter Subject 3 Marks: ");
    s_mark3 = sc.nextInt();
}
void getMark(){
    System.out.println("Subject 1 Marks"+s_mark1);
    System.out.println("Subject 2 Marks"+s_mark2);
    System.out.println("Subject 3 Marks"+s_mark3);
}
void getTotal(){
    total=s_mark1+s_mark2+s_mark3;
    System.out.println("Total Marks: "+total);
}
void getAvg(){
    avg=(s_mark1+s_mark2+s_mark3)/3;
    System.out.println("Average: "+avg);
}
void show(){
    total=s_mark1+s_mark2+s_mark3;
    avg=(s_mark1+s_mark2+s_mark3)/3;
    System.out.print("Student Name: "+name);
    System.out.print("Roll no"+roll);
    System.out.println(sub1+": "+s_mark1);
    System.out.println(sub2+": "+s_mark2);
    System.out.println(sub3+": "+s_mark3);
    System.out.println("Total Marks: "+total);
    System.out.println("Average: "+avg);
}
}

class student_mng {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student arr[];
        int st, ch;
        System.out.print("Enter number of Students: ");
        st = sc.nextInt();
        arr=new Student[st];
        for (int i = 0; i < st; i++) {
            arr[i]=new Student();
            arr[i].setRoll();
            arr[i].setName();
        }
        do {
            System.out.println("===----------------Student Management---------------===");
            System.out.println("1.Show Individual Student");
            System.out.println("2.Enter Subject Name");
            System.out.println("3.Enter Subject Marks");
            System.out.println("4.Student Details");
            System.out.println("5.Transpose");
            System.out.println("6.Exit");
            System.out.print("Enter Your Choice: ");
            ch = sc.nextInt();
            int ck;
            switch (ch) {
                case 1:
                
                for(int i = 0; i < st; i++){
                    System.out.println(arr[i].roll+". "+arr[i].name);
                }
                System.out.println("Enter Roll no: ");
                ck=sc.nextInt();
                for(int i = 0; i < st; i++){
                    if(arr[i].roll==ck){
                        arr[i].show();
                        break;
                    }
                }
                    break;
                case 2:
                for(int i = 0; i < st; i++){
                    System.out.println(arr[i].roll+". "+arr[i].name);
                }
                System.out.println("Enter Roll no: ");
                ck=sc.nextInt();
                for(int i = 0; i < st; i++){
                    if(arr[i].roll==ck){
                        arr[i].setSub();
                        break;
                    }
                }
                    break;
                case 3:
                for(int i = 0; i < st; i++){
                    System.out.println(arr[i].roll+". "+arr[i].name);
                }
                System.out.println("Enter Roll no: ");
                ck=sc.nextInt();
                for(int i = 0; i < st; i++){
                    if(arr[i].roll==ck){
                        arr[i].setMark();
                        break;
                    }
                }
                    break;
                case 4:
                    // mm.div(mat1, mat2, r1, c1, r2, c2);
                    break;
                case 5:
                    // System.out.print("Choose one Matrix(1 or 2): ");
                    //  m1 = sc.nextInt();
                    // if (m1 == 1)
                    //     mm.transpose(mat1, r1, c1);
                    // else if (m1 == 2)
                    //     mm.transpose(mat2, r2, c2);
                    // else
                    //     System.out.println("Invalid Matrix No, Try again...");
                    break;
                case 6:
                    System.out.println("Thank you for using RDS code, Have a Great Day");
                    break;
                default:
                    System.out.println("Invalid Choice, Try again..");
                    break;
            }
        } while (ch != 6);
    }
}
