package guru.springframework.spring6webapp.bootstrap;

import guru.springframework.spring6webapp.domain.Author;
import guru.springframework.spring6webapp.domain.Book;
import guru.springframework.spring6webapp.repositories.AuthorRepository;
import guru.springframework.spring6webapp.repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Random;
import java.util.random.RandomGenerator;

@Component
public class BootstrapData implements CommandLineRunner {
    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        // Author: Eric Evants
        Author eric = new Author();
        eric.setFirstName("Eric");
        eric.setLastName("Evants");

        // Book: Domain Driven Design
        Book ddd = new Book();
        ddd.setTitle("Domain Driven Design");
        ddd.setIsbn("123-456789");

        // Author and Book are saved in database
        final Author ericSaved = authorRepository.save(eric);
        final Book dddSaved = bookRepository.save(ddd);

        // Author: Rod Johnson
        final Author rod = new Author();
        rod.setFirstName("Rod");
        rod.setLastName("Johnson");

        // Book: J2EE Development without EJB
        final Book noEJB = new Book();
        noEJB.setTitle("J2EE Development without EJB");
        noEJB.setIsbn("456-789456");

        // Author and Book are saved in database
        final Author rodSaved = authorRepository.save(rod);
        final Book noEJBSaved = bookRepository.save(noEJB);

        // Create an association between those (two authors and two books)
        ericSaved.getBooks().add(dddSaved);
        rodSaved.getBooks().add(noEJBSaved);

        // Save the association into database
        authorRepository.save(ericSaved);
        authorRepository.save(rodSaved);

        System.out.println("In Bootstrap");
        System.out.println("Author Count: " + authorRepository.count());
        System.out.println("Book Count: " + bookRepository.count());
    }
}
