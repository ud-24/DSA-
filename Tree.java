import java.io.*;
import java.util.*;
public class Tree{
    tNode root;
    public Tree()
    {
        root=null;
    }
    //INSERT IN A BST
    void insert(int data)
    {
        tNode d= this.root;
        tNode n= new tNode(data);
        tNode p=null;
        if(d==null)
        this.root=n;
        else
        {
            int flag=0;
            while(d!=null)
            {
                if(d.data>data)
                {
                    p=d;
                    d=d.left;
                }
                else if(d.data==data)
                {
                flag=1;
                System.out.println("data already present");
                break;
                }
                else{
                    p=d;
                    d=d.right;
                }
            }
            if(flag==1)
            System.out.println("data already present");
            else
            {
                if(p.data>data)
                p.left=n;
                else
                p.right=n;
            }
        }
    }
    //INORDER TRAVERSAL LEFT ROOT RIGHT
    void inorder(tNode r)
    {
        if(r==null)
        return;
        //tNode n=this.root;
        inorder(r.left);
        System.out.println(r.data);
        inorder(r.right);

    }
    //PRE ORDER TRAVERSAL ROOT LEFT RIGHT
    void preorder(tNode r)
    {
        if(r==null)
        return;
        System.out.println(r.data);
        preorder(r.left);
        preorder(r.right);
    }
    //POST ORDER TRAVERSAL LEFT RIGHT ROOT
    void postorder(tNode r)
    {
        if(r== null)
        return;
        postorder(r.left);
    
        postorder(r.right);
        System.out.println(r.data);
    }    
    /* for bfs we would need three functions namely
    1. height
    2. printnode(prints a node)
    3.sends the levelof node*/
    int height(tNode r)
    {
        if(r==null)
        return 0;
        else
        {
            int l=height(r.left);
            int ri=height(r.right);
            if(l<ri)
            return ri+1;
            else
            return l+1;
        }
    }
    void printnodes(tNode r)
    {
        if(r==null)
        System.out.println("tree is empty");
        else
        {
            int h=height(r);
            h++;
            for(int i=1;i<h;i++)
            printnode(r,i-1);
        }
    }
    void printnode(tNode r,int h)
    {
        if(r==null)
        return;
        if(h==0)
        System.out.println(r.data);
        
        else{
            printnode(r.left,h-1);
            printnode(r.right,h-1);

        }
    }
    void delete(int d)
    {
        tNode r=this.root;
        tNode p=null;
        tNode temp=null;
        if(r==null)
        System.out.println("The list is empty ");
        else
        {
        while(r.data!=d)
        {
            if(r.data<d)
            {
                p=r;
                r=r.right;
                System.out.println(p.data+"   "+r.data);
            }
            else
            {
                p=r;
                r=r.left;
                System.out.println(p.data+"   "+r.data);
            }
        }
        //LEAF NODE CASE
  if((r.left==null && r.right==null)&& p!=null)
  {
      System.out.println("hi");
      if(p.data>d)
      p.left=null;
      else
      p.right=null;
  }
  // ROOT TO BE DELETED
 else if((r.left==null && r.right==null)&& p==null)
{
    this.root=null;
}
else
{
    tNode l=null;
    int flag=0;
    if(r.left!=null)
    {
        flag=1;
        while(r!=null)
        {
            l=r;
            r=r.right;
        }
    }
    else
    {
        flag=2;
        while(r!=null)
        {
            l=r;
            r=r.left;
        }
    }
    if(p.data>d)
    {
        if(flag==1)
       { p.left.data=l.right.data;
        l.right=null;
       }
       else
        {
          p.left.data=l.left.data;
        l.left=null;  
        }
    }
    else
    {
        if(flag==1){
        p.right.data=l.right.data;
        l.right=null;
        }
        else
        {
          p.right.data=l.left.data;
        l.left=null;  
        }
    }

}
    
 
    }
}        
 }  

