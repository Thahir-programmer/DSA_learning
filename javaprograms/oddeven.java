import java.util.Scanner;
public class oddeven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        if (n%2==0){
            System.out.println("is an even number");
        }
        else{
            System.out.println("is an odd number");
        }
    }
}