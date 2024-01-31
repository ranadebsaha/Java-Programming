public class Area_rectangle {
    int Area;
    int length;
    int breadth;

    Area_rectangle(int a, int b) {
        length = a;
        breadth = b;
        Area = length * breadth;
    }

    void printdata() {
        System.out.println("Area of this Rectangle is: " + Area);
    }
}

class rect {
    public static void main(String[] rds) {
        Area_rectangle r1 = new Area_rectangle(4, 5);
        Area_rectangle r2 = new Area_rectangle(5, 8);
        r1.printdata();
        r2.printdata();
    }
}