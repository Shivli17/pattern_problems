import java.util.*;
class butterflypattern
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int i,j,s,k,n=5,l;
        for(i=1;i<=n;i++){
            for(s=1;s<=i;s++){
                System.out.print("*");
            }
            for(l=1;l<=(n-i)*2;l++){
                System.out.print(" ");
            }  
            for(k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(i=n;i>=1;i--){
            for(s=1;s<=i;s++){
                System.out.print("*");
            }
            for(l=1;l<=(n-i)*2;l++){
                System.out.print(" ");
            }
            for(k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}