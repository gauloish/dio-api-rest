package dio.bootcamp.java.api_rest_spring_boot.repository;

import dio.bootcamp.java.api_rest_spring_boot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    public boolean existsByAccountNumber(String accountNumber);
}
