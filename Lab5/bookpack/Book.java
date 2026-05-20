package bookpack;

public class Book{
	protected String title, author;
	protected int pubDate;
	public Book(String t, String a, int d){
		title = t;
		author = a;
		pubDate = d;
	}
	public void show(){
		System.out.println("title: " + title);
		System.out.println("author: " + author);
		System.out.println("pubDate: " + pubDate);
	}
}
