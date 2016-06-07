package com.example.baseadapterdemo;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyAdapter extends BaseAdapter {
	private List<ItemBean> mlist;
	private LayoutInflater minflate;

	public MyAdapter(Context context, List<ItemBean> list) {
		mlist = list;
		minflate = LayoutInflater.from(context);
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return mlist.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return mlist.get(position);
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// // �˷���Դ,����ʽ
		// View view = minflate.inflate(R.layout.item, null);
		// ImageView image = (ImageView) view.findViewById(R.id.image);
		// TextView text = (TextView) view.findViewById(R.id.text);
		// ItemBean bean = mlist.get(position);
		// image.setImageResource(bean.ItemImageResId);
		// text.setText(bean.ItemContent);
		// return view;

		// ��ͨʽ,���û�����ƣ������ظ���������ʡ��Դ
		// if(convertView==null)
		// {
		// convertView=minflate.inflate(R.layout.item, null);
		// }
		// ImageView image = (ImageView) convertView.findViewById(R.id.image);
		// TextView text = (TextView) convertView.findViewById(R.id.text);
		// ItemBean bean = mlist.get(position);
		// image.setImageResource(bean.ItemImageResId);
		// text.setText(bean.ItemContent);
		// return convertView;

		// ����ʽ�����ʡ��,����ÿ�ζ�ȥʵ������һ��view�����û���
		ViewHolder holder;
		if (convertView == null) {
			holder = new ViewHolder();
			convertView = minflate.inflate(R.layout.item, null);
			holder.image = (ImageView) convertView.findViewById(R.id.image);
			holder.text = (TextView) convertView.findViewById(R.id.text);
			convertView.setTag(holder);
		} else {
			holder = (ViewHolder) convertView.getTag();
		}
		ItemBean bean = mlist.get(position);
		holder.image.setImageResource(bean.ItemImageResId);
		holder.text.setText(bean.ItemContent);
		return convertView;

	}

	class ViewHolder {
		public ImageView image;
		private TextView text;
	}
}
