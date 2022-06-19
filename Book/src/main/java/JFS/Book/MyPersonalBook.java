package JFS.Book;

import org.springframework.stereotype.Component;

@Component
public class MyPersonalBook implements MyBookInterface{

	public void my1stBook() {
		System.out.println("interface implemented from personal book class");
		
	}
	
	

}
