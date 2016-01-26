package letshangllc.kickit.FeedActivities;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

import letshangllc.kickit.ListAdapters.PostItemListAdapter;
import letshangllc.kickit.PostItems.PersonPostItem;
import letshangllc.kickit.R;

/**
 * Created by cvburnha on 1/26/2016.
 *
 * Parent activity for the 3 feed fragments (friends, public, and favorites)
 * The child fragments will call onCreate to this Fragment passing it its
 * Arraylist of PostItems
 */


public class FeedParentFragment extends Fragment {
    private static String TAG = FeedParentFragment.class.getSimpleName();
    /* Private variables used to create the listview */
    private ListView lv_feed;
    private PostItemListAdapter postItemListAdapter;
    private ArrayList<PersonPostItem> posts;

    private Activity activity;

    public FeedParentFragment() {
        // Required empty public constructor
    }

    /* custom onCreate to be called from child fragment with necessary data */
    public void onCreate(Bundle savedInstanceState, final ArrayList<PersonPostItem> posts) {

        /* instantiate non-view instance variables here */
        this.activity = this.getActivity();
        this.posts = posts;

        super.onCreate(savedInstanceState);
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_feed, container, false);



        /* Find the list view feed */
        lv_feed = (ListView) view.findViewById(R.id.lv_feed);

        /* Create list adapter with current posts */
        postItemListAdapter = new PostItemListAdapter(activity, posts);
        Log.i(TAG, "Post count: "+posts.size());
        lv_feed.setAdapter(postItemListAdapter);



        return view;
    }

}
