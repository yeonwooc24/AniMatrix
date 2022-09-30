package yeonwoo.choi.animatrix;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;

import android.content.Intent;
import android.util.Log;

import androidx.annotation.Nullable;


public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
// line 18-32 used to splash; change line 22 for class used (getApplicationContext(),_nextclassused_);
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(getApplicationContext(),loginpage.class);
                startActivity(intent);
                finish();
            }
        },2000); // use this

    }
    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }

}