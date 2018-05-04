package object_array;

import java.util.Scanner;

class Book 
{
	private int bookId,bookPrice;
	private String bookName,bookAuthName,bookPubName;
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public int getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookAuthName() {
		return bookAuthName;
	}
	public void setBookAuthName(String bookAuthName) {
		this.bookAuthName = bookAuthName;
	}
	public String getBookPubName() {
		return bookPubName;
	}
	public void setBookPubName(String bookPubName) {
		this.bookPubName = bookPubName;
	}


	public Book(int bookId, int bookPrice, String bookName, String bookAuthName, String bookPubName) {
		super();
		this.bookId = bookId;
		this.bookPrice = bookPrice;
		this.bookName = bookName;
		this.bookAuthName = bookAuthName;
		this.bookPubName = bookPubName;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookPrice=" + bookPrice + ", bookName=" + bookName + ", bookAuthName="
				+ bookAuthName + ", bookPubName=" + bookPubName + "]";
	}


}



public class BookTest 
{
	public static void main(String[] args) 
	{
		Book b[]=new Book[5];
		Scanner scn=new Scanner(System.in);
		int bookId,bookPrice,choice=0,count=0;
		String bookName,bookAuthName,bookPubName;

		do{
			System.out.println(" 1.Add Book \n 2.Update Book \n 3.Delete Book \n 4.Search Book \n 5.View All Books \n 6.Exit");
			System.out.println("Enter your choice : ");
			choice = scn.nextInt();

			switch (choice) {
			case 1:System.out.println("Enter the book Id : ");
					bookId=scn.nextInt();
					System.out.println("Enter the book name : ");
					bookName=scn.next();
					System.out.println("Enter the Auther name : ");
					bookAuthName=scn.next();
					System.out.println("Enter the book publisher name : ");
					bookPubName=scn.next();
					System.out.println("Enter the price of book : ");
					bookPrice=scn.nextInt();

					b[count]=new Book(bookId, bookPrice, bookName, bookAuthName, bookPubName);
					count++;
					System.out.println("Book added Successfully\n");			
					break;

			case 2:System.out.println("Enter the book Id want to be update : ");
					bookId = scn.nextInt();
					for(int i=0; i<count; i++)
					{
						if(b[i]!=null && b[i].getBookId() == bookId)
						{
							System.out.println("Enter the book name :");
							bookName = scn.next();
							b[i].setBookName(bookName);
							System.out.println("Enter the Auther name : ");
							bookAuthName=scn.next();
							b[i].setBookAuthName(bookAuthName);
							System.out.println("Enter the book publisher name : ");
							bookPubName=scn.next();
							b[i].setBookPubName(bookPubName);
							System.out.println("Enter the price of book : ");
							bookPrice=scn.nextInt();
							b[i].setBookPrice(bookPrice);
						}
					}
					System.out.println("Book details updated successfully\n");
					break;
					
			case 3:System.out.println("Enter the book Id want to be delete : ");
					bookId = scn.nextInt();
					for(int i=0; i<count; i++)
					{
						if(b[i]!=null && b[i].getBookId() == bookId)
						{
							b[i]=null;
						}
					}
					System.out.println("Book deleted successfully\n");
					break;
					
			case 4:System.out.println("Enter the book Id want to be search : ");
					bookId = scn.nextInt();
					for(int i=0; i<count; i++)
					{
						if(b[i]!=null && b[i].getBookId() == bookId)
						{
							System.out.println(b[i]);
						}
					}
					System.out.println();
					break;
					
			case 5:System.out.println("*******All Books*******");
					for(int i=0; i<count; i++)
					{
						if(b[i]!=null)
						{
							System.out.println(b[i].toString());
						}
					}
					System.out.println();
					break;
					
			case 6:System.out.println("-----Exited Successfully -----");
					System.exit(0);
					break;
			
			default:System.out.println("Invalid Choice");
				break;
			}
		}while(choice != 6);
		scn.close();
	}

}
