import core.Authorization;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pojo.User;

public class test {

    @Test
        public void test_auth_positive() {
        Authorization authorization=new Authorization();
        User user=authorization.getAuthedUser("rust666", "654321");
        Assertions.assertNotNull(user);
    }

    /**
     * тест на неудачную авторизацию
     */
    @Test
    public void test_auth_negative() {
        Authorization authorization=new Authorization();
        User user=authorization.getAuthedUser("rust666", "564321");
        Assertions.assertNull(user);
    }

}
