import java.util.*;
class binarytriangle
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int i,j,n;System.out.println("hey");
        for(i=1;i<=5;i++){
            for(j=1;j<=i;j++){
                if (((i+j)%2)==1)
                n=0;
                else
                n=1;
                System.out.print(n+" ");
            }
            System.out.println();
        }
        
    }
}