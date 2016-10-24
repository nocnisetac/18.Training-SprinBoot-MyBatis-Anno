package project.jdbc;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import project.jdbc.domain.User;
import project.jdbc.mapper.UserMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FirstApplicationTests {
    @Autowired
    private UserMapper userRepository;

    @Test
    public void findAllUsers() {
        List<User> users = userRepository.findAll();
        assertNotNull(users);
        assertTrue(!users.isEmpty());
    }

    @Test
    public void findUserById() {
       // User user = userRepository.findUserById(1);
       // assertNotNull(user);
    }

    @Test
    public void createUser() {
        User user = new User(0, "John", "john@gmail.com");
       // User savedUser = userRepository.create(user);
       // User newUser = userRepository.findUserById(savedUser.getId());
       // assertNotNull(newUser);
       // assertEquals("John", newUser.getName());
       // assertEquals("john@gmail.com", newUser.getEmail());
    }
}
