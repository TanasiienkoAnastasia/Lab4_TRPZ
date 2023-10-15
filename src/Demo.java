import Entities.User.User;
import Entities.User.Greeter.UserGreeter;
import Entities.User.Journal.UserJournalInterface;
import Entities.User.Journal.UserJournal;

import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void main(String[] args) {

        UserJournalInterface journal;
        journal = new UserJournal(createTestUsers());

        UserGreeter greeter = new UserGreeter(journal);
        greeter.sendGreetToFriends("Nastya", "Greetings, friend!!");
        greeter.sendGreetToCoworkers("Andriy", "Greetings, coworker!!");

    }

    public static List<User> createTestUsers() {
        List<User> data = new ArrayList<>();
        data.add(new User("Nastya", "1234Jop", "friends:Andriy", "coworkers:ALina"));
        data.add(new User("Andriy", "09338Uty", "friends:Dina", "coworkers:Petro"));
        data.add(new User("Petro", "02933Yup", "friends:Helen", "coworkers:Petro"));
        data.add(new User("ALina", "89584Hop", "friends:Dina", "coworkers:Nastya"));
        data.add(new User("Dina", "9203Jut", "friends:Nastya", "coworkers:Helen"));
        data.add(new User("Helen", "9382Hew", "friends:Nastya", "coworkers:"));
        return data;
    }


}
