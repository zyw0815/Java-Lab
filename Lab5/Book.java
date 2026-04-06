class Book{
	private String title, author;
	private int pubDate;
	Book(String t, String a, int d){
		title = t;
		author = a;
		pubDate = d;
	}
	void show(){
		System.out.println("title: " + title);
		System.out.println("author: " + author);
		System.out.println("pubDate: " + pubDate);
	}
}
