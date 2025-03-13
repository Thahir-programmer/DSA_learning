import java.util.Scanner;
public class newprg {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	 int n=sc.nextInt();
	 int arr[]=new int[n];
	 for(int i=0;i<n;i++){
	   arr[i]=sc.nextInt();
	 }
	 int k=sc.nextInt();
	 k=k%n;
	 int s=sc.nextInt();
	 int e=sc.nextInt();
     sc.close();
	 reverse(arr,s,n-1);
	 reverse(arr,s,k-1);
	 reverse(arr,k,n-1);
	 for(int i=0;i<n;i++){
	    System.out.print(arr[i]+" ");
	  }
	}
 public static void reverse(int arr[],int s,int e){
    int sp=s;
    int ep=e;
   while(sp<ep){
        int temp=arr[sp];
        arr[sp]=arr[ep];
        arr[ep]=temp;
        sp++;
        ep--;
    }
 }
}
