import java.io.*;
import java.util.*;
public class GraphNode{
    int data;
    GraphNode next;
    public GraphNode()
    {

        this.next=null;
    }
    public GraphNode(int d)
    {
        this.data=d;
        this.next=null;
    }
}