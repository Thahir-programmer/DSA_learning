import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class noloop2 {
    public static void main (String args[]){       
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of clean cities ");
        int n=sc.nextInt();
        //String a[]=new String [n];
        List<String> a = new ArrayList<>();  //creating list
        for(int i=1;i<=n;i++){
         System.out.println("enter the"+i+"cleancity");
         //String temp=sc.next();
        //a[i-1]=temp;
        a.add(sc.next());
        }
        //List<String>alist=Arrays.asList(a);
        System.out.println("enter the number of busy cities ");
        int m=sc.nextInt();
        //String b[]=new String [m];
        List<String> b = new ArrayList<>();
        for(int i=1;i<=m;i++){
         System.out.println("enter the"+i+"busycity");
        // String cp=sc.next();
        // b[i-1]=cp;
        b.add(sc.next());
        }
        //List<String>blist=Arrays.asList(b);
        System.out.println("enter the number of calm cities ");
        int p=sc.nextInt();
        //String c[]=new String [p];
        List<String> c = new ArrayList<>();
        for(int i=1;i<=p;i++){
         System.out.println("enter the"+i+"calmcity");
         //String mv=sc.next();
         //c[i-1]=mv;
         c.add(sc.next());
        }
        //List<String>clist=Arrays.asList(c);
        System.out.println("enter the number of party cities ");
        int q=sc.nextInt();
        //String d[]=new String [q];
        List<String> d = new ArrayList<>();
        for(int i=1;i<=q;i++){
         System.out.println("enter the"+i+"partycity");
         //String akk=sc.next();
         //d[i-1]=akk;
         d.add(sc.next());
        }
        //List<String>dlist=Arrays.asList(d);
        System.out.println("enter the city name");
        String city =sc.next();
        sc.close();

            if(a.contains(city)){
                System.out.println("is clean city ");
            }

            if(b.contains(city)){
                System.out.println("is busy city");
            }

            if(c.contains(city)){
                System.out.println("is calm city");
            }
        
            if(d.contains(city)){
                System.out.println("is party city");
            }
        
        
        
    }
}

