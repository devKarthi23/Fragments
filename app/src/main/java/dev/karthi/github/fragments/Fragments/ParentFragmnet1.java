package dev.karthi.github.fragments.Fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import dev.karthi.github.fragments.R;


public class ParentFragmnet1 extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.layout_2,container,false);

        ViewPager viewPager=view.findViewById(R.id.container);

        SectionsPagerAdapter sectionsPagerAdapter=new SectionsPagerAdapter(getChildFragmentManager());

        viewPager.setAdapter(sectionsPagerAdapter);

        setupViewPager(viewPager);


        return view;
    }


    private void setupViewPager(ViewPager viewPager)
    {
        MySectionPageAdapter mySectionPageAdapter=new MySectionPageAdapter(getChildFragmentManager());
        mySectionPageAdapter.addFragment(new ChildFragment1(),"CHILD 1");
        mySectionPageAdapter.addFragment(new ChildFragment2(),"CHILD 2");
        viewPager.setAdapter(mySectionPageAdapter);
    }


    private class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    return ChildFragment1.newInstance(1);
                default:
                    return ChildFragment2.newInstance(2);
            }

        }

        @Override
        public int getCount() {
            // Show 4 total pages.
            return 2;
        }

        @Override
        public CharSequence getPageTitle(int position) {

            switch (position) {
                case 0:
                    return "Nested 1";
                default:
                    return "Nested 2";
            }


        }
    }



}
