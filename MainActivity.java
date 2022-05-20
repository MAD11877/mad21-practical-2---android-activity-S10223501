package sg.edu.np.mad.exercise_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private String TAG = "Main Activity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        User user = new User();
        Button myFollowButton = findViewById(R.id.myFollowButton);
        myFollowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(user.isFollowed() == false){
                    myFollowButton.setText("Unfollow");
                    user.setFollowed(true);
                }
                else{
                    myFollowButton.setText("Follow");
                    user.setFollowed(false);
                }
            }
        });
        Button myMessageButton = findViewById(R.id.myMessageButton);
    }
}