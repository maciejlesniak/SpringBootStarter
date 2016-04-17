package pl.sparkmedia.springbootstarter.repository.database;

import org.springframework.data.repository.CrudRepository;
import pl.sparkmedia.springbootstarter.domain.User;

/**
 * @author Maciej Lesniak / Spark Media
 * @version 16.04.2016
 */
public interface UsersRepository extends CrudRepository<User, Long> {

}
