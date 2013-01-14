package org.treant.scrollgrid2_mutiscreens;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class LoadingActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		// this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		// this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
		// WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.layout_loading);
		intentToSkip();
	}

	private void intentToSkip() {
		new Handler().postDelayed(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				Intent intent = new Intent();
//				Class<?> c = (getPreferences(Context.MODE_PRIVATE).getBoolean(
//						Configure.PREFERENCES_GUIDE, false)) ? MainActivity.class
//						: GuideActivity.class;
				intent.setClass(LoadingActivity.this, MainActivity.class);
				startActivity(intent);
				overridePendingTransition(R.anim.anim_fromright_toup6,
						R.anim.anim_down_toleft6);
				finish();
			}

		}, 1250);

	}
}
