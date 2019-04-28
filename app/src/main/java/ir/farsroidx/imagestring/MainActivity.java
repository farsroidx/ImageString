package ir.farsroidx.imagestring;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

import ir.farsroidx.ImageString;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = findViewById(R.id.imageView);

        String encode = ImageString.encodeToString(this , R.drawable.photo);
        Log.d("encodeString" , encode);
        Bitmap decode = ImageString.decodeToBitmap(encode);
        imageView.setImageBitmap(decode);

    }
}
