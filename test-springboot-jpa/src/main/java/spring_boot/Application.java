package spring_boot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Adrian.Flak on 6/21/2017.
 */
@SpringBootApplication
public class Application {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args){
        SpringApplication.run(Application.class);
    }

    @Bean
    public CommandLineRunner demo(MovieRepository movieRepository, ProductionCompanyRepository productionCompanyRepository) {
        return (args) -> {

            //LessonJPAIntro(personRepository);

            //OneToManyLesson(personRepository,emailRepository);

            ManyToManyLesson(movieRepository,productionCompanyRepository);

        };
    }

    public static void  LessonJPAIntro (PersonRepository personRepository){
        log.info("------------------------------------------");
        log.info("-------------HELLO WORLD------------------");
        log.info("------------------------------------------");

        personRepository.save(new Person("Adrian"));
        personRepository.save(new Person("Bob"));
        personRepository.save(new Person("Bill"));

        Person person = new Person();
        person.setFirstName("Java");
        person.setMiddleName("Persistence API");
        person.setLastName("Is Awesome");
        person.setSSN("222-111-2222");

        personRepository.save(person);

        for(int x = 0; x<10; x++) {
            Person pers = new Person("Person" + x);
            pers.setLastName("LastName" + x);
            pers.setSSN("111-" + x + x);

            personRepository.save(pers);
        }

        //create Iterable Person List
        List<Person> personList = new ArrayList<>();
        for(int x = 0; x<10; x++) {
            Person pers = new Person("PersonL" + x);
            pers.setLastName("LastNameL" + x);
            pers.setSSN("LLL-" + x + x);

            personList.add(pers);
        }

        //goes through list of Objects to add to save to a table
        personRepository.save(personList);

        //find object by Id
        Person foundPerson = personRepository.findOne(20);
        log.info("Here is the found person:  " + foundPerson.getFirstName() + " " + foundPerson.getLastName());

        //how to find all
        for (Person p : personRepository.findAll()){
            log.info("Person found " +p.getId()+") " + p.getFirstName() + " " + p.getLastName());
        }

        personRepository.delete(4);
        log.info("person with id 4 exists: " + personRepository.exists(4));//returns true or false

        log.info("total records in person: " + personRepository.count());



    }

    public static void OneToManyLesson (PersonRepository personRepository, EmailRepository emailRepository){

        Person adrianPerson = new Person("Adrian","Flak");

        //emailRepository.save(new Email("adrian@astontech.com"));

//        Email email = new Email();
//        email.setPerson(person);
//        email.setEmailAddress("adrianflak@gmail.com");

        //emailRepository.save(email);

        List<Email> emailList = new ArrayList<>();
        emailList.add(new Email("adrian@gmail.com"));
        emailList.add(new Email("adrian@yahoo.com"));
        emailList.add(new Email("adrian@aol.com"));
        emailList.add(new Email("adrian@hotmail.com"));

        adrianPerson.setEmailList(emailList);

        //emailRepository.save(emailList);
        personRepository.save(adrianPerson);






    }

    public static void ManyToManyLesson (MovieRepository movieRepository, ProductionCompanyRepository productionCompanyRepository){

        movieRepository.save(new Movie ("Batman"));
        movieRepository.save(new Movie ("Xmen"));
        movieRepository.save(new Movie ("Spiderman"));

        productionCompanyRepository.save(new ProductionCompany("Fox"));
        productionCompanyRepository.save(new ProductionCompany("SONY"));
        productionCompanyRepository.save(new ProductionCompany("Disney"));

        Movie m1 = movieRepository.findOne(1);

        List<ProductionCompany> pcList = new ArrayList<>();
        pcList.add(productionCompanyRepository.findOne(1));
        pcList.add(productionCompanyRepository.findOne(3));

        m1.setProductionCompanyList(pcList);

        movieRepository.save(m1);

        Movie m2 = movieRepository.findOne(1);

        log.info("MOVIE is:  " + m2.getTitle());
        for (ProductionCompany pc : m2.getProductionCompanyList()){
            log.info("Production Company:  " + pc.getCompanyName());
        }

        ProductionCompany pc1 = productionCompanyRepository.findOne(1);

        List<Movie> mlist = new ArrayList<>();
        mlist.add(movieRepository.findOne(1));
        mlist.add(movieRepository.findOne(2));
        mlist.add(movieRepository.findOne(3));

        pc1.setMovieList(mlist);

        productionCompanyRepository.save(pc1);






    }
}
