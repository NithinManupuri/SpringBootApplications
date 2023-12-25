package spring_web.BookStore.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Books {
	@Override
	public String toString() {
		return "Books [id=" + id + ", bookName=" + bookName + ", price=" + price + "]";
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	private String bookName;
	private double price;
	private String activeShow;
	public String getActiveShow() {
		return activeShow;
	}
	public void setActiveShow(String activeShow) {
		this.activeShow = activeShow;
	}

}
