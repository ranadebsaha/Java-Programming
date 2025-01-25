import mypack1.pack1;
import mypack2.intf1;

class pack implements intf1{
    public void show(){
        System.out.println("Hello");
    }
public static void main(String[] args) {
    pack obj= new pack();
    obj.show();
}
}