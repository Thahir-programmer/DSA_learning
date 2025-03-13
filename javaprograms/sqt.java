import java.util.Scanner;
public class sqt {
	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	int n=sc.nextInt();
	sc.close();
    System.out.println(sqrt(n));
	}
	public static int sqrt(int n){
	int a=1;
	for(int i=1;i*i<=n;i++){
	a=i;
	}return a;
	}
}