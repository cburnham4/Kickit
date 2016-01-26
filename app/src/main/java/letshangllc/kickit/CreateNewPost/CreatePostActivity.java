package letshangllc.kickit.CreateNewPost;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import letshangllc.kickit.R;

public class CreatePostActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private EditText et_category, et_message;

    private Button btn_post_message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        et_category = (EditText) findViewById(R.id.et_category);
        et_message = (EditText) findViewById(R.id.et_describe_activity);
        btn_post_message = (Button) findViewById(R.id.btn_post_message);


        btn_post_message.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String category = et_category.getText().toString();
                String message = et_message.getText().toString();
                /*Todo post to server */
            }
        });
    }


}