package dio.aula.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import dio.aula.model.User;

//@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	//Query method
	List<User> findByNameContaining(String name);
	
	//Query method
	User findByUserName(String name);
	
	//Query overrride
	@Query("SELECT u FROM User u WHERE u.name LIKE %:name%")
	List<User> buscarPorNome(String name);
}
