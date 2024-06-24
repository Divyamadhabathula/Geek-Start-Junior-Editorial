import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        int n,flag=0,temp=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int [] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(a[i]<=0)
            {
                flag++;
            }
        }
        if(flag>0)
        {
            System.out.println(flag);
        }
        else{
            System.out.println(temp);
        }
    }
}