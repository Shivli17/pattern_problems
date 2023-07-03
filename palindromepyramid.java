import java.util.*;
class palindromepyramid
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int i,j,s,k;
        for(i=1;i<=5;i++){
            for(s=4;s>=i;s--){
                System.out.print("  ");
            }
            for(j=i;j>=1;j--){
                System.out.print(j+" ");
            }
            for(k=2;k<=i;k++){
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}