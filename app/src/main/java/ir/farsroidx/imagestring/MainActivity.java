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

        StringImageView imageView = findViewById(R.id.stringImageView);

        // Image Is Already Available In ImageView => Input (Bitmap)
        String encodeString1 = StringImage.encodeToString(imageView.getBitmapFromView());

        // Image From Drawable => Input (Drawable Id)
        String encodeString2 = StringImage.encodeToString(this , R.drawable.photo);

        // Get String Image From ImageView
        String encodeString3 = imageView.getStringImageFromView();

        // set Images
        imageView.setImageString(encodeString1);
        imageView.setImageString(encodeString2);
        imageView.setImageString(encodeString3);
    }
}
