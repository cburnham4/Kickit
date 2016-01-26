package letshangllc.kickit.ListAdapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

import letshangllc.kickit.PostItems.PersonPostItem;
import letshangllc.kickit.R;

/**
 * Created by cvburnha on 1/25/2016.
 */
public class PostItemListAdapter extends ArrayAdapter<PersonPostItem> {

    private static class ViewHolder {
        ImageView profilePic;
        TextView elapsedTime;
        TextView name;
        TextView category;
        TextView message;
    }

    public PostItemListAdapter (Context context, ArrayList<PersonPostItem> posts) {
        super(context, R.layout.item_post, posts);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        PersonPostItem post  = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        ViewHolder viewHolder; // view lookup cache stored in tag
        if (convertView == null) {
            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.item_post, parent, false);
            viewHolder.profilePic = (ImageView) convertView.findViewById(R.id.img_profilePicture);
            viewHolder.name = (TextView) convertView.findViewById(R.id.tv_name);
            viewHolder.category = (TextView) convertView.findViewById(R.id.tv_category);
            viewHolder.elapsedTime = (TextView) convertView.findViewById(R.id.tv_elapsedTime);
            viewHolder.message = (TextView) convertView.findViewById(R.id.tv_message);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        // Populate the data into the template view using the data object

        /* todo set user profile pic */
        viewHolder.name.setText(post.getPerson().getName());
        viewHolder.category.setText(post.getCategory().getCategoryName());
        viewHolder.elapsedTime.setText(post.getElapsedTime());
        viewHolder.message.setText(post.getMessage().getMessage());

        // Return the completed view to render on screen
        return convertView;
    }

}
