import java.io.*;
import java.lang.*;
import java.util.*;
public class pattern05
{
    public static void main(String args[])
    {
        int n=5;
        for(int i=n;i>=1;i--)
        {
            for(int j=i;j>=1;j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--)
        {
            for(int j=n-i+1;j>=1;j--)
            {
                System.out.print(j);
            }
            System.out.println();        }
    }
}

