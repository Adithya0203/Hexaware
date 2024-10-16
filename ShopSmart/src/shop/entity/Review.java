package shop.entity;

public class Review {
	private int rating;
	private String comment;
	
//	constructor
	public Review(int rating, String comment) {
		super();
		this.rating = rating;
		this.comment = comment;
	}
	
//	getter and setter
	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		if(rating >= 1 && rating <= 5) {
			this.rating = rating;
		} else {
			System.out.println("Invalid rating");
		}
		
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	
//	method
	
//	to display the review
	public void displayReview() {
        System.out.println("Rating: " + rating + "/5");
        System.out.println("Comment: " + comment);
	}
}
