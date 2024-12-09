import java.util.*;

class Mymatrix {
    int mat[][];
    int r, c;
    void setMatrix(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Matrix Row Size: ");
        r = sc.nextInt();
        System.out.print("Enter Matrix Column Size: ");
        c = sc.nextInt();
        mat = new int[r][c];
        System.out.print("Enter 1st Matrix Elements: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
    }

    void add(int mat1[][]) {
        int r1,r2,c1,c2;
        r1=r;
        c1=c;
        r2=mat1.length;
        c2=mat1[0].length;
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
                mat3[i][j] = mat[i][j] + mat1[i][j];
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

    void sub(int mat1[][]) {
        int r1,r2,c1,c2;
        r1=r;
        c1=c;
        r2=mat1.length;
        c2=mat1[0].length;
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
                mat3[i][j] = mat[i][j] - mat1[i][j];
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

    void mul(int mat1[][]) {
        int fr, fc;
        int r1,r2,c1,c2;
        r1=r;
        c1=c;
        r2=mat1.length;
        c2=mat1[0].length;
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
                    mat3[i][j] = mat3[i][j] + (mat[i][k] * mat1[k][j]);
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

    void div(int mat1[][]) {
        int fr, fc;
        int r1,r2,c1,c2;
        r1=r;
        c1=c;
        r2=mat1.length;
        c2=mat1[0].length;
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
                mat3[i][j] = mat[i][j] / mat1[i][j];
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

    void transpose() {
        int fr = c, fc = r;
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

    void diagonal() {
        int temp = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (i == j) {
                    if (mat[i][j] != 0) {
                        temp++;
                    }
                } else {
                    if (mat[i][j] != 0) {
                        System.out.println("It's not a Diagonal Matrix");
                        return;
                    }
                }
            }
        }
        if (temp == 0) {
            System.out.println("It's a Zero Matrix");
        } else {
            System.out.println("Yes!, It's a Diagonal Matrix");
        }

    }

    void identity() {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (i == j) {
                    if (mat[i][j] != 1) {
                        System.out.println("It's not a Identity Matrix");
                        return;
                    }
                } else {
                    if (mat[i][j] != 0) {
                        System.out.println("It's not a Identity Matrix");
                        return;
                    }
                }
            }
        }
        System.out.println("It's a Identity Matrix");
    }

    void show() {
        System.out.println("Matrix: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(mat[i][j] + "  ");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }

}

class matrix {
    public static void main(String rds[]) {
        Scanner sc = new Scanner(System.in);
        int ch, m1;
        Mymatrix mt1= new Mymatrix();
        mt1.setMatrix();
        Mymatrix mt2= new Mymatrix();
        mt2.setMatrix();
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
                    mt1.add(mt2.mat);
                    break;
                case 2:
                    mt1.sub(mt2.mat);
                    break;
                case 3:
                    mt1.mul(mt2.mat);
                    break;
                case 4:
                    mt1.div(mt2.mat);
                    break;
                case 5:
                    System.out.print("Choose one Matrix(1 or 2): ");
                    m1 = sc.nextInt();
                    if (m1 == 1)
                        mt1.transpose();
                    else if (m1 == 2)
                        mt2.transpose();
                    else
                        System.out.println("Invalid Matrix No, Try again...");
                    break;
                case 6:
                    System.out.print("Choose one Matrix(1 or 2): ");
                    m1 = sc.nextInt();
                    if (m1 == 1)
                        mt1.diagonal();
                    else if (m1 == 2)
                        mt2.diagonal();
                    else
                        System.out.println("Invalid Matrix No, Try again...");
                    break;
                case 7:
                    System.out.print("Choose one Matrix(1 or 2): ");
                    m1 = sc.nextInt();
                    if (m1 == 1)
                        mt1.identity();
                    else if (m1 == 2)
                        mt2.identity();
                    else
                        System.out.println("Invalid Matrix No, Try again...");
                    break;
                case 8:
                    mt1.show();
                    mt2.show();
                    break;
                case 9:
                    System.out.println("Thank you for using RDS code, Have a Great Day");
                    break;
                default:
                    System.out.println("Invalid Choice, Try again..");
                    break;
            }
        } while (ch != 9);
        sc.close();
    }
}
