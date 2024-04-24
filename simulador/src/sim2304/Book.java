package sim2304;

import java.util.Objects;

public class Book {
	
	private int ISBN;
	private String title, author;
	private int pageCount;
	
	@Override //Collections 
	public int hashCode() {
		return Objects.hash(ISBN);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) //VALIDA SI ES EL MISMO OBJETO
			return true;
		if (obj == null) //VALIDA QUE NO SEA NULL
			return false;
		if (getClass() != obj.getClass()) //ALTERNATIVA instanceof
			return false;
		Book other = (Book) obj;
		return ISBN == other.ISBN;
	}

//	public int hashCode() {
//		return ISBN;
//	}

//	public boolean equals(Object obj) {
//		Book other = (Book)obj; //Exception ClassCastException
//		return this.ISBN == other.ISBN;
//	}
	
	
	
	
}