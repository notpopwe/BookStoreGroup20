package controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import repository.BooksRepository;
import model.Book;
import resource.BookRequest;

import java.util.List;
import java.util.Optional;

@RestController
public class BookController {
    private final BooksRepository bookRepository;

    public BookController(BooksRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @GetMapping("/book")
    public ResponseEntity<List<Book>> getAllBooks(){

        return ResponseEntity.ok(this.bookRepository.findAll());
    }
    @PostMapping("/book")
    public ResponseEntity<Book> createBook(@RequestBody BookRequest bookRequest){

        Book book = new Book();
        book.setISBN(bookRequest.getISBN());
        book.setName(bookRequest.getName());
        book.setBookDescription(bookRequest.getBookDescription());
        book.setPrice(bookRequest.getPrice());
        book.setAuthor(bookRequest.getAuthor());
        book.setGenre(bookRequest.getGenre());
        book.setPublisher(bookRequest.getPublisher());
        book.setYearPublished(bookRequest.getYearPublished());
        book.setCopiesSold(bookRequest.getCopiesSold());


        return ResponseEntity.status(201).body(this.bookRepository.save(book));
    }

    @GetMapping("/book/{ISBN}")
    public ResponseEntity getAllBooksById(@PathVariable String ISBN){

        Optional<Book> book = this.bookRepository.findById(ISBN);

        if(book.isPresent()){
            return ResponseEntity.ok(book.get());
        } else{
            return ResponseEntity.ok("The book with id: " + ISBN + " was not found");
        }

    }

  /*  @GetMapping("/book/authorID/{authorID}")
    public ResponseEntity getAllBooksByAuthor(@PathVariable String authorID) {
        Optional<Book> booksByAuthor = this.bookRepository.findById(authorID);

        if (!booksByAuthor.isEmpty()) {
            return ResponseEntity.ok(booksByAuthor.get());
        } else {
            return ResponseEntity.ok("The book with id: " + authorID + " was not found");
        }
    }*/
}

