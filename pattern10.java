import java.io.*;
import java.lang.*;
import java.util.*;
public class pattern10
{
    public static void main(String args[])
    {
        int  n=5,k=1;
        for(int i=0;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }
    }
}

