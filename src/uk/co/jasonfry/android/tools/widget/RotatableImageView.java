package uk.co.jasonfry.android.tools.widget;


import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.ImageView;

public class RotatableImageView extends ImageView
{
	private int mRotation = 0;
	private float mXPivot = 0;
	private float mYPivot = 0;
	
	public RotatableImageView(Context context) 
	{
		super(context);
	}
	
	public RotatableImageView(Context context, AttributeSet attrs) 
	{
		super(context, attrs);
	}
	
	public void setRotation(int rotation, float xPivot, float yPivot)
	{
		mRotation = rotation;
		mXPivot = xPivot;
		mYPivot = yPivot;
	}
	
	public int getRotation()
	{
		return mRotation;
	}
	
	public float getXPivot()
	{
		return mXPivot;
	}
	
	public float getYPivot()
	{
		return mYPivot;
	}
	
	@Override
	protected void onDraw(Canvas canvas) 
	{
		canvas.save();
		canvas.rotate(mRotation,(float)(this.getWidth()*mXPivot),(float)(this.getHeight()*mYPivot));
		super.onDraw(canvas);
	    canvas.restore();
	}

}