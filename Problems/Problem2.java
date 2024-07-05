
import java.util.Scanner;

public class Problem2 {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.print("Enter the original String : ");
        String org=sc.nextLine();

        System.out.print("Enter the Duplicate String : ");
        String dup=sc.nextLine();



        int count=0;

        for(int i=0;i<org.length();i++){

            if(org.charAt(i)!=dup.charAt(i)){
                count++;
            }
        }

        System.out.println(count);

        sc.close();
        
    }
    
}
