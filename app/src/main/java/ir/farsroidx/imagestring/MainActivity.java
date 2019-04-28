package ir.farsroidx.imagestring;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import ir.farsroidx.StringImage;
import ir.farsroidx.StringImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        StringImageView imageView1 = findViewById(R.id.stringImageView1);
        StringImageView imageView2 = findViewById(R.id.stringImageView2);

        // Image is already available
        String encodeString1 = StringImage.encodeToString(imageView1.getBitmapFromView());

        // Image is drawable
        String encodeString2 = StringImage.encodeToString(this , R.drawable.photo);

        // set Images
        imageView1.setImageString(encodeString1);
        imageView2.setImageString(encodeString2);
    }
}
