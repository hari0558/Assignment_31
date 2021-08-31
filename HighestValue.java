import java.util.*;
public class HighestValue
{
public static int getHighestvalue(int a[],int total)
{
Arrays.sort(a);
return a[total-3];
}
public static void main(String args[])
{
int a[]={1,3,5,6,4,2};
int b[]={66,88,11,33,99};
System.out.println("HighestValue: "+getHighestvalue(a,6));
System.out.println("HighestValue: "+getHighestvalue(b,5))
}
}
