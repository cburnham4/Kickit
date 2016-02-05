package letshangllc.kickit.CreateNewPost;

import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.IOException;

import letshangllc.kickit.R;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class CreatePostActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private EditText et_category, et_message;

    private String TAG = CreatePostActivity.class.getSimpleName();

    OkHttpClient client = new OkHttpClient();


    private Button btn_post_message;

    /* Change ssh setting */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_post);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /* Set strict mode for okhttp */
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        et_category = (EditText) findViewById(R.id.et_category);
        et_message = (EditText) findViewById(R.id.et_message);
        btn_post_message = (Button) findViewById(R.id.btn_post_message);


        btn_post_message.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String category = et_category.getText().toString();
                String message = et_message.getText().toString();
                /*Todo post to server */
                try {
                    String response = run("http://httpbin.org/ip");
                    Log.i(TAG, response);
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        });
    }

    String run(String url) throws IOException {
        Request request = new Request.Builder()
                .url(url)
                .build();

        Response response = client.newCall(request).execute();
        return response.body().string();
    }





}