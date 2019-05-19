import java.io.*;
import java.lang.*;
import java.util.*;
public class pattern06
{
    public static void main(String args[])
    {
        int n=5;
        for(int i=1;i<=5;i++)
        {
            for(int k=n-i;k>1;k--)
            {
                System.out.print(" ");
            }
            for(int j=1;j<i+1;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

