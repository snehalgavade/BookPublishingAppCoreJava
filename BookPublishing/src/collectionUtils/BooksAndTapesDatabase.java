package collectionUtils;

import java.time.LocalDate;
import java.util.ArrayList;

import com.app.publish.Publication;

public class BooksAndTapesDatabase {
   public static ArrayList<Publication> populatedList(){
	   ArrayList<Publication> booksAndTapesList=new ArrayList();
   booksAndTapesList.add (new Publication("abc",1234,LocalDate.parse("1994-03-05"),5));
   	booksAndTapesList.add(new Publication("pqr",2345,LocalDate.parse("2023-03-11"),8));
   	booksAndTapesList.add(new Publication("stm",2345,LocalDate.parse("2013-02-11"),8));
   	booksAndTapesList.add(new Publication("jkl",2345,LocalDate.parse("2011-04-23"),4));
   	booksAndTapesList.add(new Publication("mnp",2345,LocalDate.parse("2000-12-16"),9));
   	booksAndTapesList.add(new Publication("jsd",2345,LocalDate.parse("2000-06-01"),7));
   	booksAndTapesList.add(new Publication("kwf",2345,LocalDate.parse("2022-06-01"),4));
   	booksAndTapesList.add(new Publication("klf",2345,LocalDate.parse("2000-06-01"),5));
   	booksAndTapesList.add(new Publication("usid",2345,LocalDate.parse("2000-06-01"),7));
   	
  
	   return booksAndTapesList;
   }
   
}
//public Publication(String title, double price, LocalDate publishDate, int ratings) {
//	super();