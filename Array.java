import java.io.*;
import java.util.*;
public class Array{

protected int[] a;
//CONSTRUCTOR 
public Array()
{

}
    public Array(int n)
{
    a = new int[n];
}

//READ INPUT
   void read()
   {
       //int sq=a.length;
       Scanner s= new Scanner(System.in);
       for(int i=0;i<a.length;i++)
       {
           a[i]=s.nextInt();
       }
   }

   //REVERSE
  void reverse()
   {
       int l=a.length;
       int t;
       int j=l-1;
       int i=0;
      while(i<=j){
          
          t=a[i];
          a[i]=a[j];
          a[j]=t;
          j--;
        i++;
      }
   
      
   }
   //SHOW
void display( )
{
    int l=a.length;
    for(int i=0;i<l;i++)
    System.out.print(a[i]+"   ");
}
//SORTING
void sort()
{
    //insert code for sort
}
//DELETE
void delete(int n)
{
    int i=0;
    for( i=0;i<a.length;i++)
    {
        if(a[i]==n)
        break;
    }
    while(i<(a.length-1))
    {
        a[i]=a[i+1];
        i++;
    }
    a[i]=-1;
    
}

//SEARCH
int search(int n)
{
int l=a.length;
int i=0;
int flag=0;
for( i=0;i<l;i++)
{
   //  flag=0;
    if(a[i]==n)
{   
    flag=1;
     break;
}
   else
    continue;
}
if(flag==1)
return i+1;
else 
return 0;

}
// REPLACE
void replace(int m,int n)
{
    int l=a.length;
    int i;
    for(i=0;i<l;i++)
    {
        if(a[i]==m){
        a[i]=n;
       //  System.out.println(m+n);
     //   break;
       
    }
 //   else
   // continue;
    }
}

}
