package Assignment2;
import java.util.Scanner;
public class Product {
Scanner in=new Scanner(System.in);
int prod_id,prod_rate,prod_quantity,amount=1;
float net_amnt=0,dis;

String prod_name;
void get_data()
{
System.out.println(&quot;enter the product id : &quot;);
prod_id=in.nextInt();
System.out.println(&quot;enter the name of product : &quot;);
prod_name=in.next();
System.out.println(&quot;enter the rate of product : &quot;);
prod_rate=in.nextInt();
System.out.println(&quot;enter the quantity of products : &quot;);
prod_quantity=in.nextInt();
amount=prod_quantity*prod_rate;
dis=amount*0.1f;
net_amnt=amount-dis;
}
void show_data()
{
System.out.print(&quot;\n&quot;+prod_id);
System.out.print(&quot;\t\t&quot;+prod_name);
System.out.print(&quot;\t\t&quot;+prod_rate);
System.out.print(&quot;\t &quot;+prod_quantity);
System.out.print(&quot;\t\t &quot;+amount);
System.out.print(&quot;\t\t&quot;+dis);
System.out.print(&quot;\t &quot;+net_amnt);
}
public static void main(String[] args)
{
Product d1=new Product();
Product d2=new Product();
Product d3=new Product();
d1.get_data();
d2.get_data();
d3.get_data();
System.out.println(&quot;\nproduct details are :\n&quot;);
System.out.print(&quot;prod id &quot;);
System.out.print(&quot;\tprod.Name &quot;);
System.out.print(&quot;\tRate &quot;);
System.out.print(&quot;\tprod.quant &quot;);
System.out.print(&quot;\tprod.amount &quot;);
System.out.print(&quot;\tdis &quot;);
System.out.println(&quot;\tnet_amnt&quot;);

System.out.println(&quot;\n-------------------------------------------------------------------------

-----------------&quot;);

d1.show_data();
d2.show_data();
d3.show_data();
}
}
