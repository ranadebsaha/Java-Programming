import java.util.*;
class Mymatrix{
void add(int mat1[][],int mat2[][],int r1,int c1,int r2,int c2){
    int fr,fc;
    if(r1>r2){
        fr=r1;
    }else{
        fr=r2;
    }
    if(c1>c2){
        fc=c1;
    }else{
        fc=c2;
    }
    int mat3[][]=new int[fr][fc];
    for(int i=0;i<fr;i++){
        for (int j=0;j<fc;j++){
            mat3[i][j]=mat1[i][j]+mat2[i][j];
        }
    }
    System.out.println("After Addition the Final Matrix is: ");
    for(int i=0;i<fr;i++){
        for (int j=0;j<fc;j++){
            System.out.print(mat3[i][j]+"  ");
        }
        System.out.print("\n");
    }
}
void sub(int mat1[][],int mat2[][],int r1,int c1,int r2,int c2){
    int fr,fc;
    if(r1>r2){
        fr=r1;
    }else{
        fr=r2;
    }
    if(c1>c2){
        fc=c1;
    }else{
        fc=c2;
    }
    int mat3[][]=new int[fr][fc];
    for(int i=0;i<fr;i++){
        for (int j=0;j<fc;j++){
            mat3[i][j]=mat1[i][j]-mat2[i][j];
        }
    }
    System.out.println("After Substraction the Final Matrix is: ");
    for(int i=0;i<fr;i++){
        for (int j=0;j<fc;j++){
            System.out.print(mat3[i][j]+"  ");
        }
        System.out.print("\n");
    }
}
void mul(int mat1[][],int mat2[][],int r1,int c1,int r2,int c2){
    int fr,fc;
    if(c1==r2){
        fr=r1;
        fc=c2;
    }else{
        System.out.println("1st Matrix Column and 2nd matrix Row must be same");
        return;
    }
    int mat3[][]=new int[fr][fc];
    for(int i=0;i<fr;i++){
        for (int j=0;j<fr;j++){
            for(int k=0;k<fc;k++){
            mat3[i][j]=mat3[i][j]+(mat1[i][k]*mat2[k][j]);
            }
        }
    }
    System.out.println("After Multiplication the Final Matrix is: ");
    for(int i=0;i<fr;i++){
        for (int j=0;j<fc;j++){
            System.out.print(mat3[i][j]+"  ");
        }
        System.out.print("\n");
    }
}
void div(int mat1[][],int mat2[][],int r1,int c1,int r2,int c2){
    int fr,fc;
    if(r1>r2){
        fr=r1;
    }else{
        fr=r2;
    }
    if(c1>c2){
        fc=c1;
    }else{
        fc=c2;
    }
    int mat3[][]=new int[fr][fc];
    for(int i=0;i<fr;i++){
        for (int j=0;j<fc;j++){
            mat3[i][j]=mat1[i][j]/mat2[i][j];
        }
    }
    System.out.println("After Division the Final Matrix is: ");
    for(int i=0;i<fr;i++){
        for (int j=0;j<fc;j++){
            System.out.print(mat3[i][j]+"  ");
        }
        System.out.print("\n");
    }
}

}

class matrix{
    public static void main(String rds[]) {
        Mymatrix mm=new Mymatrix();
        Scanner sc =new Scanner(System.in);
        int mat1[][],mat2[][];
        int r1,c1,r2,c2,ch;
        System.out.print("Enter 1st Matrix Row Size: ");
        r1=sc.nextInt();
        System.out.print("Enter 1st Matrix Column Size: ");
        c1=sc.nextInt();
        System.out.print("Enter 2nd Matrix Row Size: ");
        r2=sc.nextInt();
        System.out.print("Enter 2nd Matrix Column Size: ");
        c2=sc.nextInt();
        mat1=new int[r1][c1];
        mat2=new int[r2][c2];
        System.out.print("Enter 1st Matrix Elements: ");
        for(int i=0;i<r1;i++){
            for (int j=0;j<c1;j++){
                mat1[i][j]=sc.nextInt();
            }
        }
        System.out.print("Enter 2nd Matrix Elements: ");
        for(int i=0;i<r2;i++){
            for (int j=0;j<c2;j++){
                mat2[i][j]=sc.nextInt();
            }
        }
        do{
        System.out.println("------Matrix Operation------");
        System.out.println("1.Addition(Element by Element)");
        System.out.println("2.Subtraction(Element by Element)");
        System.out.println("3.Multiplication");
        System.out.println("4.Division(Element by Element)");
        System.out.println("5.Exit");
        System.out.print("Enter Your Choice: ");
        ch=sc.nextInt();
        // System.out.println("1.Addition");
        switch(ch){
            case 1: mm.add(mat1,mat2,r1,c1,r2,c2);
                    break;
            case 2: mm.sub(mat1,mat2,r1,c1,r2,c2);
                    break;
            case 3: mm.mul(mat1,mat2,r1,c1,r2,c2);
                    break;
            case 4: mm.div(mat1,mat2,r1,c1,r2,c2);
                    break;
            case 5: System.out.println("Thank you for using RDS code, Have a Great Day");
                    break;
            default: System.out.println("Invalid Choice, Try again..");
                    break;
        }
        }while(ch!=5);
    }
      }
