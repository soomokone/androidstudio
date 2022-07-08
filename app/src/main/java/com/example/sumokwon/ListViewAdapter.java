package com.example.sumokwon;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import java.util.List;


public class ListViewAdapter extends ArrayAdapter<SampleData>{

    //private HashMap<String,String> hashMap;
    private Context context;
    private List<SampleData> mItemList;
    private static final int LAYOUT_RESOURCE_ID = R.layout.listview_list;

    public ListViewAdapter(Context a_context, List<SampleData> a_itemList) {
        super(a_context,LAYOUT_RESOURCE_ID , a_itemList);

        context = a_context;
        mItemList = a_itemList;
    }

    @Override
    public View getView(int position,View a_convertView,ViewGroup parent)
    {
        ListViewHolder viewHolder;
        if (a_convertView == null) {
            a_convertView = LayoutInflater.from(context).inflate(LAYOUT_RESOURCE_ID, parent, false);

            viewHolder = new ListViewHolder(a_convertView);
            a_convertView.setTag(viewHolder);
        }
        else
        {
            viewHolder = (ListViewHolder) a_convertView.getTag();
        }

        final SampleData listItem = mItemList.get(position);

        //설정
        viewHolder.t_name.setText(listItem.getName());
        viewHolder.t_city.setText(listItem.getCity());
        viewHolder.t_price.setText(listItem.getPrice());

       /* convertView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast.makeText(context,position+"번째",Toast.LENGTH_LONG).show();
            }

        });*/

        return a_convertView;

    }

}



