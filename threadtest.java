class A extends Thread{
    A(String s){
        setName(s);
    }
    public void run(){
        for(int i=0; i<10;i++){
            System.out.println(getName()+i);
        }
    }
}

class B implements Runnable{
    Thread t;
    B(String s){
        t=new Thread(this);
        t.setName(s);
    }
    public void run(){
        for(int i=0; i<10;i++){
            System.out.println(t.getName()+i);
        }
    }
}

public class threadtest {
    public static void main(String[] args) {
        A a=new A("RDS");
        B b=new B("Saha");
        a.start();
        b.t.start();
    }
}