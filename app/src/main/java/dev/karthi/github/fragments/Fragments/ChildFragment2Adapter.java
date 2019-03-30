package dev.karthi.github.fragments.Fragments;


import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import dev.karthi.github.fragments.R;


public class ChildFragment2Adapter extends ArrayAdapter<Data> {

    public static List<Data> dataList;
    private final Context _context;
    Data vidItem;
    InputMethodManager inputMgr;


    private ArrayList<Data> arraylist;



    public ChildFragment2Adapter(Context context, List<Data> lst) {

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
            inputMgr = (InputMethodManager) getContext().getSystemService(Context.INPUT_METHOD_SERVICE);


            final TextView customer_id =  view.findViewById(R.id.id);
            customer_id.setText(vidItem.getId());
            notifyDataSetChanged();


            final TextView raisedon = view.findViewById(R.id.date1);
            raisedon.setVisibility(View.GONE);
            raisedon.setText(vidItem.getDate1());
            notifyDataSetChanged();


            final TextView date =  view.findViewById(R.id.date);
            date.setText(vidItem.getDate());
            notifyDataSetChanged();

            final TextView raisedby =  view.findViewById(R.id.person);
            raisedby.setText(vidItem.getName());
            notifyDataSetChanged();

            final TextView status =  view.findViewById(R.id.status);
            status.setText(vidItem.getStatus());
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


