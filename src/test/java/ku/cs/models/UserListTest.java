package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserListTest {
    UserList user;

    @BeforeEach
    void init() {
        user = new UserList();
    }

    @Test
    @DisplayName("User should be found in UserList")
    public void testUserListFindUser() {
        // TODO: add 3 users to UserList
        user.addUser("top", "a");
        user.addUser("max", "b");
        user.addUser("tuay", "c");

        // TODO: find one of them
        User s1 = user.findUserByUsername("tuay");

        // TODO: assert that UserList found User
         String expected = "tuay";
         String actual = s1.getUsername();
         assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User can change password")
    public void testUserCanChangePassword() {
        // TODO: add 3 users to UserList
        user.addUser("top", "a");
        user.addUser("max", "b");
        user.addUser("tuay", "c");

        // TODO: change password of one user
        boolean s1 = user.changePassword("top", "a", "aa");
        // TODO: assert that user can change password
        assertTrue(s1);
    }

    @Test
    @DisplayName("User with correct password can login")
    public void testUserListShouldReturnObjectIfUsernameAndPasswordIsCorrect() {
        // TODO: add 3 users to UserList
        user.addUser("top", "a");
        user.addUser("max", "b");
        user.addUser("tuay", "c");

        // TODO: call login() with correct username and password
        User s1 = user.login("max", "b");
        User account = user.findUserByUsername("max");

        // TODO: assert that User object is found
        assertEquals(account, s1);
    }

    @Test
    @DisplayName("User with incorrect password cannot login")
    public void testUserListShouldReturnNullIfUsernameAndPasswordIsIncorrect() {
        // TODO: add 3 users to UserList
        user.addUser("top", "a");
        user.addUser("max", "b");
        user.addUser("tuay", "c");

        // TODO: call login() with incorrect username or incorrect password
        User s1 = user.login("fifa", "d");

        // TODO: assert that the method return null
         assertNull(s1);
    }

}