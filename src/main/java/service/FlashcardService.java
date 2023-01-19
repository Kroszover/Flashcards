package service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.example.demo.FlashCard;



@Service
public class FlashcardService {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	/*CRUD*/


	public List<FlashCard> getAllFlashcards() {
	    Session session = sessionFactory.openSession();
	    List<FlashCard> flashcards = session.createQuery("from Flashcard", FlashCard.class).list();
	    session.close();
	    return flashcards;
	    
	}
	
	 public void saveFlashcard(FlashCard flashcard) {
		    Session session = sessionFactory.openSession();
		    session.beginTransaction();
		    session.saveOrUpdate(flashcard);
		    session.getTransaction().commit();
		    session.close();
		}
	 
	 public void updateFlashcard(FlashCard flashcard) {
		    Session session = sessionFactory.openSession();
		    session.beginTransaction();
		    session.saveOrUpdate(flashcard);
		    session.getTransaction().commit();
		    session.close();
		}
	 
	 public void deleteFlashcard(FlashCard flashcard) {
		    Session session = sessionFactory.openSession();
		    session.beginTransaction();
		    session.delete(flashcard);
		    session.getTransaction().commit();
		    session.close();
		}

	 public FlashCard findFlashcard(long id) {
		    Session session = sessionFactory.openSession();
		    FlashCard flashcard = session.get(FlashCard.class, id);
		    session.close();
		    return flashcard;
		}



	
}
