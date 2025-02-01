import java.util.Scanner;

public class patterns {
    public static void main(String[] args) {

Scanner sc=new Scanner(System.in);  
System.out.println("enter the number of line");
int n=sc.nextInt();
sc.close();
int pat=1;
for(int i=1;i<=n;i++){
    for(int j=1;j<=pat;j++){
        System.out.print("*");
    }
    pat=pat+1;
   System.out.println();
}
}}
       