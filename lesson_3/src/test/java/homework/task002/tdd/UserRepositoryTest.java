package homework.task002.tdd;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class UserRepositoryTest {
    public UserRepository userRepository;
    public User userActual;
    public User userFail;


    @BeforeEach
    public void setUp() {
        userRepository = new UserRepository();
        userActual = new User("someName", "somePassword", Role.ADMIN);
        userFail = new User("someName", "somePassword", Role.USER);
    }


    @Test
    void checkAddUserPositive() {
        userActual.authenticate("someName", "somePassword");
        userRepository.addUser(userActual);
        int expectListSize = 1;
        assertEquals(expectListSize, userRepository.data.size());
    }


    @Test
    void checkExceptionWithAddUser() {
        userFail.authenticate("wrongName", "wrongPassword");
        Exception exception = assertThrows(RuntimeException.class, () -> userRepository.addUser(userActual));
        String message = "wrong login or password!";
        assertEquals(message, exception.getMessage());
    }


    @Test
    void checkFindByNamePositive() {
        userActual.authenticate("someName", "somePassword");
        userRepository.addUser(userActual);
        assertTrue(userRepository.findByName("someName"));
    }


    @Test
    void checkFindByNameNegative() {
        userActual.authenticate("someName", "somePassword");
        userRepository.addUser(userActual);
        assertFalse(userRepository.findByName("wrongName"));
    }


    @Test
    void checkLogOutExceptAdministrator() {
        userActual.authenticate("someName", "somePassword");
        userFail.authenticate("someName", "somePassword");
        userRepository.addUser(userActual);
        userRepository.addUser(userFail);
        userRepository.logOutExceptAdministrator();
        int expectListSize = 1;
        assertEquals(expectListSize, userRepository.data.size());
    }

}
