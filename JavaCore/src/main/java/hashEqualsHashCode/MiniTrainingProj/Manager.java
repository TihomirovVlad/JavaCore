package hashEqualsHashCode.MiniTrainingProj;

import ComparableComparator.Set.Comparator.Task.NameComparator;

import java.util.*;

public class Manager {

    private static Map<String,User> mapOfUser = new HashMap<>();

    public boolean login(String login, String password) {
        if(!(mapOfUser.containsKey(login))) {
            System.out.println("User with login '"+ login + "' not exists");
            return false;
        }
        if(mapOfUser.get(login).getPassword().equals(password)) {
            System.out.println(login + "' You're successfully LogIN ");
            return true;
        }
        System.out.println("You're write wrong login or password");
        return false;
    }

    public boolean addNewUser(User user) {
        if(mapOfUser.containsKey(user.getLogin())){
            System.out.println("User with login '" + user.getLogin() + "' already exists");
            return false;
        }
        System.out.println(user.getLogin() + "' You're successfully log In");
        mapOfUser.put(user.getLogin(), user);
        return true;
    }

    public boolean deleteUser(String login) {
        if(mapOfUser.containsKey(login)){
            System.out.println("User with login '" + login + "' successfully deleted");
            mapOfUser.remove(login);
            return true;
        }
        System.out.println("User with login '" + login + "' not exists");
        return false;
    }

    public void getAllUsers(){
        for(User user : mapOfUser.values()) {
            System.out.println(user);
        }
    }
    public List<User> getAllUsers(String sortCriterion){
        switch (sortCriterion) {
            case "login":
                Map<String, User> sortedMapByLogin = new TreeMap<>(mapOfUser);
                for(Map.Entry user : sortedMapByLogin.entrySet()) {
                    System.out.println(user.getKey()+" : "+ user.getValue());
                }
                break;
            case "date":
                DateComparator userDateComparator = new DateComparator();
                List<User> sortedListByDate = new ArrayList<>(mapOfUser.values());
                sortedListByDate.sort(userDateComparator);
                for(User user : sortedListByDate) {
                    System.out.println(user);
                }
                break;
        }
        return null;
    }
    public boolean editUser(User user) {
        if(!(mapOfUser.containsKey(user.getLogin()))) {
            System.out.println("User with login '" + user.getLogin() + "' not exists");
            return false;
        }
        mapOfUser.put(user.getLogin(), user);
        System.out.println("User with login '" + user.getLogin() + "' successfully edited");
        return true;
    }

}
