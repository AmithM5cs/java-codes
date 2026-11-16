import java.util.Scanner;
public class bits{
    public int hammingweight(int n) {
        int count=0;

        while(n!=0){
            count+=(n&1);
            n=n>>>1;

        }
          return count;
      
    }

public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
        
    System.out.print("Enter n: ");
    int n =sc.nextInt();

    bits obj=new bits();
    int count=obj.hammingweight(n);
    System.out.println(count);
    sc.close();
    
        
        
    }
}