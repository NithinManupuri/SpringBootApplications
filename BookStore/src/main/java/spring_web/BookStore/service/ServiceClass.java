package spring_web.BookStore.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring_web.BookStore.Repo.BookRepository;
import spring_web.BookStore.entity.Books;


@Service
public class ServiceClass implements ServiceInterface {
	@Autowired
	private BookRepository  repo;

	@Override
	public List<Books> getAllBooks() {
		  List<Books> list=repo.findAll();
		
		return list;
	}

	@Override
	public boolean Register(Books e) {
		  e.setActiveShow("Y");
		  Books b=repo.save(e);
		
		  if(b.getId()!=null) {
			  return true;
		  }
		  return false;
		
	}

	public boolean deleteRec(Integer id) {
		
		    if (id != null) {
		        repo.deleteById(id);
		        return true;
		    } else {
		    	return false;
		    }
		}

	@Override
	
	
	public Books editRec(Integer id) {
		    Optional<Books> b= repo.findById(id);
		      if(b.isPresent()) {
		    	  Books bk=b.get();
		    	  return bk;
		      }
		
		return null;
	}


	}
	

