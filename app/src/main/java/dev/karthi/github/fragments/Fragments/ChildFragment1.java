package dev.karthi.github.fragments.Fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;


import java.util.ArrayList;
import java.util.List;

import dev.karthi.github.fragments.R;

public class ChildFragment1 extends Fragment
{

    private List<Data> List_values = new ArrayList<>();
    private Data List_datas;

    ListView listview;

    ChildFragment1Adapter ListAdapter;


    public static ChildFragment1 newInstance(int position) {
        ChildFragment1 fragment = new ChildFragment1();
        Bundle args = new Bundle();
        args.putInt("position", position);
        fragment.setArguments(args);

        return fragment;
    }

    public ChildFragment1() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
        }
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.childfragment_layout,container,false);




        listview=view.findViewById(R.id.listview);

        load_customer_data();

        ListAdapter = new ChildFragment1Adapter(getContext(), List_values);
        listview.setAdapter(ListAdapter);

        return view;
    }

    private void load_customer_data() {


        List_datas=new Data("IND023","Ishanth Sharma","14/2/18","Kuldeep","1");
        List_values.add(List_datas);
        List_datas=new Data("RSA017","David Miller","14/2/18","DeVillers","0");
        List_values.add(List_datas);
        List_datas=new Data("ENG002","Ponting","17/2/18","Alex Hales","0");
        List_values.add(List_datas);
        List_datas=new Data("WIN333","Rovmen Powel","28/7/17","Chris Gayle","1");
        List_values.add(List_datas);
        List_datas=new Data("PAK003","Afridi","01/05/18","Kamran Akmal","0");
        List_values.add(List_datas);
        List_datas=new Data("ENG002","Ponting","17/2/18","Alex Hales","1");
        List_values.add(List_datas);

        List_datas=new Data("IND019","Rohit Sharma","12/12/18","Umesh Yadav","1");
        List_values.add(List_datas);
        List_datas=new Data("IND018","Sachin Tendulkar","01/04/18","Virat Kohli","1");
        List_values.add(List_datas);
        List_datas=new Data("IND005","Virat Kohli","17/2/18","Gautham Gambhir","1");
        List_values.add(List_datas);
        List_datas=new Data("RSA010","Chris Morris","28/7/17","David Miller","1");
        List_values.add(List_datas);
        List_datas=new Data("PAK098","Kamran Akmal","01/05/18","Sarfaraz Khan","0");
        List_values.add(List_datas);
        List_datas=new Data("SL011","M Muralidharan","17/2/18","K Sangakara","1");
        List_values.add(List_datas);

        List_datas=new Data("IND099","Shardul Thakur","09/07/18","Ravichandran Ashwin","0");
        List_values.add(List_datas);
        List_datas=new Data("NZ022","Martin Guptil","01/07/18","Kane WIlliamson","0");
        List_values.add(List_datas);
        List_datas=new Data("RAS065","Hashim Amla","22/9/18","Morne Morkel","0");
        List_values.add(List_datas);
        List_datas=new Data("NZ042","D Vittori","28/7/17","Brandon McCullam","1");
        List_values.add(List_datas);
        List_datas=new Data("RSA008","Mark Bouchker","01/05/18","H Gibbs","0");
        List_values.add(List_datas);
        List_datas=new Data("AUS001","M Starc","06/03/17","Usman Khawaja","0");
        List_values.add(List_datas);

    }
}
