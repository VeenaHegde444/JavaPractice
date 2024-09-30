package assignments;
/*Define a class named Book with the following attributes:

String title

String author

int pageCount

 int totalBooks (to keep track of the total number of books)

In the main method:

Create three Book objects and initialize their properties with different values.

Print the details of each book and the total number of books.

Modify the pageCount attribute of one book and print the updated details.

Create another Book object and update the total number of books.

Print the details of the new book and the updated total number of books.
 * 
 * 
 * 
 * 
 * 
 */
public class Book {
	
	String title;
	String author;
	int pageCount;

	public static void main(String[] args) {
		
		int totalBooks=0;
		//create 3 book objects & initialize their properties
		
		Book book1 = new Book();
		book1.title="Pride and Prejudice";
		book1.author="Jane Austen";
		book1.pageCount=281;
		totalBooks++;
		
		
		Book book2 = new Book();
		book2.title="The Monk Who Sold His Ferrari";
		book2.author="Robin Sharma";
		book2.pageCount=198;
		totalBooks++;
		
		Book book3 = new Book();
		book3.title="The God of Small Things";
		book3.author="Arundhati Roy";
		book3.pageCount=321;
		totalBooks++;
		
		System.out.println("Title:"+book1.title+","+"Author:"+book1.author+","+"PageCount:"+book1.pageCount);
		System.out.println("Title:"+book2.title+","+"Author:"+book2.author+","+"PageCount:"+book2.pageCount);
		System.out.println("Title:"+book3.title+","+"Author:"+book3.author+","+"PageCount:"+book3.pageCount);
		System.out.println("Total number of books:"+totalBooks);
		
		//modify page count of one book & print updated details
		
		book2.pageCount=200;
		System.out.println("Updated details:");	
		System.out.println("Title:"+book2.title+","+"Author:"+book2.author+","+"PageCount:"+book2.pageCount);
		
		//create another book & update total no. of books
		Book book4 = new Book();
		book4.title="The Girl On The Train";
		book4.author="Ruskin Bond";
		book4.pageCount=144;
		totalBooks++;
		
		
		//print new book & updated total no. of books
		System.out.println("Title:"+book4.title+","+"Author:"+book4.author+","+"PageCount:"+book4.pageCount);
		System.out.println("Total number of books:"+totalBooks);

	}

}
