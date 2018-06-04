package com.example.kmj.todolist;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomListAdapter extends BaseAdapter {
    ArrayList<String> items = new ArrayList<>();

    public CustomListAdapter(ArrayList<String> items) {
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int i) {
        return items.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup parent) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, null);
        TextView diary = (TextView) v.findViewById(R.id.content);

        diary.setText(items.get(i));
        return v;
    }
}
