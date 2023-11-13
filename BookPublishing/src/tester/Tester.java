package tester;

import static collectionUtils.BooksAndTapesDatabase.populatedList;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

import com.app.publish.Book;
import com.app.publish.Publication;
import com.app.publish.Tape;

public class Tester {
	public static void main(String[] args)
	{
		//Add populatedList
		ArrayList <Publication> finalBookAndTapeList=populatedList();
	Scanner sc =new Scanner(System.in);
	boolean exit=true;
		while(exit) 
		{
			System.out.println("Choose One option from following Menu");
			System.out.println("\n1.Publish new book");
			System.out.println("\n2.Publish new tape");
			System.out.println("\n3.List all books in descending order");
			System.out.println("\n4.List top 5 publications of current year based on rating");
			System.out.println("\n5.Remove publications which are 5 years old");
			 int option=sc.nextInt();
			 
// (String title, double price, LocalDate publishDate, int ratings, int pageCount) 
			switch(option) {
			case 1 : System.out.println("Enter Title,Price,Date, Rating,pageCount");
			finalBookAndTapeList.add(new Book(sc.next(),sc.nextDouble(),LocalDate.parse(sc.next()),sc.nextInt(),sc.nextInt()));
			System.out.println("Book added successfully");	 
		    break;
		   // String title, double price, LocalDate publishDate, int ratings, int playingTime
			case 2 : System.out.println("Enter Title,price,Date,Rating,playingTime");
					finalBookAndTapeList.add(new Tape(sc.next(),sc.nextDouble(),LocalDate.parse(sc.next()),sc.nextInt(),sc.nextInt());
			         break;
			case 3 : System.out.println();
//			Collections.sort(taskList, (T1, T2) -> T1.getTaskDate().compareTo(T2.getTaskDate()));
//			Collection.sort(finalBookAndTapeList,(P1,P2)->P1.get)
	//	if(	LocalDate.parse("2023-01-01").minusMonths(5));
					break;
			case 4 :
				for(Publication p:finalBookAndTapeList) {
					if(p.getPublishDate().isBefore(LocalDate.now().minusYears(5))){
						finalBookAndTapeList.remove(p);
					}
				}
					break;
			case 5 :
					break;
			case 6 :
				exit=false;
		            break;
			}
	
		}
	}
}
