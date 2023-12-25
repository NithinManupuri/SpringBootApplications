package spring_web.BookStore.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import spring_web.BookStore.entity.Books;

public interface BookRepository extends JpaRepository<Books,Integer> {
	
	

}
