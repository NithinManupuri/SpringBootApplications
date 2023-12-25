package spring_web.BookStore.service;


import java.util.List;

import spring_web.BookStore.entity.Books;

public interface ServiceInterface {
	public List<Books> getAllBooks();
	public boolean  Register(Books e);
	public boolean  deleteRec(Integer id);
	public Books editRec(Integer id);


}
