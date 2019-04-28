package ir.farsroidx.imagestring;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.Toast;

import ir.farsroidx.ImageString;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView img = findViewById(R.id.img);

        ImageString imageString = new ImageString(this);
        String encode = imageString.encodeToString(R.drawable.photo);
        Log.d("encodeString" , encode);
        Bitmap decode = imageString.decodeToBitmap(encode);
        img.setImageBitmap(decode);

    }
}
