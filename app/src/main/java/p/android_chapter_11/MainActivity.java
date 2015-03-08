package p.android_chapter_11;

import android.app.ActionBar;
import android.app.Activity;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.lang.reflect.Field;
import java.security.MessageDigestSpi;


public class MainActivity extends Activity {
    View view;
    ImageView imageView;
    ImageView small_imageView;
    AnimationDrawable animationDrawable;
    Thread controlFrame;
//    Handler handler = new Handler(new Handler.Callback() {
//        @Override
//        public boolean handleMessage(Message msg) {   //运动的view
//            if (msg.arg2 == 2) {
//                Thread thread1 = new Thread(new Runnable() {
//                    @Override
//                    public void run() {
//                        while (true) {
////                            try {
////                                Thread.sleep(5);
////                            } catch (InterruptedException e) {
////                                e.printStackTrace();
////                            }
//                            Log.i("333333333333", "dssssssssssssssss");
//                            view.postInvalidate();
//                        }
//                    }
//                });
//                thread1.start();
//            }
//            return false;
//        }
//    });

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        LinearLayout linearLayout = new LinearLayout(this);
//        linearLayout.setOrientation(LinearLayout.VERTICAL);
//        setContentView(linearLayout);
//        Button button = new Button(this);
//        button.setText("create by code");
//        button.setId(1);
//        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup
//                .LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
//        layoutParams.setMargins(100, 0, 0, 0);
//        linearLayout.addView(button, layoutParams);
//
//        ImageView imageView1 = new ImageView(this);
//        imageView1.setImageResource(R.anim.m_anim);
//        animationDrawable = (AnimationDrawable) imageView1.getBackground();
//        LinearLayout.LayoutParams layoutParams1 = new LinearLayout.LayoutParams(ViewGroup
//                .LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
//        layoutParams1.setMargins(100, 100, 0, 0);
//        linearLayout.addView(imageView1, layoutParams1);

//        view = new myView(this);
//       setContentView(view);
        setContentView(R.layout.activity_main);
//
////        new Thread(new Runnable() {
////            @Override
////            public void run() {
////                while(true) {
////                    view.postInvalidate();
////                }
////            }
////        }).start();
////        Message message=new Message();
////        message.arg1=1;
////        message.arg2=2;
////        message.what=3;
////        message.obj= new Thread();
////        handler.sendMessage(message);
////        setContentView(view);
        imageView = (ImageView) findViewById(R.id.myImageview);
        small_imageView = (ImageView) findViewById(R.id.small_image);
        imageView.setBackgroundResource(R.anim.m_anim);
        animationDrawable = (AnimationDrawable) imageView.getBackground();
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {  //必须放在这里才能运行
        super.onWindowFocusChanged(hasFocus);
//        imageView= (ImageView) findViewById(R.id.myImageview);
//        imageView.setBackgroundResource(R.anim.m_anim);
//        animationDrawable=(AnimationDrawable)imageView.getBackground();
//        animationDrawable.start();

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void start(View view) {
        if (!animationDrawable.isRunning()) {
            animationDrawable.start();
            controlFrame = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Field field = AnimationDrawable.class.getDeclaredField("mCurFrame");
                        field.setAccessible(true);
                        while (true) {
                            int currentFrame = field.getInt(animationDrawable);
                            if (currentFrame == 2 || currentFrame == 3) {
                                field.setInt(animationDrawable, 4);
                            }
                        }
                    } catch (Exception e) {
                        Log.e("ERROR", e.getMessage());
                    }
                }
            });
            controlFrame.start();
        } else {
            try {
                controlFrame.interrupt();

            } catch (Exception e) {
                Log.i("Thread Stop Exception", e.getMessage());
            }
            animationDrawable.stop();
////            int number = animationDrawable.getNumberOfFrames();
////            int duration = animationDrawable.getDuration(1);
//            Drawable drawable = animationDrawable.getCurrent();
//            int len = animationDrawable.getNumberOfFrames();
//            long currentTime1=System.nanoTime();
//            for (int i = 0; i < len; i++) {   //7ms ~ 12ms 运行时间
//                if (animationDrawable.getFrame(i).equals(animationDrawable.getCurrent())) {
//                    Toast.makeText(this, i+"", Toast.LENGTH_LONG).show();
//                    small_imageView.setImageDrawable(animationDrawable.getCurrent());
//                }
//            }
//            long currentTime2=System.nanoTime();
//            Log.i("eclipseTime",currentTime2-currentTime1+"");
////            small_imageView.setImageDrawable(drawable);
////            Toast.makeText(this, number + " " + duration, Toast.LENGTH_LONG).show();
        }

    }
}
