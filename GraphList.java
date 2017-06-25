import java.io.*;
import java.util.*;
public class GraphList{
    GraphNode head;
    public GraphList()
    {
        head=null;

    }
    void insert(int r)
    {
        GraphNode p=this.head;
        GraphNode g = new GraphNode(r);
        if(this.head==null)
        {
            this.head=g;
        }
        else
        {
            while(p.next!=null)
            {
                p=p.next;
            }
            p.next=g;
        } 
    }
    void display()
    {
        GraphNode p= this.head;
        if(p==null)
        System.out.println("Empty");
        else{
        while(p!=null)
        {
            System.out.print(p.data+" ");
            p=p.next;
        }
        System.out.println("\n");
        }
    }
}