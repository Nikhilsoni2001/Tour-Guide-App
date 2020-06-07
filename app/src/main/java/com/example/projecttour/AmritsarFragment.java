package com.example.projecttour;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class AmritsarFragment extends Fragment {

    public AmritsarFragment() {
        // Required empty public constructor
    }

    @NonNull
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,@NonNull ViewGroup container,
                             @NonNull Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.list_view, container, false);

        ArrayList<Data> arrayList = new ArrayList<>();
        arrayList.add(new Data(getString(R.string.amritsar_place_1), getString(R.string.amritsar_detail_1), R.drawable.wagha_border));
        arrayList.add(new Data(getString(R.string.amritsar_place_2), getString(R.string.amritsar_detail_2), R.drawable.jallianwala_bagh));
        arrayList.add(new Data(getString(R.string.amritsar_place_3), getString(R.string.amritsar_detail_3)));
        arrayList.add(new Data(getString(R.string.amritsar_place_4), getString(R.string.amritsar_detail_4), R.drawable.golden_temple));

        DataAdapter dataAdapter = new DataAdapter(getActivity(), arrayList);
        ListView listView = rootView.findViewById(R.id.listView);
        listView.setAdapter(dataAdapter);

        return rootView;
    }
}