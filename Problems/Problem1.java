import java.util.Scanner;

public class Problem1 {

    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        int num=sc.nextInt();

        for (int i = 1; i < num; i++) {

            if(i%2!=0){
                for (int j = 1; j <= num; j++) {
                    System.out.print(j);
                    System.out.print(" ");
                    
                }
                System.out.println();
            }
            

            if(i%2==0){
                for (int k = 5*i; k < num*i-i; k--) {


                    System.out.print(k);
                    System.out.print(" ");
                }
                System.out.println();
            }
            
            
        }

    }
    
}
