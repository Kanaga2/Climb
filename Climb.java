# Climb
import java.io.*;
import java.util.*;
public class Climb
{
public static void main(String args[])
{
int n;
if(n<2)
{
return 1;
}
int a=1;
int b=1;
int c=1'
for(int i=2,i<=n;i++)
{
c=b;
b=a+b;
a=c;
}
return b;
}
}
