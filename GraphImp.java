import java.io.*;
import java.util.*;
public class GraphImp{
    public static void main(String args[])
    {
       Graph g = new Graph();
       g.insertG(0,1);
       g.insertG(0,2);
       g.insertG(0,3);
       g.insertG(1,2);
       g.insertG(1,4);
       g.insertG(2,3);
       g.insertG(2,4);
       g.displayG();
    }
}