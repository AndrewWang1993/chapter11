package p.android_chapter_11;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ComposePathEffect;
import android.graphics.CornerPathEffect;
import android.graphics.DashPathEffect;
import android.graphics.DiscretePathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathDashPathEffect;
import android.graphics.PathEffect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import java.io.InputStream;

import javax.xml.validation.Validator;

/**
 * Created by wangxm-wr on 2015/3/6 in Vanke.
 */
public class myView extends View {
    Context context;

    public myView(Context context) {
        super(context);
        this.context = context;
    }

    public myView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public myView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    static int degree = 1;
    static int offset = 1;



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
//        Paint paint2 = new Paint();
//        paint2.setColor(Color.GRAY);
//        paint2.setStrokeWidth(3);
//        paint2.setAntiAlias(true);
//        paint2.setDither(true);
//        paint2.setTextSize(40);
//        paint2.setStyle(Paint.Style.STROKE);
//        float[] points2 = {1.21f, 3.32f, 12, 42, 83, 211};
//        canvas.drawPoints(points2,0,6,paint2);
//
//        Paint paint3 = new Paint();
//        paint3.setColor(Color.RED);
//        paint3.setStrokeWidth(3);
//        paint3.setAntiAlias(true);
//        paint3.setDither(true);
//        paint3.setTextSize(40);
//        paint3.setStyle(Paint.Style.STROKE);
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

//        Log.i("dsfsdf", "111111111111111111111111111");
//        degree += 1;            //显示动画
//        canvas.rotate(degree, 310, 310);
//        canvas.drawBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.pic), 300, 300, paint3);
//        invalidate();
//        Log.i("dsfsdf", "222222222222222222222");
//        offset+=20;
//
//        DashPathEffect pathEffect = new DashPathEffect(new float[]{
//                40, 5, 20, 5
//        }, offset);
//        CornerPathEffect cornerPathEffect=new CornerPathEffect(50);
//
//        Path p=new Path();
//        p.addCircle(300,300,100, Path.Direction.CCW);
//
//        PathDashPathEffect pDP=new PathDashPathEffect(p,1,offset, PathDashPathEffect.Style.TRANSLATE);
//        Paint paint4 = new Paint();
//        paint4.setPathEffect(new ComposePathEffect(pathEffect,cornerPathEffect));
//        paint4.setColor(Color.RED);
//        paint4.setStyle(Paint.Style.STROKE);
//        paint4.setStrokeWidth(5);
//        Path path = new Path();
//        path.moveTo(10, 10);
//
//        path.lineTo(300, 344);
//        path.lineTo(530, 144);

//        Paint paint5=new Paint();
//        paint5.setStrokeWidth(3);
//        paint5.setColor(Color.RED);
//        paint5.setStyle(Paint.Style.STROKE);
//        paint5.setPathEffect(new ComposePathEffect(pDP,cornerPathEffect));
//
//canvas.drawColor(Color.WHITE);
//        canvas.drawPath(p, paint5);
//        try {
//            Thread.sleep(200);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        invalidate();

//        offset += 20;
//        Paint paint = new Paint();
//        paint.setStrokeWidth(2);
//        paint.setStyle(Paint.Style.STROKE);
//        paint.setColor(Color.RED);
//        paint.setAntiAlias(true);
//        paint.setDither(true);
//
//        Path path = new Path();
//        path.moveTo(80, 800);
////        for (int i = 2; i < 8; i++) {
////            path.lineTo(80 * i, (float) Math.random() * 800);
////        }
//        path.lineTo(160,400);
//        path.lineTo(240,800);
//
//        Path path1 = new Path();
//        path1.moveTo(180, 800);
//        path1.addRect(100, 100, 321, 324, Path.Direction.CCW);
//
//
//        PathEffect[] pE = new PathEffect[7];
//        pE[0] = null;
//        pE[1] = new CornerPathEffect(50);
//        pE[2] = new DiscretePathEffect(1, 5);
//        pE[3] = new DashPathEffect(new float[]{20, 10, 15, 3}, offset);
//        pE[4] = new PathDashPathEffect(path1, 1, offset, PathDashPathEffect.Style.ROTATE);
//
////        paint.setPathEffect(new ComposePathEffect(pE[3],pE[1]));
//        paint.setPathEffect(pE[4]);
//        canvas.drawPath(path, paint);
//        invalidate();

//        Paint paint = new Paint();
//        paint.setAntiAlias(true);
//        paint.setStrokeWidth(3);
//        paint.setTextSize(30);
//        paint.setColor(Color.RED);
//        paint.setTextAlign(Paint.Align.RIGHT);
//
//        Path path = new Path();
//        path.addCircle(300, 300, 200, Path.Direction.CW);
//
//        canvas.drawColor(Color.WHITE);
////        canvas.drawTextOnPath("ANDROID DESIGN", path, 0, 0, paint);
////        canvas.translate(100,100);
//        canvas.drawTextOnPath("ANDROID DESIGN ANDROID DESIGN ANDROID DESIGN", path, 0, 0, paint);


    }

}
