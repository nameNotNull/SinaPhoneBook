package com.example.weibophonebook;

import android.app.Fragment;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class CallerFragment extends Fragment implements OnClickListener {

	public String dialNum = "";
	public ImageButton buttonNum1, buttonNum2, buttonNum3, buttonNum4,
			buttonNum5, buttonNum6, buttonNum7, buttonNum8, buttonNum9,
			buttonNum0, buttonCharLeft, buttonCharRight, buttonCall,
			buttondelete;
	public EditText et;

	@Override
	public void onClick(View v) {
		Log.i("aa", "aaaaaa");
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.callerimg1:
			dialNum += "1";
			Log.i("A", dialNum);
			break;
		case R.id.callerimg2:
			dialNum += "2";
			Log.i("A", dialNum);
			break;
		case R.id.callerimg3:
			dialNum += "3";
			Log.i("A", dialNum);
			break;
		case R.id.callerimg4:
			dialNum += "4";
			Log.i("A", dialNum);
			break;
		case R.id.callerimg5:
			dialNum += "5";
			Log.i("A", dialNum);
			break;
		case R.id.callerimg6:
			dialNum += "6";
			Log.i("A", dialNum);
			break;
		case R.id.callerimg7:
			dialNum += "7";
			Log.i("A", dialNum);
			break;
		case R.id.callerimg8:
			dialNum += "8";
			Log.i("A", dialNum);
			break;
		case R.id.callerimg9:
			dialNum += "9";
			Log.i("A", dialNum);
			break;
		case R.id.callerimg0:
			dialNum += "0";
			Log.i("A", dialNum);
			break;
		case R.id.callerimgleft:
			dialNum += "*";
			Log.i("A", dialNum);
			break;
		case R.id.callerimgright:
			dialNum += "#";
			Log.i("A", "ls");
			break;
		case R.id.callerimgcall:
			callNumber(dialNum);
			break;
		case R.id.callerimgdelete:
			if (dialNum.length() >=1) {
				dialNum = dialNum.substring(0, dialNum.length() - 1);
			}
			break;
		default:
			Log.i("aa", "cccca");
			break;

		}
		et.setText(dialNum);

	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onActivityCreated(savedInstanceState);

		Log.i("aa", "ddddddddd");
		buttonNum1.setOnClickListener(this);
		buttonNum2.setOnClickListener(this);
		buttonNum3.setOnClickListener(this);
		buttonNum4.setOnClickListener(this);
		buttonNum5.setOnClickListener(this);
		buttonNum6.setOnClickListener(this);
		buttonNum7.setOnClickListener(this);
		buttonNum8.setOnClickListener(this);
		buttonNum9.setOnClickListener(this);
		buttonNum0.setOnClickListener(this);
		buttonCharLeft.setOnClickListener(this);
		buttonCharRight.setOnClickListener(this);
		buttonCall.setOnClickListener(this);
		buttondelete.setOnClickListener(this);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View view = inflater.inflate(R.layout.callerfragment, container, false);
		et = (EditText) view.findViewById(R.id.etTest);
		Log.i("aa", "bbbbbbbb");
		buttonNum1 = (ImageButton) view.findViewById(R.id.callerimg1);
		buttonNum2 = (ImageButton) view.findViewById(R.id.callerimg2);
		buttonNum3 = (ImageButton) view.findViewById(R.id.callerimg3);
		buttonNum4 = (ImageButton) view.findViewById(R.id.callerimg4);
		buttonNum5 = (ImageButton) view.findViewById(R.id.callerimg5);
		buttonNum6 = (ImageButton) view.findViewById(R.id.callerimg6);
		buttonNum7 = (ImageButton) view.findViewById(R.id.callerimg7);
		buttonNum8 = (ImageButton) view.findViewById(R.id.callerimg8);
		buttonNum9 = (ImageButton) view.findViewById(R.id.callerimg9);
		buttonNum0 = (ImageButton) view.findViewById(R.id.callerimg0);
		buttonCharLeft = (ImageButton) view.findViewById(R.id.callerimgleft);
		buttonCharRight = (ImageButton) view.findViewById(R.id.callerimgright);
		buttonCall = (ImageButton) view.findViewById(R.id.callerimgcall);
		buttondelete = (ImageButton) view.findViewById(R.id.callerimgdelete);
		return view;
	}

	public void callNumber(String callNum) {
		Intent dialIntent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:"
				+ callNum));
		startActivity(dialIntent);

	}

}