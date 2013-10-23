package com.jt.dispatchtouchevent;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.LinearLayout;

public class SecondGroup extends LinearLayout{
	
	final String TAG = "SecondGroup";
	
	public SecondGroup(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public boolean onInterceptTouchEvent(MotionEvent ev) {
		// TODO Auto-generated method stub
		int action = ev.getAction();
		String a = "";
		if (action == MotionEvent.ACTION_DOWN) {
			a = "ACTION_DOWN";
		} else if (action == MotionEvent.ACTION_MOVE) {
			a = "ACTION_MOVE";
		}else if (action == MotionEvent.ACTION_UP) {
			a = "ACTION_UP";
		}
		Log.e(TAG, "onInterceptTouchEvent " + a);
		
		return false;
	}

	@Override
	public boolean onTouchEvent(MotionEvent event) {
		// TODO Auto-generated method stub
		
		int action = event.getAction();
		String a = "";
		if (action == MotionEvent.ACTION_DOWN) {
			a = "ACTION_DOWN";
		} else if (action == MotionEvent.ACTION_MOVE) {
			a = "ACTION_MOVE";
		}else if (action == MotionEvent.ACTION_UP) {
			a = "ACTION_UP";
		}
		Log.e(TAG, "onTouchEvent " + a);
		
		return false;
	}
}
