package aaa.bbb.svgtest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;

import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void animate(View view) {
        final ImageView v = (ImageView) view;
        Drawable d = v.getDrawable();
        if (d instanceof AnimatedVectorDrawableCompat){
            AnimatedVectorDrawableCompat avd = (AnimatedVectorDrawableCompat) d;
            avd.start();

        }
        else if (d instanceof AnimatedVectorDrawable){
            AnimatedVectorDrawable avd = (AnimatedVectorDrawable) d;
            avd.start();

            Thread thread2=new Thread(new Runnable() {
                @Override
                public void run() {

                    {
                        try {
                            Thread.sleep(2000);
                        } catch (Exception e) {
                            e.printStackTrace();
                        } finally {
                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    v.setVisibility(View.GONE);
                                                /*Intent i=new Intent(MainActivity.this,shakeshake.class);
                                                Bundle bag=new Bundle();
                                                bag.putInt("speed",speed);
                                                bag.putInt("count",counter);*/

                                }
                            });
                            run();
                        }
                    }
                    //Thread.interrupted();

                }
            });
            thread2.start();




        }
    }


    public void animate2(View view) {
        final ImageView v = (ImageView) view;
        Drawable d = v.getDrawable();
        if (d instanceof AnimatedVectorDrawableCompat){
            AnimatedVectorDrawableCompat avd = (AnimatedVectorDrawableCompat) d;
            avd.start();

        }
        else if (d instanceof AnimatedVectorDrawable) {
            AnimatedVectorDrawable avd = (AnimatedVectorDrawable) d;
            avd.start();

        }
    }

}
