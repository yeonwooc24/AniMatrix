package yeonwoo.choi.animatrix;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Upload extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.upload);
    }

    ImageButton imgbtn1 = findViewById(R.id.imageButton);


    imgbtn1.setOnClickListener(new View.OnClickListener()

    {
        @Override
        public void onClick (View view){
        Intent it = new Intent(Upload.this, afterupload.class);
        startActivity(it);
    });



}
