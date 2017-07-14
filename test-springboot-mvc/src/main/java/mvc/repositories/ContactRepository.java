package mvc.repositories;

import mvc.models.ContactModel;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Adrian.Flak on 6/27/2017.
 */
public interface ContactRepository extends CrudRepository<ContactModel,Integer>{
}
