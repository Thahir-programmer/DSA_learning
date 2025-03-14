import java.util.Scanner;
public class arrygetelmt {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		System.out.println(countgreater(a));
        sc.close();
	}
	public static int countgreater(int arr[]){
	    int n=arr.length;
		int max=arr[0];
		for(int i=0;i<n;i++){
			if(arr[i]>max){
				max=arr[i];
			}
		}
		int maxcount=0;
		for(int i=0;i<n;i++){
			if(arr[i]==max){
				maxcount++;
			}
		}
		return n-maxcount;
	}
}
