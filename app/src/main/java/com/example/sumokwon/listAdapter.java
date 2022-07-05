package com.example.sumokwon;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class listAdapter extends BaseAdapter {
    private static final String TAG = "listAdapter";

    private List<String> items=new ArrayList<>();

    public void addItems(List<String> items){
        this.items=items;
    }

    @Override
    public int getCount() { //최초에 화면의 갯수를 설정함
        Log.d(TAG, "getCount: ");
        return items.size();
    }

    @Override
    public Object getItem(int position) { //아이템이 클릭될 때 아이템의 데이터를 도출
        Log.d(TAG, "getItem: ");
        return items.get(position);
    }

    @Override
    public long getItemId(int position) { //필수 아님
        Log.d(TAG, "getItemId: ");
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Log.d(TAG, "getView: "+position);
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View itemView=inflater.inflate(R.layout.listview_list,parent,false);
        TextView tv=itemView.findViewById(R.id.title);
        tv.setText(getItem(position).toString());
        return itemView;
    }
}