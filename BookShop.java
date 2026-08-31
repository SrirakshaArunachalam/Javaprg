import java.util.Scanner;
class IncorrectInputException extends Exception{
public IncorrectInputException(String s)
{
super(s);
}
}
class Book{
String author;
String title;
double price;
String publisher;
int stockpos;
public Book(String author, String title, String publisher, double price, int stockpos)
{
this.author=author;
this.title=title;
this.publisher=publisher;
this.price=price;
this.stockpos=stockpos;
}
public void display()
{
System.out.println("Title:"+title);
System.out.println("Author:"+author);
System.out.println("publisher:"+publisher);
System.out.println("price:"+price);
System.out.println("stockpos:"+stockpos);
}
}
public class BookShop{
public static void main(String[]args)
{
Book[] b= new Book("Raksha","Java","arun",890,150),- new Book("RakshaArun","c++","arunananthi",1890,1504);
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Author Name:");
String author=sc.nextLine();
System.out.println("Enter the title Name:");
String title=sc.nextLine();
//System.out.println("Enter the publisher Name:");
//String publisher=sc.nextLine();
//System.out.println("Enter the price:");
//float price=sc.nextFloat();
//System.out.println("Enter the  No of stocks available:");
//int stockpos=sc.nextInt();
Book found=null;
for(Book b1:b)
{
if(b1.title.equalsIgnoreCase(title) && b1.author.equalsIgnoreCase(author))//searches if the book is available or not
{
found=b1;
break;
}
}
if(found==null)
{
System.out.println("Book is not available:");
}
else
{
found.display();
}
try
{
System.out.println("Enter no of copies:");
int copy=sc.nextInt();
if(copy<0)
{
throw new IncorrectInputException("Incorrect range of no of copy of book");
}
if(copy<=found.stockpos)
{
System.out.println("Total cost is:"+(cost*copy));
}
else
{
System.out.println("Error not in stack:");
}
}
catch(IncorrectInputException e){
System.out.println("Error:"+e.getMessage());
}
}
}











