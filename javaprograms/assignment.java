import java.util.Scanner;
public class assignment {
    public static void main (String args[]){       
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of clean cities ");
        int n=sc.nextInt();
        String a[]=new String [n];
        for(int i=1;i<=n;i++){
         System.out.println("enter the"+i+"cleancity");
         String temp=sc.next();
         a[i-1]=temp;
        }
        System.out.println("enter the number of busy cities ");
        int m=sc.nextInt();
        String b[]=new String [m];
        for(int i=1;i<=m;i++){
         System.out.println("enter the"+i+"busycity");
         String cp=sc.next();
         b[i-1]=cp;
        }
        System.out.println("enter the number of calm cities ");
        int p=sc.nextInt();
        String c[]=new String [p];
        for(int i=1;i<=p;i++){
         System.out.println("enter the"+i+"calmcity");
         String mv=sc.next();
         c[i-1]=mv;
        }
        System.out.println("enter the number of party cities ");
        int q=sc.nextInt();
        String d[]=new String [q];
        for(int i=1;i<=q;i++){
         System.out.println("enter the"+i+"partycity");
         String akk=sc.next();
         d[i-1]=akk;
        }
        System.out.println("enter the city name");
        String city =sc.next();
        sc.close();
        for(int i=0;i<n;i++){
            if(a[i].equals(city)){
                System.out.println("is clean city ");
            }
        }
for(int i=0;i<m;i++){
            if(b[i].equals(city)){
                System.out.println("is busy city");
            }
        }
for(int i=0;i<p;i++){
            if(c[i].equals(city)){
                System.out.println("is calm city");
            }
        }
for(int i=0;i<q;i++){
            if(d[i].equals(city)){
                System.out.println("is party city");
            }
        }
        
        
        
    }
}

