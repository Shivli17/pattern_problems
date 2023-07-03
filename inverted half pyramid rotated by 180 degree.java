import java.util.*;
class invertedhalfpyramid180
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int i,j;
        for(i=4;i>=1;i--){
            for(j=1;j<=4;j++){
                if(j<i)
                System.out.print(" ");
                else
                System.out.print("*");
            }
            System.out.println();
        }
    }
}