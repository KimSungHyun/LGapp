package com.example.main;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Toast;

class View2 extends View {
    
    public View2(Context context) {
        super(context);
    }    
    protected void onDraw(Canvas canvas){
        Paint p = new Paint();
        Resources res = getResources();
        BitmapDrawable bd = (BitmapDrawable) res.getDrawable(R.drawable.ic_launcher);
        Bitmap bitmap = bd.getBitmap();
        canvas.drawBitmap(bitmap, null , new Rect(50,50,200,300), p); 
    }
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		// TODO Auto-generated method stub
		Toast.makeText(getContext(), "keyDown", 
                Toast.LENGTH_SHORT).show();
		return super.onKeyDown(keyCode, event);
	}
	@Override
	public boolean onKeyUp(int keyCode, KeyEvent event) {
		// TODO Auto-generated method stub		
		Toast.makeText(getContext(), "keyu", 
        Toast.LENGTH_SHORT).show();
		return super.onKeyUp(keyCode, event);
	}
    
}