
package huffman;

import java.util.LinkedList;

public class Node extends LinkedList
{
    private char ch=' ';
    private int freq=0;
    private Node left;
    private Node right;
    private Node top;
    
    public Node(char ch, int freq)
    {
        this.ch=ch;
        this.freq=freq;
    }
    
    public void setLeft(Node node)
    {
       this.left=node; 
    }
    public void setRight(Node node)
    {
        this.left=node;
    }
    public void setTop(Node node)
    {
        this.top=node;
    }
    public void setFreq(int num1, int num2 )
    {
        this.freq=num1+num2;
    }
    public Node getTop()
    {
        return this.top;
    }
    public Node getLeft()
    {
        return this.left;
    }
    public Node getRight()
    {
        return this.right;
    }
    public int getFreq()
    {
        return this.freq;
    }
    public char getChar()
    {
        return this.ch;
    }
    public void Addfreq()
    {
        this.freq++;
    }
   
}
