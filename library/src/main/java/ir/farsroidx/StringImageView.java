package ir.farsroidx;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;

public class StringImageView extends AppCompatImageView {

    public StringImageView(Context context) {
        super(context);
        init(context , null , 0);
    }

    public StringImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context , attrs , 0);
    }

    public StringImageView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context , attrs , defStyleAttr);
    }

    private void init(Context context , AttributeSet attrs , int defStyleAttr) {

        if(attrs != null){
            initAttributeSet(context, attrs , defStyleAttr);
        }
    }

    private void initAttributeSet(Context context , AttributeSet attrs , int defStyleAttr){

        TypedArray typedArray = context.getTheme().obtainStyledAttributes(attrs , R.styleable.StringImageView, defStyleAttr,0);

        typedArray.recycle();
    }

    public Bitmap getBitmapFromView(){
        return ((BitmapDrawable)this.getDrawable()).getBitmap();
    }

    public String getStringImageFromView(){
        return StringImage.encodeToString(getBitmapFromView());
    }

    public void setImageString(String stringImage){
        this.setImageBitmap(StringImage.decodeToBitmap(stringImage));
        invalidate();
    }

}
