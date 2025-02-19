import java.util.Scanner;

public class problem {


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int r=sc.nextInt();
		sc.close();
		int ans1=fact(n);
		int ans2=fact(r);
		int ans3=fact(n-r);
		int res1=ans1/(ans2*ans3);//ncr
		int res2=ans1/ans3;//npr
		System.out.println(ans1);//printing n factorial
		System.out.println(res2);//printing npr
	//printing ncr
		System.out.println(res1);
}
public static int fact(int a){
 int sol=1;
 for(int i=1;i<=a;i++){
 sol=sol*i;
 }
 return sol;
}
}