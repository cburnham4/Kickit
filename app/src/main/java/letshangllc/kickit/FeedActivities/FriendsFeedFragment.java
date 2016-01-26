package letshangllc.kickit.FeedActivities;


import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.json.JSONArray;
import org.json.JSONException;

import java.util.ArrayList;

import letshangllc.kickit.MockedItems.MockedFeed;
import letshangllc.kickit.PostItems.PersonPostItem;
import letshangllc.kickit.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FriendsFeedFragment extends FeedParentFragment {


    public FriendsFeedFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        ArrayList<PersonPostItem> posts = new MockedFeed().getPosts();
        super.onCreate(savedInstanceState, posts);
    }
}
