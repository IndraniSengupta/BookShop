package JFS.Book;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary //If it is not specifieed that interface will implement which class then a class is given primary annotion so that interface gives that class priority
public class MyFavBook implements MyBookInterface {
	

	
	@Value("#{100+25}")//Spring expression language//@VALUE-ASSIGNING VALUE TO THE INSTANCE VARIABLE
	public int favbkid;
	
	@Value("Sherlock Holmes")
	public String favbkname;
	
	@Value("#{'Arthur ' + 'Conan '+ 'Doyle'}")
	public String author;
	
	
	public void myFavBook() {
		System.out.println("Sherlock Holmes");
	
	}

	@Override
	public String toString() {
		return "MyFavBook [favbkid=" + favbkid + ", favbkname=" + favbkname + ", author=" + author + "]";
	}


	public void my1stBook() {
		System.out.println("Interface Method implemented inside favbook class");
		
	}

}

