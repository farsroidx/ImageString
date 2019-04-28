# String Image View
(Convert Image to String or String to Image on Android)

[![](https://jitpack.io/v/farsroidx/ImageString.svg)](https://jitpack.io/#farsroidx/ImageString)

# Step 1. Add the JitPack repository to your build file

Add it in your root build.gradle at the end of repositories:

    allprojects {
	     repositories {
		     ...
		     maven { url 'https://jitpack.io' }
	     }
    }

# Step 2. Add the dependency

    dependencies {
           implementation 'com.github.farsroidx:ImageString:1.0.0'
    }

# How to use:

in xml:

    <ir.farsroidx.StringImageView
        android:id="@+id/stringImageView"
        android:layout_width="match_parent"
        android:layout_height="0dp"
        android:layout_weight="1"
        android:contentDescription="@string/app_name" />
        
in java:

        StringImageView imageView = findViewById(R.id.stringImageView);
        
        // encode to string
        String encodeString = StringImageUtils.encodeToString(this , R.drawable.image);
        
        // decode to image                                                                  
        imageView.setImageString(encodeString);
        
# ALL Method:

        /// First Class StringImageUtils:
        StringImageUtils.encodeToString(bitmap);
        StringImageUtils.encodeToString(context , R.id.image);
        StringImageUtils.decodeToBitmap(stringImage);

        /// Second Class StringImageView:
        imageView.getBitmapImageFromView();     // get image from imageView as bitmap.
        imageView.getStringImageFromView();     // get image from imageView as string.
        imageView.setImageString(stringImage);  // set string image to imageView.

# All features have a AppCompatImageView.
