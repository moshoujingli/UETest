package com.example.uieffecttest.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;

public class WindProgressBar extends ProgressBar {

  public WindProgressBar(Context context, AttributeSet attrs) {
    super(context, attrs);
    this.setIndeterminate(false);
  }

}
