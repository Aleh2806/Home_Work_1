package aleh.ahiyevich.home_work_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goSecondPage(View v) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }
}