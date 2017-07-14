package spring_boot;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by Adrian.Flak on 6/21/2017.
 */
public interface PersonRepository extends CrudRepository<Person,Integer> {
}
