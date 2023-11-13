package com.app.publish;

import java.time.LocalDate;

public class Book extends Publication {
 private int pageCount;

public int getPageCount() {
	return pageCount;
}

public Book(String title, double price, LocalDate publishDate, int ratings, int pageCount) {
	super(title, price, publishDate, ratings);
	this.pageCount = pageCount;
}

public void setPageCount(int pageCount) {
	this.pageCount = pageCount;
}

@Override
public String toString() {
	return "Book [pageCount=" + pageCount + "]";
}
 
}
