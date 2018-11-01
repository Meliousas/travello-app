package pjatk.dev.repository;

import org.springframework.data.repository.CrudRepository;
import pjatk.dev.entity.Account;

public interface AccountRepository extends CrudRepository<Account, Long> {

}
