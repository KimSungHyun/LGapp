package com.example.main;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.graphics.drawable.shapes.PathShape;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Bundle;
import android.widget.Button;

public class View1 extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
     super.onCreate(savedInstanceState);
     setContentView(R.layout.activity_main);
  // �׷����Ʈ ��κ�
     Button btn = (Button)findViewById(R.id.btn21);
  GradientDrawable g = new GradientDrawable(
    GradientDrawable.Orientation.LEFT_RIGHT, 
    new int[] {Color.BLUE, Color.GREEN});
  btn.setBackgroundDrawable(g);
  // �ܻ� ��κ�
  btn = (Button)findViewById(R.id.btn22);
  btn.setBackgroundDrawable(new ColorDrawable(Color.GREEN));
  
  // Ư�� ������ ä��� ��κ�. �𼭸��� X, Y ������ ���� ���� ������ ���� �ִ�. 
  btn = (Button)findViewById(R.id.btn23);
  PaintDrawable pd = new PaintDrawable(Color.YELLOW);
  pd.setCornerRadius(10.0f);
  btn.setBackgroundDrawable(pd);
  // ����� ��κ�. 
  btn = (Button)findViewById(R.id.btn31);
  ShapeDrawable sd = new ShapeDrawable(new OvalShape());
  sd.getPaint().setShader(new RadialGradient(60, 30, 50,
    Color.WHITE, Color.BLACK, TileMode.CLAMP));
  btn.setBackgroundDrawable(sd);
  
  // �ձ� �簢�� ��κ�
  btn = (Button)findViewById(R.id.btn32);
  float[] outR = new float[] {5, 5, 30, 40, 5, 5, 5, 5 };
  RectF inRect = new RectF(30, 30, 30, 30);
  float[] inR = new float[] {0, 0, 20, 30, 0, 0, 0, 0 };
  ShapeDrawable sd2 = new ShapeDrawable(new RoundRectShape(outR, inRect, inR));
  sd2.getPaint().setColor(Color.MAGENTA);
  btn.setBackgroundDrawable(sd2);
  
  // �н� ��κ�
  btn = (Button)findViewById(R.id.btn33);
  Path path = new Path();
  path.moveTo(5, 0);
  path.lineTo(0, 7);
  path.lineTo(3, 7);
  path.lineTo(3, 10);
  path.lineTo(7, 10);
  path.lineTo(7, 7);
  path.lineTo(10, 7);
  

  ShapeDrawable sd3 = new ShapeDrawable(new PathShape(path,10,10));
  sd3.getPaint().setShader(new LinearGradient(0,0,0,10,
    0xff00ff00, 0xffff0000, TileMode.CLAMP));
  btn.setBackgroundDrawable(sd3);
    }
}