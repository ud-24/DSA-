import java.io.*;
import java.util.*;
public class Linklist{
   Node head;
    public Linklist()
    {
        this.head=null;
    }


//INSERT AT END

    void insert(int data)
    {
        Node d=this.head;
        Node n= new Node(data);
        if(d==null)
        {
            head=n;
        }
        else
        {
            while(d.next!=null)
            {
                d=d.next;
            }
            d.next=n;
        }
      //  return head;
    }


    //INSERT AS HEAD
    void insertF(int data){
        Node n= new Node(data);
        Node r=this.head;
        if(r==null)
        this.head=n;
        else
        {
            n.next=r;
            this.head=n;
        }
    }

    //DISPLAY

    void display()
{
    Node r=this.head;
    if(r==null)
    System.out.println("List is empty");
    else{
    while(r!=null)
    {
        System.out.println(r.data);
        r=r.next;
    }}
}

// DELETE A PARTICULAR VALUE
void delete(int d)
{
    Node r=this.head;
    Node p=null;
    while(r.data!=d)
    {
        p=r;
        r=r.next;
    }
    if(p==null)
    this.head=this.head.next;
    else
    p.next=r.next;
}

//DELETE LAST
void deleteLast()
{
    Node d=this.head;
    Node p=null;
    if(d==null)
    System.out.println("List is empty");
    while(d.next!=null)
    {
        p=d;
        d=d.next;
    }
    if(p==null)
    this.head=null;
    else 
    {
        p.next=null;
    }
}

//Delete first
void deleteF()
{
    Node d=this.head;
    Node p=null;
    if(d==null)
    {
        System.out.println("List is empty");
    }
    else{
        this.head=this.head.next;
    }
}
void reverse(){
    Node curr=this.head;
    Node prev=null;
    Node next1=null;
    while(curr!=null)
    {
        next1=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next1;
        
    }
    this.head=prev;
}
void insertC(int d)
{
    Node p=this.head;
    Node n= new Node(d);
    if(p==null){
    this.head=n;
    n.next=n;}
    else{
        while(p.next!=this.head)
        {
            p=p.next;
        }
        p.next=n;
        n.next=this.head;
    }
}
void displayC()
{
    Node d=this.head;
    if(d==null)
    System.out.println("No element found");
    else{
    while(d.next!=this.head)
    {
        System.out.println(d.data);
        d=d.next;
    }
   // d=d.next;
    System.out.println(d.data);
    }
}
void deleteFC()
{
    Node n=this.head;
    Node p=n.next;
    if(n.next==n){
    this.head=null;
    System.out.println("Only one ");
    }
    else{
    while(n.next!=this.head)
    {
        n=n.next;
    }
    n.next=p;
    this.head=p;
    }
}
void deleteLC()
{

    Node n=this.head;
    Node p=null;
    if(n==null)
    System.out.println("no element found");
    else if( n.next==n){
    System.out.println("only one element");
    this.head=null;
    }
    else{
        while(n.next!=this.head)
        {
            p=n;
            n=n.next;
        }
        p.next=this.head;
    }
}
void deleteC(int d)
{
Node n=this.head;
Node p=null;
if(n==null)
System.out.println("no element found");
else if(n.next==n && n.data==d)
    this.head=null;
    else if(n.next==n)
        System.out.println("element not found");
else {
    while(n.data!=d || n.next!=this.head)
    {
        p=n;
        n=n.next;
    }
    
 if(n.data==d)
    {
        p=n.next;
    }
    else
    System.out.println("Element not found");
}
}

}
