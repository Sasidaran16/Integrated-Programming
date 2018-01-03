import java.util.*;
class Node
{
    protected int data;
    protected Node next;
	public Node()
    {
        next=null;
        data=0;
    }    
	public Node(int d,Node n)
    {
        data=d;
        next=n;
    }    
    public void setnext(Node n)
    {
        next=n;
    }    
	public void setData(int d)
    {
        data=d;
    }    
	public Node getnext()
    {
        return next;
    }    
	public int getData()
    {
        return data;
    }
}
 class Stack
{
    protected Node top ;
    protected int size ;
	public Stack()
    {
        top=null;
        size=0;
    }    
	public boolean isEmpty()
    {
        return top==null;
    }      
	public void push(int data)
    {
        Node temp=new Node(data, null);
        if (top==null)
            top=temp;
        else
        {
            temp.setnext(top);
            top=temp;
        }
        size++ ;
    }    
    public int pop()
    {		
			Node temp=top;
			top=temp.getnext();
			size-- ;
			return temp.getData();
    }    
    public int topelement()
    {
        return top.getData();
    }    
    public void display()
    {
		System.out.println("Stack:");
        if (size==0) 
        {
            System.out.print("Empty\n");
            return ;
        }
        Node temp=top;
        while (temp!=null)
        {
            System.out.print(temp.getData()+" ");
            temp=temp.getnext();
        }
        System.out.println();        
    }
}
public class Test
{    
    public static void main(String[] args)
    {
        Scanner get=new Scanner(System.in);     
        Stack s=new Stack();              
        int n;   
        do 
        {
            System.out.println("1.push\n2.pop\n3.Top element\n4.Display");      
            int choice=get.nextInt();
            switch (choice) 
            {
            case 1:
                System.out.println("Enter integer element to push");
                s.push(get.nextInt()); 
                break;                         
            case 2: 
				if(s.isEmpty())
                    System.out.println("The stack is empty");
				else
					System.out.println("Popped Element = "+s.pop());
                break;                         
            case 3: 
                if(s.isEmpty())
                {
					System.out.println("The stack is empty");
                }
                else
					System.out.println("Top Element="+s.topelement());
                break;                           
            case 4: 
                s.display();
                break;                        
            default : 
                System.out.println("Invalid Selection");
                break;
            }                       
            System.out.println("\n1.to continue");
            n=get.nextInt();       
 
        } while(n==1);                 
    }
}