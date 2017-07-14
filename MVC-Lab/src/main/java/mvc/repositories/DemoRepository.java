package mvc.repositories;

import mvc.models.DemoModel;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Adrian.Flak on 6/27/2017.
 */
public interface DemoRepository extends CrudRepository<DemoModel,Integer> {
}
