import java.io.*;
import java.lang.*;
import java.util.*;
public class pattern07
{
    public static void main(String args[])
    {
        int  n=5;
        for(int i=1;i<=5;i++)
        {
            for(int j=n;j>=i;j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

