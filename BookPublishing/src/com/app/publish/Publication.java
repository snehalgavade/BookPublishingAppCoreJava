package com.app.publish;

import java.time.LocalDate;
import java.util.Objects;

public class Publication {
    static int counter=0;
	private	int id;
    private String title;
    private double price;
    private LocalDate publishDate;
    private int ratings;
	public Publication(String title, double price, LocalDate publishDate, int ratings) {
		super();
		this.id=++counter;
		this.title = title;
		this.price = price;
		this.publishDate = publishDate;
		this.ratings = ratings;
	}
	@Override
	public String toString() {
		return "\nPublication [id=" + id + ", title=" + title + ", price=" + price + ", publishDate=" + publishDate
				+ ", ratings=" + ratings + "]";
	}
	public static int getCounter() {
		return counter;
	}
	public static void setCounter(int counter) {
		Publication.counter = counter;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public LocalDate getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(LocalDate publishDate) {
		this.publishDate = publishDate;
	}
	public int getRatings() {
		return ratings;
	}
	public void setRatings(int ratings) {
		this.ratings = ratings;
	}
	@Override
	public int hashCode() {
		return Objects.hash(ratings);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Publication other = (Publication) obj;
		return ratings == other.ratings;
	}
  
    
    
}
