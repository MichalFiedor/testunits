package pl.coderslab.repository;

import pl.coderslab.model.User;

import java.util.*;

public class UserRepository {
    private List<User> users= new ArrayList<>();
    private int NEXT_ID = 1;

    public void create(User u){
        u.setId(NEXT_ID++);
        User toInsert = new User(u);
        users.add(toInsert);
    }

    public void update(User user){
        Optional<User> found = users.stream()
                .filter(u -> u.getId() == user.getId())
                .findAny();
        if(!found.isPresent()){
            throw new RuntimeException("User not found");
        }

        User userToUpdate = found.get();
        userToUpdate.setName(user.getName());
    }

    public void delete(User u){
        Optional <User> found = users.stream()
                .filter(user-> u.getId()==user.getId())
                .findAny();
        if(!found.isPresent()){
            throw new RuntimeException("User not found");
        }
        users.remove(u);
    }


    public User readById(int id){
        User result =null;
        Optional<User> found = users.stream()
                .filter(u -> u.getId() == id)
                .findAny();
        if(found.isPresent()){
            result = new User(found.get());
        }
        return result;
    }

    public long count(){
        return this.users.size();
    }
}
