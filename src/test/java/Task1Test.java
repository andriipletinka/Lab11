import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import task1.Gender;
import task1.User;

public class Task1Test {
    private User user;

    @Test
    public void UserTest() {
        user = User.builder()
                .name("Andrii")
                .age(18)
                .gender(Gender.MALE)
                .height(189)
                .weight(75)
                .occupation("Student").build();
        Assertions.assertEquals("Andrii", user.getName());
        Assertions.assertEquals(18, user.getAge());
        Assertions.assertEquals(Gender.MALE, user.getGender());
        Assertions.assertEquals(189, user.getHeight());
        Assertions.assertEquals(75, user.getWeight());
        Assertions.assertEquals("Student", user.getOccupations().get(0));
    }

}
