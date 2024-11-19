public class month {
    public static void main(String rds[]){
        int num;
        if(rds.length==0){
            System.out.println("Enter a valid month");
            return;
        }
        String arr[]={"January","February","March","April","May","June","July","August","September","October","November","December"};
        num=Integer.parseInt(rds[0])-1;
        if(num<0 || num >11){
            System.out.println("Enter a valid month");
            return;
        }
        System.out.println(arr[num]);

    }
}
