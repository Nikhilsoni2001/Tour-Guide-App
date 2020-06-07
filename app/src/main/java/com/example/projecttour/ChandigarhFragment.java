package com.example.projecttour;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class ChandigarhFragment extends Fragment {

    public ChandigarhFragment() {
        // Required empty public constructor
    }

    @NonNull
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,@NonNull ViewGroup container,
                             @NonNull Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.list_view, container, false);


        ArrayList<Data> arrayList = new ArrayList<>();
        arrayList.add(new Data(getString(R.string.chandigarh_place_1), getString(R.string.chandigarh_detail_1), R.drawable.elante));
        arrayList.add(new Data(getString(R.string.chandigarh_place_2), getString(R.string.chandigarh_detail_2), R.drawable.rockgarden));
        arrayList.add(new Data(getString(R.string.chandigarh_place_3), getString(R.string.chandigarh_detail_3), R.drawable.sukhna_lake));
        arrayList.add(new Data(getString(R.string.chandigarh_place_4), getString(R.string.chandigarh_detail_4), R.drawable.citco));

        DataAdapter dataAdapter = new DataAdapter(getActivity(), arrayList);

        ListView listView = rootView.findViewById(R.id.listView);

        listView.setAdapter(dataAdapter);

        return rootView;

    }
}