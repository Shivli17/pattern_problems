import java.util.*;
class hollowrombus
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int i,j,s;
        for(i=1;i<=5;i++){
            for(s=4;s>=i;s--){
                System.out.print(" ");
            }
            for(j=1;j<=5;j++){
                if(j==1||j==5||i==1||i==5)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}