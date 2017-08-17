package app.ewtc.masterung.hamburgericon.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import app.ewtc.masterung.hamburgericon.MainActivity;
import app.ewtc.masterung.hamburgericon.R;

/**
 * Created by masterung on 8/17/2017 AD.
 */

public class MainFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        //Create ToolBar
//        Toolbar toolbar = getView().findViewById(R.id.mainToolBar);
//        ((MainActivity)getActivity()).setSupportActionBar(toolbar);

    }
}
