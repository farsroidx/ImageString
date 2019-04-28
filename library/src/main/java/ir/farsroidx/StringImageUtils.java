package ir.farsroidx;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.util.Base64;

import java.io.ByteArrayOutputStream;

public final class StringImageUtils {

    public static String encodeToString(Context context , @DrawableRes int drawableRes){
        Bitmap bitmap = BitmapFactory.decodeResource(context.getResources() , drawableRes);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG , 100 , byteArrayOutputStream);
        byte[] bytes = byteArrayOutputStream.toByteArray();
        return Base64.encodeToString(bytes , Base64.DEFAULT);
    }

    public static String encodeToString(@NonNull Bitmap bitmap){
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG , 100 , byteArrayOutputStream);
        byte[] bytes = byteArrayOutputStream.toByteArray();
        return Base64.encodeToString(bytes , Base64.DEFAULT);
    }

    public static Bitmap decodeToBitmap(String imageString){
        byte[] decodeString = Base64.decode(imageString , Base64.DEFAULT);
        return BitmapFactory.decodeByteArray(decodeString , 0 , decodeString.length);
    }

}
