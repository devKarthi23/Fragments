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

public class ParentFragment2 extends Fragment {


    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

//     TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private List<Data> List_values = new ArrayList<>();
    private Data List_datas;

    ListView listView;

    Parent2_adapter parent2_adapter;


    public ParentFragment2() {
    }

    public static ParentFragment2 newInstance() {
        ParentFragment2 fragment = new ParentFragment2();

        return fragment;
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.layout_5,container,false);



        listView=view.findViewById(R.id.listView);

        load_customer_data();

        parent2_adapter = new Parent2_adapter(getContext(), List_values);
        listView.setAdapter(parent2_adapter);
        return view;
    }


    private void load_customer_data() {


        List_datas=new Data("01","Australia","01/01/18","Geoff Parker","1");
        List_values.add(List_datas);
        List_datas=new Data("02","England","20/01/18","Mike Atherton","1");
        List_values.add(List_datas);
        List_datas=new Data("03","England","27/03/18","Harvey Trump","0");
        List_values.add(List_datas);
        List_datas=new Data("04","India","01/08/18","Myluahanan Senthilnathan ","1");
        List_values.add(List_datas);
        List_datas=new Data("05","Pakisthan","01/01/18","Zahoor Elahi ","0");
        List_values.add(List_datas);
        List_datas=new Data("06","Windies","27/08/18","Brian Lara ","1");
        List_values.add(List_datas);
        List_datas=new Data("07","England","10/02/18","Peter Martin","0");
        List_values.add(List_datas);
        List_datas=new Data("08","Pakisthan","10/02/18","Wasim Ali","1");
        List_values.add(List_datas);
        List_datas=new Data("09","India","10/02/18","Anand Deshpande","0");
        List_values.add(List_datas);

        List_datas=new Data("10","Pakisthan","30/01/18","Basit Ali ","0");
        List_values.add(List_datas);
        List_datas=new Data("11","India","04/07/18","Kanwar Virdi","0");
        List_values.add(List_datas);
        List_datas=new Data("12","India","09/12/18","Mohan Chaturvedi","1");
        List_values.add(List_datas);
        List_datas=new Data("13","India","01/02/18","Arjan Kripal Singh ","1");
        List_values.add(List_datas);
        List_datas=new Data("14","Windies","28/04/18","Nehemiah Perry ","1");
        List_values.add(List_datas);
        List_datas=new Data("15","Windies","03/06/18","Roland Holder ","1");
        List_values.add(List_datas);
        List_datas=new Data("16","England","10/06/18","Chris Lewis","1");
        List_values.add(List_datas);
        List_datas=new Data("17","Pakisthan","06/02/18","Mohammad Nawaz","1");
        List_values.add(List_datas);
        List_datas=new Data("18","Sri Lanka","10/02/18","Ajith Alirajah","0");
        List_values.add(List_datas);


    }
}
