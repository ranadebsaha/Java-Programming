class A {
    int a;

    A(int a) {
        this.a = a;
    }

    void showA() {
        System.out.println("From A: " + a);
    }
}

class B extends A {
    int b;

    B(int a, int b) {
        super(a);
        this.b = b;
    }

    void showB() {
        showA();
        System.out.println("From B: " + b);
    }
}

class inher_test {
    public static void main(String[] args) {
        B obj = new B(10, 20);
        obj.showB();
    }
}