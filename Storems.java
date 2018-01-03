import java.util.*;
import java.io.*;
class Shop extends price
{
	int val;
	
	int ch;
	static int tot;
public void list()
{
do{
System.out.println("List of items available:\n1.Pathanjali oinment--Rs.40\n2.dairymilk--Rs.50\n3.Colgate Paste--Rs.60\n4.Clinic plus Shampoo--Rs.70\n5.Ponds powder--Rs.250\n");
Scanner scan=new Scanner(System.in);
val=scan.nextInt();
amount();
System.out.println("Do you want to continue?\n1.Yes\n2.No\n");
ch=scan.nextInt();
}while(ch!=2);
}
public void amount()
{
pricelist();
int n=val-1;
tot=tot+p[n];
	System.out.println("Total amount is:"+tot+"\n");
}
}
class price
{
	int p[]=new int[5];
public void pricelist()
{
p[0]=40;
p[1]=50;
p[2]=60;
p[3]=70;
p[4]=250;
}
}
public class Storems extends Shop
{
	public static void main(String args[])
	{
	Shop obj=new Shop();
	obj.list();
	}
}