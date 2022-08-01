package lib;

public class Books extends Items {
	
	private String genre;
	private String author;
	
	
	public Books(String itemName, String genre, String author) {
		super(itemName);
		this.genre = genre;
		this.author = author;
	}


	public String getGenre() {
		return genre;
	}


	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "Book [author=" + author + ", name=" + getItemName() + ", genre=" + genre + ", isCheckedIn=" + isCheckedIn() + "]";
	}


	@Override
	public String reading() {
		return "Enjoy your reading";
	}
	
	

}
