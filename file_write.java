import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;

public class file_write {
    public static void main(String[] args) {
        try{
            // FileWriter fw= new FileWriter("./rds/rds.txt");
            FileOutputStream f1= new FileOutputStream("./rds/rds.txt");
            // BufferedWriter bw= new BufferedWriter(fw);
            BufferedOutputStream bo= new BufferedOutputStream(f1);
            try{
                bo.write('g');
            }catch(Exception e){
                System.out.println(e);
            }finally{
                bo.close();
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
