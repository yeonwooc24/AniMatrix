package yeonwoo.choi.animatrix;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class afterupload extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.afterupload);

        ImageView imgview1 = findViewById(R.id.imageView5);

        imgview1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(afterupload.this, Gallery.class);
                startActivity(it);
            }
        });


    }
}
