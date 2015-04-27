package com.example.uieffecttest.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;

public class WindProgressBar extends ProgressBar {

  private final int DEFAULT_LEAF_PERCENT=5;
  private final int DEFAULT_ANIM_DURATION=200;
  
  public WindProgressBar(Context context, AttributeSet attrs) {
    super(context, attrs);
    this.setAnimationDuration(DEFAULT_ANIM_DURATION);
    this.setPercentForOneLeaf(DEFAULT_LEAF_PERCENT);
  }

  @Override
  public synchronized void setProgress(int progress) {
    // TODO Auto-generated method stub
  }

  /**
   * <p>
   * Set the increment for each leaf.
   * </p>
   *
   * @param percent the increment in percent for each leaf, between 0 and 100
   */
  public void setPercentForOneLeaf(int percent) {

  }
  /**
   * <p>
   * Set the progress increment animation duration.
   * </p>
   *
   * @param duration the progress increment animation duration in millisecond.
   */
  public synchronized void setAnimationDuration(long duration) {

  }

}
