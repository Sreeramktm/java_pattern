import java.io.*;
import java.lang.*;
import java.util.*;
public class pattern13
{
    public static void main(String args[])
    {
        int  n=5;
        for(int i=1;i<=n;i++)
        {
            for(int k=n-i;k>=1;k--)
            {
                System.out.print(" ");
            }
            int temp=i;
            for(int j=i;j>=1;j--)
            {
                   // int temp=i;
                    {
                    System.out.print(temp+" ");
                temp=temp+n;
                    }
            //     else   
         //       System.out.print(j+6+" ");
            }
            System.out.println();
        }
    }
}


