class A extends Thread {
    public void run() {
        for (int i = 0; i <= 5; i++) {
            if (i == 2)
                Thread.yield();
            System.out.println("Hello from A: i= " + i);
        }
        System.out.println("Exit from A");
    }
}

class B extends Thread {
    public void run() {
        for (int j = 0; j <= 5; j++) {
            if (j == 3)
                stop();
            System.out.println("Hello from B: j= " + j);
        }
        System.out.println("Exit from B");
    }
}

class C extends Thread {
    public void run() {
        for (int k = 0; k <= 5; k++) {
            if (k == 6) {
                try {
                    sleep(5000);
                } catch (Exception e) {
                    System.out.println("Some error");
                }
            }
            System.out.println("Hello from C: k= " + k);
        }
        System.out.println("Exit from C");
    }
}

class thread {
    public static void main(String[] args) {
        new A().start();
        new B().start();
        new C().start();
    }
}