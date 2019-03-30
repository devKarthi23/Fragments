package dev.karthi.github.fragments.Fragments;


import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import dev.karthi.github.fragments.R;


public class Parent2_adapter extends ArrayAdapter<Data> {

    public static List<Data> dataList;
    private final Context _context;
    Data vidItem;

    private ArrayList<Data> arraylist;

    public Parent2_adapter(Context context, List<Data> lst) {

        super(context, 0, lst);
        this._context = context;
        dataList = lst;
        this.arraylist = new ArrayList<Data>();
        this.arraylist.addAll(dataList);



    }



    @Override
    public View getView(final int position, final View convertView, ViewGroup parent)
    {
        LayoutInflater inflater = (LayoutInflater) getContext()
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        final View view = inflater.inflate(R.layout.child_fragment_adapter_1, parent, false);

        try
        {
            vidItem = dataList.get(position);


            final TextView customer_id =  view.findViewById(R.id.id);
            customer_id.setText(vidItem.getId());
            notifyDataSetChanged();


            final TextView raisedon = view.findViewById(R.id.date1);
            raisedon.setText(vidItem.getDate1());
            notifyDataSetChanged();


            final TextView date =  view.findViewById(R.id.date);
            date.setText(vidItem.getDate());
            notifyDataSetChanged();

            final TextView raisedby =  view.findViewById(R.id.person);
            raisedby.setText(vidItem.getName());
            notifyDataSetChanged();

            final TextView status =  view.findViewById(R.id.status);

            notifyDataSetChanged();


        }
        catch (Exception pre)
        {
            pre.printStackTrace();
            Log.d("content",""+pre);
        }
        return view;
    }










}


