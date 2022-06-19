package JFS.Book;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "HELLO BOOK LOVERS !!!!!!!");
        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        MyBookPojo obj=context.getBean(MyBookPojo.class);//me r taking MyBookPojo "bean"..We can create and call any other bean"
       //This use of bean for object creation is INVERSION OF CONTROL
        obj.show();                                              
        ((AbstractApplicationContext) context).close();//We call the Bean from driver class
    }
}
