package com.example.baseadapterdemo;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
//listView”≈ªØ
public class MainActivity extends Activity {
	private ListView listView;
	private MyAdapter adapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		List<ItemBean> itemBean = new ArrayList<ItemBean>();
		for (int i = 0; i < 10; i++) {
			itemBean.add(new ItemBean(R.drawable.ic_launcher, "ƒ⁄»›" + i));
		}
		listView = (ListView) findViewById(R.id.listView);
		listView.setAdapter(adapter);
	}
}
