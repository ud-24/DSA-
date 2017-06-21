import java.io.*;
import java.util.*;
public class GraphsM{
    int[][] a;
    public GraphsM()
    {
       this.a= new int[4][4];
       for(int i=0;i<4;i++)
       {
           for(int j=0;j<4;j++)
           a[i][j]=0;
       } 
    }
    public GraphsM(int r)
    {
         this.a= new int[r][r];
       for(int i=0;i<4;i++)
       {
           for(int j=0;j<4;j++)
           a[i][j]=0;
       }

    }
    void insertEdgeU(int u,int v)
    {
        this.a[u][v]=1;
        this.a[v][u]=1;
    }
    void deleteEdgeU(int r,int s)
    {
        this.a[r][s]=0;
        this.a[s][r]=0;
    }
    void display()
    {
        for(int k=0;k<a.length;k++)
        {
            for(int j=0;j<a.length;j++)
            {
                if(a[k][j]==1)
                System.out.println(k+"  "+j);
            }
        }
    }
    void bfs()
    {
        int d=0;
        int l=a.length;
        int visited[]= new int[a.length];
        for(int i=0;i<l;i++)
      visited[i]=0;
    MyQueue q= new MyQueue(l);
        visited[0]=1;
        q.insert(a[0][0]);
        while(!q.isEmpty())
        {
            int al=q.peek1();
            
            if(al!=-1)
            {q.pop();
                for(int t=0;t<l;t++)
                {
                    if(a[al][t]==1)
                    {
                        if(visited[t]==0)
                        {
                            visited[t]=1;
                            q.insert(t);
                        }
                    }
                }
            }
            
        }
        
       
    }
    void dfs()
    {
        //CODE
    }
}