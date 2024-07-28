package dio.bootcamp.java.api_rest_spring_boot.service;

import dio.bootcamp.java.api_rest_spring_boot.model.User;
import dio.bootcamp.java.api_rest_spring_boot.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public User findById(Long id) {
        return this.userRepository.findById(id).orElseThrow(IllegalArgumentException::new);
    }

    public User create(User user) {
        if (this.userRepository.existsByAccountNumber(user.getAccount().getNumber())) {
            throw new IllegalArgumentException("This account number already exists");
        }

        return this.userRepository.save(user);
    }
}
