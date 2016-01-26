package letshangllc.kickit.MockedItems;

import java.util.ArrayList;

import letshangllc.kickit.Person;
import letshangllc.kickit.PostItems.Category;
import letshangllc.kickit.PostItems.Message;
import letshangllc.kickit.PostItems.PersonPostItem;

/**
 * Created by cvburnha on 1/26/2016.
 */
public final class MockedFeed {
    private static ArrayList<PersonPostItem> friendsFeed;

    private MockedFeed(){
        int id  = 1;
        friendsFeed.add(new PersonPostItem(id++,
                new Person("Chase Burnham", "187812321"),
                new Category("Outdoors"),
                new Message("Looking for partner to go hiking with on Saturday", "10:10:10"),
                "7"));
        friendsFeed.add(new PersonPostItem(id++,
                new Person("Chase Burnham", "187812321"),
                new Category("Outdoors"),
                new Message("Looking for partner to go hiking with on Saturday", "10:10:10"),
                "7"));
    }

    private static ArrayList<PersonPostItem> getPosts(){
        return friendsFeed;
    }
}
