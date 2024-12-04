import java.util.*;
class Student{
int roll,s_mark1,s_mark2,s_mark3;
String name,sub1,sub2,sub3;
int avg,total;
void setName(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Student Name: ");
    name = sc.nextLine();
}
String getName(){
    return name;
}
void showName(){
    System.out.println("Student Name: "+name);
}
void setRoll(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Roll No: ");
    roll = sc.nextInt();
}
int getRoll(){
    return roll;
}
void showRoll(){
    System.out.println("Roll no: "+roll);
}
void setSub(){
    if(!(sub1==null)){
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
void getSub(){
    if(sub1==null){
        System.out.println("Please enter Subject Name");
        return;
    }
    System.out.println("Subject 1 Name: "+sub1);
    System.out.println("Subject 2 Name: "+sub2);
    System.out.println("Subject 3 Name: "+sub3);
}
void setMark(){
    if(!(s_mark1==0)){
        System.out.println("Marks already Entered");
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
void getMark(){
    if(s_mark1==0){
        System.out.println("Please enter Marks");
        return;
    }
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
    if(getStatus()==0){
        System.out.println("No data Found");
        return;
    }
    showRoll();
    showName();
    System.out.println(sub1+": "+s_mark1);
    System.out.println(sub2+": "+s_mark2);
    System.out.println(sub3+": "+s_mark3);
    getTotal();
    getAvg();
}
int getStatus(){
    if(sub1==null || s_mark1==0){
        return 0;
    }
    else{
        return 1;
    }
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
            System.out.println("4.Student Report");
            System.out.println("5.Transpose");
            System.out.println("6.Exit");
            System.out.print("Enter Your Choice: ");
            ch = sc.nextInt();
            int ck,temp=0;
            switch (ch) {
                case 1:
                temp=0;
                for(int i = 0; i < st; i++){
                    System.out.println(arr[i].getRoll()+". "+arr[i].getName());
                }
                System.out.println("Enter Roll no: ");
                ck=sc.nextInt();
                for(int i = 0; i < st; i++){
                    if(arr[i].getRoll()==ck){
                        arr[i].show();
                        temp=1;
                        break;
                    }
                }
                if(temp==0){
                    System.out.println("Invalid Roll no!!");
                }
                    break;
                case 2:
                temp=0;
                for(int i = 0; i < st; i++){
                    System.out.println(arr[i].getRoll()+". "+arr[i].getName());
                }
                System.out.println("Enter Roll no: ");
                ck=sc.nextInt();
                for(int i = 0; i < st; i++){
                    if(arr[i].getRoll()==ck){
                        temp=1;
                        arr[i].setSub();
                        break;
                    }
                }
                if(temp==0){
                    System.out.println("Invalid Roll no!!");
                }
                    break;
                case 3:
                temp=0;
                for(int i = 0; i < st; i++){
                    System.out.println(arr[i].getRoll()+". "+arr[i].getName());
                }
                System.out.println("Enter Roll no: ");
                ck=sc.nextInt();
                for(int i = 0; i < st; i++){
                    if(arr[i].getRoll()==ck){
                        temp=1;
                        arr[i].setMark();
                        break;
                    }
                }
                if(temp==0){
                    System.out.println("Invalid Roll no!!");
                }
                    break;
                case 4:
                temp=0;
                for(int i = 0; i < st; i++){
                    if(arr[i].getStatus()==0){
                        temp=1;
                        System.out.println("Please Fill "+ arr[i].getName()+"'s Data..");
                        break;
                    }
                }
                if(temp==0){
                    System.out.println("-------Student Report-------");
                    for(Student s:arr){
                        s.show();
                        System.out.println(' ');
                    }
                }
                    break;
                case 5:
                    
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
