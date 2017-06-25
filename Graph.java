import java.io.*;
import java.util.*;
public class Graph{
    GraphList[] l ;
    public Graph()
    {
        this.l= new GraphList[5];
        for(int i=0;i<5;i++)
        l[i]= new GraphList();
    }
    public Graph(int r)
    {
        this.l= new GraphList[r];
    }
    void insertG( int u,int v)
    {
        this.l[u].insert(v);
        this.l[v].insert(u);
    }
    void displayG()
    {
        for(int i=0;i<5;i++)
        {
            this.l[i].display();
        }
    } 
}