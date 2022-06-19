package JFS.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import JFS.Book.MyFavBook;

@Component    //each class is a component
//when ever u r creating a class and giving the "component" annotation,
//"appconfig" will automatically create a Bean fir that class and all things put together,
//it is called application context


public class MyBookPojo {
    public int bookid;
	
	     //when another class is referred a class..autowired is used to connect all the classes
	//Autowiring book class with favbook class
	//@Qualifier ("mfbean")
   @Autowired 	 
   public MyFavBook myFavBook; //referring another class inside this

   @Autowired
   public MyPersonalBook myPersonalBook;  //DEPEMNDENCY INJECTION(CONNECTING ONE CLASS TO OTHER CLASS)

   @Autowired
   public MyBookInterface myBookInterface;


	
	@Value("#{myFavBook.author?.toUpperCase()}")
	public String publisher;
	

	public int getBookid() {
		return bookid;
	}


	public void setBookid(int bookid) {
		this.bookid = bookid;
	}


	public MyFavBook getMyFavBook() {
		return myFavBook;
	}


	public void setMyFavBook(MyFavBook myFavBook) {
		this.myFavBook = myFavBook;
	}

	public void show()
	{
		System.out.println("My Book Class Method");
		System.out.println("Publisher name: " +publisher);
		myFavBook.myFavBook();
		System.out.println(myFavBook);
		myBookInterface.my1stBook();
		myPersonalBook.my1stBook();
		myFavBook.my1stBook();
	}

	
}
