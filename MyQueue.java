import java.io.*;
import java.util.*;
public class MyQueue{
       int front;
    int rear;
    int[] a;
    public MyQueue()
    {
        this.front=-1;
        this.rear=-1;
        this.a= new int[6];
    }
     public MyQueue(int r)
    {
        this.front=-1;
        this.rear=-1;
        this.a= new int[r];
    }
    void insert(int d)
    {
        if((this.front==-1)&&(this.rear==-1))
        {
            this.front++;
            this.rear++;
            this.a[rear]=d;
        }
        else if(this.rear<(this.a.length-1))
            {
            this.rear++;
            this.a[rear]=d;
        
        }
        
        else{
           System.out.println("QUEUE IS FULL");
        }
    }
    void display()
    {
        for(int i=0;i<a.length;i++)
        System.out.println(a[i]);
    }
    void pop()
    {
        //int r;
        if(front<0)
        System.out.println("The queue is empty");
        else
        {
            System.out.println(a[front]);
            front++;
        }
      //  return r;
    }
    void peek()
    {
        if(front<0)
        System.out.println("The queue is empty ");
        else
        System.out.println(a[front]);

}

}