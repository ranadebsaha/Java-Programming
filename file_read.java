import java.io.*;

public class file_read {
    public static void main(String[] args) {
        try{
            try{
                // FileReader fr= new FileReader("./rds/rds.txt");
                FileInputStream fr= new FileInputStream("./rds/rds.txt");
                int i;
                while((i=fr.read())!=-1){
                    System.out.print((char)i);
                }
            }catch(Exception e){
                System.out.println(e);
            }finally{
                // fr.close();
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}