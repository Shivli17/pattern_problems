import java.util.*;
class firstclass
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int i,j;
        for(i=1;i<=4;i++){
            for(j=1;j<=5;j++){
                if(i==1||j==1||i==4||j==5)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }
        
    }
}
