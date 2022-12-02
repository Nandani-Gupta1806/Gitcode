import java.io.*;
public class Electricbill {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double Bill;
        System.out.println("Enter the Electricity unit charge = ");
        int i=Integer.parseInt(br.readLine());
        if(i<=100){
            Bill=i*0.50; 
            System.out.println("Bill="+Bill);
        }else if(i<=200){
            Bill=i*1.25;
            System.out.println("Bill="+Bill);
        }else if(i<=300){
            Bill=i*1.50;
            System.out.println("Bill="+Bill);  
        }else if (i>=300){
            Bill=i*1.75;
            System.out.println("Bill=Rs."+Bill);
        }
    }
}
