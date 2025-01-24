import java.io.File;

public class file {
    public static void main(String[] args) {
        try{
            File f1=new File("./rds/rds.txt");
            // f1.createNewFile();
            if(f1.exists()){
            System.out.println("Read: "+f1.canRead());
            System.out.println("Write: "+f1.canWrite());
            System.out.println("Size: "+f1.length());
            System.out.println("Path: "+f1.getAbsolutePath());
            System.out.println("name: "+f1.getName());
            }else{
                System.out.println("Not Exist");
            }

        }catch(Exception e){
            System.out.println("error"+e);
        }
    }
}
