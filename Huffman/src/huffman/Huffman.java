
package huffman;

import java.util.Scanner;

public final class Huffman
{
    public Node tmp;
    public Node N;
    public Node current;
    public Node[] Array=new Node[256];
    
    private int MAX=0;
    private int Hfreq;
    
    public Huffman()
    {
        String Input;
        
        System.out.println("Lindster Carlo Catalma \n"
               + "N22 / CSALGO \n"
               + "Huffman Algo \n"
               + ""
               + "");
       Scanner get=new Scanner(System.in);
       
       System.out.print("Enter A String: ");
       Input = get.nextLine();
       int L = Input.length();
       char[] CH = new char[L];
       
    for(int x = 0 ; x < L ; x++)//transfers String elements into character Array
    {
        CH[x] = Input.charAt(x);
        Char2Node(CH[x]);
    }
    
    this.Display();
    this.NodeSort();
    System.out.println();
    System.out.println("Sorted:");
    this.Display();
    
    
  
    }
    /////////////////////////////End of huffman
    
    
    public static void main(String[] args)
    {
        Huffman huffman= new Huffman();//Java's fuckin one-liner main
    }
    /////////////////////////////END OF VOID MAIN
    
 void Char2Node(char C)
    {
        for(int x=0; x<MAX;x++)
        {
            if(this.Array[x].getChar() == C)
            {
                this.Array[x].Addfreq();
                if(Array[x].getFreq() > Hfreq)
                    Hfreq=Array[x].getFreq();
                
                return;
            }
        }
        tmp = new Node(C,1);
        this.Array[this.MAX]=tmp;
        this.MAX++;
    }
 
 void NodeSort()//bubble sort
 {
     boolean NagSwap=false;
    do
    {
        NagSwap = false;
        for (int x=1 ; x < MAX ; x++)
        {
            System.out.println('Y');
            if (Array[x-1].getFreq() > Array[x].getFreq())
            {
                System.out.println("true");
                tmp=Array[x];
                Array[x]=Array[x-1];
                Array[x-1]=tmp;
                NagSwap=true;
            }
        }
    }while(NagSwap!=false);
 }
 
 void InsertNode(Node node)
 {
     int x;
   for ( x=0; Array[x].getFreq() <= Array[x+1].getFreq();x++)
   {
       Array[x]=Array[x+1];
   }
     Array[x]=node;
 }
 
 void Huffman()
 {
     final int n=0;
     tmp = new Node('`',0);
     tmp.setLeft(Array[0]);
     tmp.setRight(Array[1]);
     tmp.setFreq(Array[0].getFreq(), Array[1].getFreq());
     Array[0].setTop(tmp);
     Array[1].setTop(tmp);
     
 }
 
 void Display()
 {
     for(int x=0; x<MAX;x++)
         System.out.print(this.Array[x].getChar()+" | ");
     
     System.out.println();
     
     for(int x=0; x<MAX;x++)
         System.out.print(this.Array[x].getFreq()+ " | ");
 }
 
 
}
