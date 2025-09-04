
class Book {
	String title;
	String author;
	Boolean issued;
	static int totalBooks = 0;
	 
     

       
	 Book(String title, String author, boolean issued){
		this.title = title;
		this.author = author;
		this.issued = issued;
		
		totalBooks++;
	}
	
	int getTotalBook(){
		return totalBooks;
	}
	
	public void setIssued(boolean issued){
		if(this.issued != issued){
			this.issued = issued;
			if(issued){
				totalBooks++;
			}
			else{
				totalBooks--;
			}
		}
	}
	  void displayBooks(){
		System.out.println("title: " + title + ", author: " + author + ", issued: " + issued);
	}
	
}
class totalIssuedBooks {
	public static void main(String args[]){
		Book b1 = new Book("Harry Potter" , "J.K. Rowling" , true);
		Book b2 = new Book("Five Point Someone", "Chetan Bhagat", false);
		Book b3 = new Book("Rich Dad Poor Dad" , "Robert Kiyosaki" , true);
		
		
		b1.displayBooks();
		b2.displayBooks();
		b3.displayBooks();
		
         
	}	
		 
	}

	
	
	
	