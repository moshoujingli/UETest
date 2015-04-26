package com.example.uieffecttest;

import com.example.uieffecttest.view.WindProgressBar;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;

public class MainActivity extends ActionBarActivity {

  protected WindProgressBar mProgressBar;
  protected SeekBar mSeekBar;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    this.mProgressBar = (WindProgressBar)findViewById(R.id.wind_progress_bar);
    this.mProgressBar.setProgress(0);;
    this.mSeekBar = (SeekBar)findViewById(R.id.seek);
    this.mSeekBar.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
      
      @Override
      public void onStopTrackingTouch(SeekBar seekBar) {
        Log.i("touch",""+seekBar.getProgress());
        MainActivity.this.mProgressBar.setProgress(seekBar.getProgress());
      }
      
      @Override
      public void onStartTrackingTouch(SeekBar seekBar) {
        // TODO Auto-generated method stub
        
      }
      
      @Override
      public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        // TODO Auto-generated method stub
        
      }
    });
  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.main, menu);
    return true;
  }

  @Override
  public boolean onOptionsItemSelected(MenuItem item) {
    // Handle action bar item clicks here. The action bar will
    // automatically handle clicks on the Home/Up button, so long
    // as you specify a parent activity in AndroidManifest.xml.
    int id = item.getItemId();
    if (id == R.id.action_settings) {
      return true;
    }
    return super.onOptionsItemSelected(item);
  }
}
