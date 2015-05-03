package com.example.uieffecttest.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;

public class WindProgressBar extends ProgressBar {

  private final int DEFAULT_LEAF_PERCENT = 5;
  private final int DEFAULT_ANIM_DURATION = 200;
  private final double DEFAULT_FAN_ANIM_SPEED = Math.PI * 2;

  private int mLeafPercent;
  private long mAnimDuration;
  private double mFanAnimSpeed;



  public WindProgressBar(Context context, AttributeSet attrs) {
    super(context, attrs);
    this.setAnimationDuration(DEFAULT_ANIM_DURATION);
    this.setPercentForOneLeaf(DEFAULT_LEAF_PERCENT);
    this.setFanSpeed(DEFAULT_FAN_ANIM_SPEED);
  }

  @Override
  public synchronized void setProgress(int progress) {
  }

  /**
   * <p>
   * Set the increment for each leaf.
   * </p>
   *
   * @param percent the increment in percent for each leaf, between 0 and 100
   */
  public void setPercentForOneLeaf(int percent) {
    this.mLeafPercent = percent;
  }

  /**
   * <p>
   * Set the progress increment animation duration.
   * </p>
   *
   * @param duration the progress increment animation duration in millisecond.
   */
  public synchronized void setAnimationDuration(long duration) {
    this.mAnimDuration=duration;
  }

  /**
   * <p>
   * Set the speed for fan.
   * </p>
   *
   * @param speed in arc.
   */
  public synchronized void setFanSpeed(double speed) {
    this.mFanAnimSpeed=speed;
  }

  @Override
  protected synchronized void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
    // TODO Auto-generated method stub
    super.onMeasure(widthMeasureSpec, heightMeasureSpec);
  }
    
}
