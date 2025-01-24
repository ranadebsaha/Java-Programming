class rdsException extends Exception{
    rdsException(String msg){
        super(msg);
    }
}
public class exception {
    public static void main(String[] args) {
        try{
            throw new rdsException("This is Rds Error");
        }catch(Exception e){
            System.out.println(e);
            // System.out.println(e.getMessage());
        }
    }
}
