package spring_boot;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by Adrian.Flak on 6/22/2017.
 */
public interface MovieRepository extends CrudRepository<Movie,Integer> {
}
