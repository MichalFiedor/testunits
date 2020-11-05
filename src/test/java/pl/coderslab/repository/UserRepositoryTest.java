package pl.coderslab.repository;

import org.junit.Test;
import pl.coderslab.model.User;

import static org.junit.Assert.*;

public class UserRepositoryTest {

    @Test
    public void create() {
        UserRepository ur = new UserRepository();
        User user = new User()
                .setName("Ala");
        ur.create(user);
        User user1 = ur.readById(1);
        assertEquals(user, user1);
        assertEquals(1, ur.count());
        assertEquals(1, user.getId());
    }

    @Test
    public void update() {
        //given
        UserRepository ur = new UserRepository();
        User user = new User()
                .setName("Ala");
        ur.create(user);

        //when
        User userToUpdate = ur.readById(1);
        userToUpdate.setName("Ola");
        ur.update(userToUpdate);

        //then
        assertEquals("Ola", ur.readById(1).getName());
        assertEquals(1, userToUpdate.getId());
        assertEquals(userToUpdate, ur.readById(1));

    }

    @Test
    public void shouldDeleteUser() {
        //given
        User user = new User()
                .setName("Vidal");
        UserRepository ur = new UserRepository();

        //when
        ur.create(user);
        assertEquals("Vidal", ur.readById(1).getName());
        ur.delete(user);
        //then
        assertEquals(0, ur.count());
    }

    @Test
    public void shouldThruNullPointerException() {
        //given
        User user = new User()
                .setName("Vidal");
        UserRepository ur = new UserRepository();

        //when
        ur.create(user);
        ur.delete(user);
        //then
        assertNull("This user doesn't exist",ur.readById(1));

    }
}