import java.util.*;
class Pattern4
{
public static void main(String args[ ])
{
Scanner sc=new Scanner(System.in);
int n,i,j;
System.out.println("Enter n value : ");
n=sc.nextInt();
for(i=1;i<=n;i++)
{
for(j=1;j<=i;j++)
{
System.out.println(j+" ");
}
System.out.println( );
}
}
}