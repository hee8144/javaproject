package review_Day3;

public class EBook extends Book{
	private double fileSize;
	private String title;
	
	public EBook() {
		this("Unkown","Unkown",0.0);
	}
	
	public EBook(String title , String author,double fileSize) {
		super(title,author);
		this.fileSize=fileSize;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setFileSize(double fileSize) {
		this.fileSize=fileSize;
	}
	
	public void printInfo() {
		System.out.println(getTitle()+ " - " + getAuthor() + " , 파일크기 : "+ fileSize);
	}
}

