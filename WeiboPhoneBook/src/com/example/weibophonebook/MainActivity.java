package com.example.weibophonebook;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.os.TransactionTooLargeException;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	public TextView bottomLeftTextView = null;
	public TextView bottomMiddleTextView = null;
	public TextView bottomRightTextView = null;
	private CallerFragment mCaller;
	private ContactFragment mContact;
	private SmsFragment mSms;

	// private FriendFragment mFriend;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		bottomLeftTextView = (TextView) findViewById(R.id.bottom_left);
		bottomLeftTextView
				.setOnClickListener((android.view.View.OnClickListener) new MyButtonListener());
		bottomMiddleTextView = (TextView) findViewById(R.id.bottom_middle);
		bottomMiddleTextView
				.setOnClickListener((android.view.View.OnClickListener) new MyButtonListener());
		bottomRightTextView = (TextView) findViewById(R.id.bottom_right);
		bottomRightTextView
				.setOnClickListener((android.view.View.OnClickListener) new MyButtonListener());

		setDefaultFragment();

	}

	private void setDefaultFragment() {
		FragmentManager fm = getFragmentManager();
		FragmentTransaction transaction = fm.beginTransaction();
		mCaller = new CallerFragment();
		transaction.replace(R.id.id_content, mCaller);
		transaction.commit();
	}

	class MyButtonListener implements OnClickListener {
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			/*
			 * Intent intent = new Intent(); intent.putExtra("testIntent",
			 * "testactivity"); intent.setClass(MainActivity.this,
			 * activity02.class); MainActivity.this.startActivity(intent);
			 */
			FragmentManager fm = getFragmentManager();
			// 开启Fragment事务
			FragmentTransaction transaction = fm.beginTransaction();
			if (R.id.bottom_left == v.getId()) {
				Log.i("test", "呼叫");
				Toast.makeText(getApplicationContext(), "呼叫",
						Toast.LENGTH_SHORT).show();
				if (mCaller == null) {
					mCaller = new CallerFragment();
				}
				transaction.replace(R.id.id_content, mCaller);
				transaction.commit();
			}
			if (R.id.bottom_middle == v.getId()) {
				Log.i("test", "通讯录");
				Toast.makeText(getApplicationContext(), "通讯录",
						Toast.LENGTH_SHORT).show();
				if (mContact == null) {
					mContact = new ContactFragment();
				}
				transaction.replace(R.id.id_content, mContact);
				transaction.commit();
			}
			if (R.id.bottom_right == v.getId()) {
				Log.i("test", "短信");
				Toast.makeText(getApplicationContext(), "短信",
						Toast.LENGTH_SHORT).show();
				if (mSms== null) {
					mSms = new SmsFragment();
				}
				transaction.replace(R.id.id_content, mSms);
				transaction.commit();
			}
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
