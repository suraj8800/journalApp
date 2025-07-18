package net.engineeringdigest.journalApp.service;

import net.engineeringdigest.journalApp.entity.User;
import net.engineeringdigest.journalApp.repository.UserRepository;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class UserServiceTests {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserService userService;

    @Disabled
    @ParameterizedTest
    @ArgumentsSource(UserArgumentProvider.class)
    public void testSaveNewUser(User user){
        assertTrue(userService.saveNewUser(user));
    }

    @Disabled
    @ParameterizedTest
    @CsvSource({
            "1,1,2",
            "2,3,5",
            "3,3,6"
    })
    public void test(int a, int b, int expeted){
        assertEquals(expeted, a + b);
    }

}


//mvn clean verify sonar:sonar \
//        -Dsonar.projectKey=journalApp \
//        -Dsonar.host.url=http://localhost:9000 \
//        -Dsonar.login=squ_9198de4d0e650145cf85efbb8630b6e15610d8be