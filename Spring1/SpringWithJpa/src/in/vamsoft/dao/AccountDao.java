package in.vamsoft.dao;

import org.springframework.orm.jpa.JpaTemplate;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class AccountDao {

	JpaTemplate template;

	public void createAccount(int accountNumber, String owner, double balance) {
		Account account = new Account(accountNumber, owner, balance);
		template.persist(account);

	}
}
