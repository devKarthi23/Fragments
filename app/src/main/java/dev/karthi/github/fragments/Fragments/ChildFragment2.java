package dev.karthi.github.fragments.Fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;


import java.util.ArrayList;
import java.util.List;

import dev.karthi.github.fragments.R;

public class ChildFragment2 extends Fragment {

    private List<Data> List_values = new ArrayList<>();
    private Data List_datas;

    ListView listview;

    ChildFragment2Adapter childFragment2Adapter;
    TextView tv_raisedon,tv_id,tv_date,tv_raisedby,tv_status;

    public static ChildFragment2 newInstance(int position) {
        ChildFragment2 fragment = new ChildFragment2();
        Bundle args = new Bundle();
        args.putInt("position", position);
        fragment.setArguments(args);

        return fragment;
    }

    public ChildFragment2() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            /* mPosition = getArguments().getInt("position");*/
        }
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.layout_3,container,false);

        listview=view.findViewById(R.id.listview);

        tv_raisedon=view.findViewById(R.id.tv_date1);
        tv_id=view.findViewById(R.id.tv_id);
        tv_date=view.findViewById(R.id.tv_date1);
        tv_raisedby=view.findViewById(R.id.tv_person);
        tv_status=view.findViewById(R.id.tv_status);




        tv_raisedon.setVisibility(View.GONE);

        load_customer_data();

        childFragment2Adapter = new ChildFragment2Adapter(getContext(), List_values);
        listview.setAdapter(childFragment2Adapter);


        return view;
    }

    private void load_customer_data() {


        List_datas=new Data("01","Ishanth Sharma","14/2/18","Deepak Chahar","0");
        List_values.add(List_datas);
        List_datas=new Data("02","David Miller","14/2/18","Jofra Archer","0");
        List_values.add(List_datas);
        List_datas=new Data("03","Ponting","17/2/18","Alex Carrey","0");
        List_values.add(List_datas);
        List_datas=new Data("04","Rovmen Powel","28/7/17","N Lyon","0");
        List_values.add(List_datas);
        List_datas=new Data("05","Afridi","01/05/18","KM Asif","0");
        List_values.add(List_datas);
        List_datas=new Data("06","Ponting","17/2/18","Natrajan","1");
        List_values.add(List_datas);

        List_datas=new Data("07","Rohit Sharma","12/12/18","Bishnoi","0");
        List_values.add(List_datas);
        List_datas=new Data("08","Sachin Tendulkar","01/04/18","D Shorey","0");
        List_values.add(List_datas);
        List_datas=new Data("09","Virat Kohli","17/2/18","M Markandhe","1");
        List_values.add(List_datas);
        List_datas=new Data("10","Chris Morris","28/7/17","Rinku Singh","0");
        List_values.add(List_datas);
        List_datas=new Data("11","Kamran Akmal","01/05/18","N Rana","0");
        List_values.add(List_datas);
        List_datas=new Data("12","M Muralidharan","17/2/18","M Singh","1");
        List_values.add(List_datas);

        List_datas=new Data("13","Shardul Thakur","09/07/18","M Agarwal","0");
        List_values.add(List_datas);
        List_datas=new Data("14","Martin Guptil","01/07/18","S Gopal","1");
        List_values.add(List_datas);
        List_datas=new Data("15","Hashim Amla","22/9/18","K Gowtham","0");
        List_values.add(List_datas);
        List_datas=new Data("16","D Vittori","28/7/17","Fergoson","1");
        List_values.add(List_datas);
        List_datas=new Data("17","Mark Bouchker","01/05/18","C Anderson","0");
        List_values.add(List_datas);
        List_datas=new Data("18","M Starc","06/03/17","Zampa","0");
        List_values.add(List_datas);

    }
}
