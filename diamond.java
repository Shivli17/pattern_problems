import java.util.*;
class diamond
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int i,s,k,n=4,l;
        for(i=1;i<=n;i++){
            for(s=n-1;s>=i;s--){
                System.out.print(" ");
            }
            for(l=1;l<=i;l++){
                System.out.print("*");
            }  
            for(k=2;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(i=n-1;i>=1;i--){
            for(s=n-1;s>=i;s--){
                System.out.print(" ");
            }
            for(l=1;l<=i;l++){
                System.out.print("*");
            }  
            for(k=2;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}