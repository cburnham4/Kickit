package letshangllc.kickit.FeedActivities;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import letshangllc.kickit.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FavoritesFeedFragment extends Fragment {
    private ListView listViewFeed;

    public FavoritesFeedFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_feed, container, false);

        /* Find the list view feed */
        listViewFeed = (ListView) view.findViewById(R.id.lv_feed);

        return view;
    }

}
