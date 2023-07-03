import java.util.*;
class rombus
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
                System.out.print("*");
            }
            System.out.println();
        }
    }
}