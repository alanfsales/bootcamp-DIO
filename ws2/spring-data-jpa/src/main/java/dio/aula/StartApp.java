package dio.aula;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import dio.aula.model.User;
import dio.aula.repository.UserRepository;

@Component
public class StartApp implements CommandLineRunner {

	@Autowired
	private UserRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		List<User> users = repository.findByNameContaining("Alan");
		for(User u: users) {
			System.out.println(u);
		}
	}
	
	void inserUser() {
		User user = new User();
		user.setName("Alan Sales");
		user.setUserName("afs");
		user.setPassword("123");
		
		repository.save(user);
		
		for(User u: repository.findAll()) {
			System.out.println(u);
		}
	}
}
