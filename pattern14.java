import java.io.*;
import java.lang.*;
import java.util.*;
public class pattern14
{
    public static void main(String args[])
    {
        int  n=5;
        for(int i=1;i<=n;i++)
        {
        //    for(int k=i;k>=1;k++)
        //    {
        //        System.out.print(" ");
        //    }
        //    int temp=i;
            for(int j=1;j<=i;j++)
            {
                   // int temp=i;
                    {
                    System.out.print(j+" ");
            //    temp=temp+n;
                    }
            //     else   
         //       System.out.print(j+6+" ");
            }
         //   while(i>1)
        //    {
                for(int k=i-1;k>=1;k--)
                {
                   System.out.print(k+" ");
                }
            System.out.println();
        }
    }
}




