import java.io.*;
import java.util.*;
public class MyStack{
    int top;
    int[] a;
    public MyStack() 
    {
        this.top=-1;
        this.a= new int[20];
    }
    public MyStack(int r)
    {
        this.top=-1;
        this.a=new int[r];
    }
    void push(int b)
    {
       
        int l=this.a.length;
        if((this.top+1)>(l-1))
        System.out.println("Array is full");
        else
        { 
            this.top++;
        this.a[this.top]=b;
    } }
    void pop()
    {
        if(this.top<0)
        System.out.println("stack is empty ");
        else if(this.top>(a.length))
        System.out.println("Not possible");
        else 
        {
            System.out.println(a[this.top]);
           this.top--;
        }
    }
}