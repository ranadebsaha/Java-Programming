import java.util.*;

class Mymatrix {
    void add(int mat1[][], int mat2[][], int r1, int c1, int r2, int c2) {
        int fr, fc;
        if (r1 > r2) {
            fr = r1;
        } else {
            fr = r2;
        }
        if (c1 > c2) {
            fc = c1;
        } else {
            fc = c2;
        }
        int mat3[][] = new int[fr][fc];
        for (int i = 0; i < fr; i++) {
            for (int j = 0; j < fc; j++) {
                mat3[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        System.out.println("After Addition the Final Matrix is: ");
        for (int i = 0; i < fr; i++) {
            for (int j = 0; j < fc; j++) {
                System.out.print(mat3[i][j] + "  ");
            }
            System.out.print("\n");
        }
    }

    void sub(int mat1[][], int mat2[][], int r1, int c1, int r2, int c2) {
        int fr, fc;
        if (r1 > r2) {
            fr = r1;
        } else {
            fr = r2;
        }
        if (c1 > c2) {
            fc = c1;
        } else {
            fc = c2;
        }
        int mat3[][] = new int[fr][fc];
        for (int i = 0; i < fr; i++) {
            for (int j = 0; j < fc; j++) {
                mat3[i][j] = mat1[i][j] - mat2[i][j];
            }
        }
        System.out.println("After Substraction the Final Matrix is: ");
        for (int i = 0; i < fr; i++) {
            for (int j = 0; j < fc; j++) {
                System.out.print(mat3[i][j] + "  ");
            }
            System.out.print("\n");
        }
    }

    void mul(int mat1[][], int mat2[][], int r1, int c1, int r2, int c2) {
        int fr, fc;
        if (c1 == r2) {
            fr = r1;
            fc = c2;
        } else {
            System.out.println("1st Matrix Column and 2nd matrix Row must be same");
            return;
        }
        int mat3[][] = new int[fr][fc];
        for (int i = 0; i < fr; i++) {
            for (int j = 0; j < fr; j++) {
                for (int k = 0; k < fc; k++) {
                    mat3[i][j] = mat3[i][j] + (mat1[i][k] * mat2[k][j]);
                }
            }
        }
        System.out.println("After Multiplication the Final Matrix is: ");
        for (int i = 0; i < fr; i++) {
            for (int j = 0; j < fc; j++) {
                System.out.print(mat3[i][j] + "  ");
            }
            System.out.print("\n");
        }
    }

    void div(int mat1[][], int mat2[][], int r1, int c1, int r2, int c2) {
        int fr, fc;
        if (r1 > r2) {
            fr = r1;
        } else {
            fr = r2;
        }
        if (c1 > c2) {
            fc = c1;
        } else {
            fc = c2;
        }
        int mat3[][] = new int[fr][fc];
        for (int i = 0; i < fr; i++) {
            for (int j = 0; j < fc; j++) {
                mat3[i][j] = mat1[i][j] / mat2[i][j];
            }
        }
        System.out.println("After Division the Final Matrix is: ");
        for (int i = 0; i < fr; i++) {
            for (int j = 0; j < fc; j++) {
                System.out.print(mat3[i][j] + "  ");
            }
            System.out.print("\n");
        }
    }

    void transpose(int mat[][], int r1, int c1) {
        int fr = c1, fc = r1;
        int mat1[][] = new int[fr][fc];
        for (int i = 0; i < fr; i++) {
            for (int j = 0; j < fc; j++) {
                mat1[i][j] = mat[j][i];
            }
        }
        System.out.println("Transpose of this Matrix: ");
        for (int i = 0; i < fr; i++) {
            for (int j = 0; j < fc; j++) {
                System.out.print(mat1[i][j] + "  ");
            }
            System.out.print("\n");
        }
    }

    void diagonal(int mat[][], int r1, int c1){
        int temp=0;
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                if(i==j){
                    if(mat[i][j]!=0){
                        temp++;
                    }
                }else{
                    if(mat[i][j]!=0){
                        System.out.println("It's not a Diagonal Matrix");
                        return;
                    }
                }
            }
        }
        if(temp==0){
            System.out.println("It's a Zero Matrix");
        }else{
            System.out.println("Yes!, It's a Diagonal Matrix");
        }
        
    }
    void identity(int mat[][], int r1, int c1){
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                if(i==j){
                    if(mat[i][j]!=1){
                        System.out.println("It's not a Identity Matrix");
                        return;
                    }
                }else{
                    if(mat[i][j]!=0){
                        System.out.println("It's not a Identity Matrix");
                        return;
                    }
                }
            }
        }
        System.out.println("It's a Identity Matrix");  
    }

    void show(int mat1[][], int mat2[][], int r1, int c1, int r2, int c2){
        System.out.println("1st Matrix: ");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                System.out.print(mat1[i][j] + "  ");
            }
            System.out.print("\n");
        }
        System.out.println("2nd Matrix: ");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(mat2[i][j] + "  ");
            }
            System.out.print("\n");
        }
        
    }

}



class matrix {
    public static void main(String rds[]) {
        Mymatrix mm = new Mymatrix();
        Scanner sc = new Scanner(System.in);
        int mat1[][], mat2[][];
        int r1, c1, r2, c2, ch,m1;
        System.out.print("Enter 1st Matrix Row Size: ");
        r1 = sc.nextInt();
        System.out.print("Enter 1st Matrix Column Size: ");
        c1 = sc.nextInt();
        System.out.print("Enter 2nd Matrix Row Size: ");
        r2 = sc.nextInt();
        System.out.print("Enter 2nd Matrix Column Size: ");
        c2 = sc.nextInt();
        mat1 = new int[r1][c1];
        mat2 = new int[r2][c2];
        System.out.print("Enter 1st Matrix Elements: ");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                mat1[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter 2nd Matrix Elements: ");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                mat2[i][j] = sc.nextInt();
            }
        }
        do {
            System.out.println("===----------------Matrix Operation---------------===");
            System.out.println("1.Addition(Element by Element)");
            System.out.println("2.Subtraction(Element by Element)");
            System.out.println("3.Multiplication");
            System.out.println("4.Division(Element by Element)");
            System.out.println("5.Transpose");
            System.out.println("6.Check the Matrix is Diagonal or Not");
            System.out.println("7.Check the Matrix is Identity or Not");
            System.out.println("8.Show Matrices");
            System.out.println("9.Exit");
            System.out.print("Enter Your Choice: ");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    mm.add(mat1, mat2, r1, c1, r2, c2);
                    break;
                case 2:
                    mm.sub(mat1, mat2, r1, c1, r2, c2);
                    break;
                case 3:
                    mm.mul(mat1, mat2, r1, c1, r2, c2);
                    break;
                case 4:
                    mm.div(mat1, mat2, r1, c1, r2, c2);
                    break;
                case 5:
                    System.out.print("Choose one Matrix(1 or 2): ");
                     m1 = sc.nextInt();
                    if (m1 == 1)
                        mm.transpose(mat1, r1, c1);
                    else if (m1 == 2)
                        mm.transpose(mat2, r2, c2);
                    else
                        System.out.println("Invalid Matrix No, Try again...");
                    break;
                case 6:
                    System.out.print("Choose one Matrix(1 or 2): ");
                     m1 = sc.nextInt();
                    if (m1 == 1)
                        mm.diagonal(mat1, r1, c1);
                    else if (m1 == 2)
                        mm.diagonal(mat2, r2, c2);
                    else
                        System.out.println("Invalid Matrix No, Try again...");
                    break;
                case 7:
                    System.out.print("Choose one Matrix(1 or 2): ");
                     m1 = sc.nextInt();
                    if (m1 == 1)
                        mm.identity(mat1, r1, c1);
                    else if (m1 == 2)
                        mm.identity(mat2, r2, c2);
                    else
                        System.out.println("Invalid Matrix No, Try again...");
                    break;
                case 8:
                    mm.show(mat1, mat2, r1, c1, r2, c2);
                    break;
                case 9:
                    System.out.println("Thank you for using RDS code, Have a Great Day");
                    break;
                default:
                    System.out.println("Invalid Choice, Try again..");
                    break;
            }
        } while (ch != 9);
    }
}
