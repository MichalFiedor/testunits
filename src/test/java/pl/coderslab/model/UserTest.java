package pl.coderslab.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class UserTest {

    @Test
    public void shouldSetUserName() {
        User user = new User();
        user.setName("Michal");
        assertEquals("Michal", user.getName());
    }

    @Test
    public void shouldSetId(){
        User user = new User()
                .setId(1);
        assertEquals(1, user.getId());
    }
}
