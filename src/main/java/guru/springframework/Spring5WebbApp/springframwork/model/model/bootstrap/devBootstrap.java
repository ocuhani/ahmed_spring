package guru.springframework.Spring5WebbApp.springframwork.model.model.bootstrap;

import guru.springframework.Spring5WebbApp.springframwork.model.model.model.Author;
import guru.springframework.Spring5WebbApp.springframwork.model.model.model.Book;
import guru.springframework.Spring5WebbApp.springframwork.model.model.model.Publisher;
import guru.springframework.Spring5WebbApp.springframwork.model.model.repositories.AutorRepository;
import guru.springframework.Spring5WebbApp.springframwork.model.model.repositories.BookRepository;
import guru.springframework.Spring5WebbApp.springframwork.model.model.repositories.PublusherRepository;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import javax.naming.Context;
@Component
public class devBootstrap  implements ApplicationListener <ContextRefreshedEvent>{
    private AutorRepository autorRepository;
    private BookRepository bookRepository;
    private PublusherRepository publusherRepository ;

    public devBootstrap(AutorRepository autorRepository, BookRepository bookRepository,PublusherRepository publusherRepository) {
        this.autorRepository = autorRepository;
        this.bookRepository = bookRepository;
        this.publusherRepository = publusherRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        initData();
    }
    private void initData(){
        Publisher publisher = new Publisher();
        publisher.setName("samir");
        publusherRepository.save(publisher);
//ahmed

        Author Ahmed = new Author("Ahmed","Ouchani");
        Book B = new Book("Domain Driven design","1234",publisher);
        autorRepository.save(Ahmed);
        bookRepository.save(B);
//mohamed
Author Mohamed =  new Author("Mohamed ","Ouchani");
Book C = new Book("attack","1597",publisher);
autorRepository.save(Mohamed);
bookRepository.save(C);
    }


}
