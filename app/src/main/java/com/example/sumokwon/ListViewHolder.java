package com.example.sumokwon;

import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ListViewHolder {
    public TextView t_name;
    public TextView t_city;
    public TextView t_price;


    public ListViewHolder(View a_view){

        t_name = a_view.findViewById(R.id.name);
        t_city = a_view.findViewById(R.id.city);
        t_price = a_view.findViewById(R.id.price);


    }
}
