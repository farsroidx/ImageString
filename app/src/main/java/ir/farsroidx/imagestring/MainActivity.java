package ir.farsroidx.imagestring;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import ir.farsroidx.StringImageUtils;
import ir.farsroidx.StringImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        StringImageView imageView = findViewById(R.id.stringImageView);

        // Image Is Already Available In ImageView => Input (Bitmap)                                // =>
        String encodeString1 = StringImageUtils.encodeToString(imageView.getBitmapImageFromView()); // =>
                                                                                                    // =>
        // Image From Drawable => Input (Drawable Id)                                               // => If no photo is found on ImageView,
        String encodeString2 = StringImageUtils.encodeToString(this , R.drawable.photo);     // => Displays a photo as a default.
                                                                                                    // =>
        // Get String Image From ImageView                                                          // =>
        String encodeString3 = imageView.getStringImageFromView();                                  // =>

        // set Images
        imageView.setImageString(encodeString1);
        imageView.setImageString(encodeString2);
        imageView.setImageString(encodeString3);

        /*
         * All Method
         */

        // First Class StringImageUtils:
        StringImageUtils.encodeToString(bitmap);
        StringImageUtils.encodeToString(context , R.id.photo);
        StringImageUtils.decodeToBitmap(stringImage);

        // Second Class StringImageView:
        imageView.getBitmapImageFromView();    // get image from imageView as bitmap.
        imageView.getStringImageFromView();    // get image from imageView as string.
        imageView.setImageString(stringImage); // set string image to imageView.

    }
}
