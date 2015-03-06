package p.android_chapter_11;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import java.io.InputStream;

/**
 * Created by wangxm-wr on 2015/3/6 in Vanke.
 */
public class myView extends View {
    public myView(Context context) {
        super(context);
    }

    public myView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public myView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    static int degree = 1;

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
//        Paint paint1 = new Paint();
//        paint1.setColor(Color.RED);
//        paint1.setStrokeWidth(10);
//        paint1.setAntiAlias(true);
//        paint1.setDither(true);
//        paint1.setStyle(Paint.Style.FILL);
//        canvas.drawLine(20, 20, 200, 230, paint1);
//
        Paint paint2 = new Paint();
        paint2.setColor(Color.GRAY);
        paint2.setStrokeWidth(3);
        paint2.setAntiAlias(true);
        paint2.setDither(true);
        paint2.setTextSize(40);
        paint2.setStyle(Paint.Style.STROKE);
//        float[] points2 = {1.21f, 3.32f, 12, 42, 83, 211};
//        canvas.drawPoints(points2,0,6,paint2);

        Paint paint3 = new Paint();
        paint3.setColor(Color.RED);
        paint3.setStrokeWidth(1);
        paint3.setAntiAlias(true);
        paint3.setDither(true);
        paint3.setTextSize(40);
        paint3.setStyle(Paint.Style.STROKE);
//        float[] points3 = {200, 200, 100, 400, 500, 800};   //画三角形
////        float[] points3 = {200, 200, 100, 400, 500, 800,200,200};
////        canvas.drawLines(points3,0,4,paint3);
////        canvas.drawLines(points3,2,4,paint3);
////        canvas.drawLines(points3,4,4,paint3);
//        int len = points3.length;
//        for (int i = 0; i < len; i += 2) {
//            canvas.drawLine(points3[i], points3[i + 1], points3[(i + 2) % len], points3[(i + 3) % len], paint3);
//        }

//        canvas.drawText("kkssdfffffa", 0, 20, 100, 100, paint3);
//        float width = paint3.measureText("Android");
//        float higth = paint3.getTextSize();
//        canvas.drawText(width + " "+higth, 200, 200, paint3);

//        RectF rectF=new RectF(100,100,500,900);
//
//        canvas.drawArc(rectF,0,300,true,paint3);
//        rectF.top=300;
//        rectF.bottom=700;
//        canvas.drawArc(rectF,0,360,true,paint2);
//        canvas.drawText("Yuan",120,550,paint2);
//        canvas.drawText("Xing",120+paint2.measureText("Yuan")+10,550,paint2);

//        canvas.drawBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.net),100,100,paint2); //绘制位图1

//        Drawable drawable=getResources().getDrawable(R.drawable.pic);      //绘制位图2
//        drawable.setAlpha(100);
//        drawable.setBounds(200,200,230,230);
//        drawable.draw(canvas);

//        InputStream inputStream=getResources().openRawResource(R.drawable.net); //绘制位图3
//        BitmapFactory.Options bitmapFactoryOption=new BitmapFactory.Options();
//        bitmapFactoryOption.inSampleSize=1;
//        Bitmap bitmap=BitmapFactory.decodeStream(inputStream,null,bitmapFactoryOption);
//        canvas.drawBitmap(bitmap,50,50,paint2);

//        Matrix matrix=new Matrix();
//        matrix.setRotate(20,20,20);
//        canvas.setMatrix(matrix);

        Log.i("dsfsdf", "111111111111111111111111111");
        degree += 1;            //显示动画
        canvas.rotate(degree, 310, 310);
        canvas.drawBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.pic), 300, 300, paint3);
//        invalidate();
//        Log.i("dsfsdf", "222222222222222222222");

    }
}
