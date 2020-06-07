package com.example.projecttour;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class DataAdapter extends ArrayAdapter<Data> {
    public DataAdapter(Context context, ArrayList<Data> arrayAdapter) {
        super(context, 0, arrayAdapter);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listView = convertView;
        if (listView == null) {
            listView = LayoutInflater.from(getContext()).inflate(
                    R.layout.data_list, parent, false);
        }

        Data data = getItem(position);

        TextView textView_name = listView.findViewById(R.id.nameOfPlace);
        if (data != null) {
            textView_name.setText(data.getmPlaceName());
        }

        TextView textView_detail = listView.findViewById(R.id.details);
        if (data != null) {
            textView_detail.setText(data.getmPlacedetails());
        }

        ImageView imageView = listView.findViewById(R.id.imageOfPlace);
        if (data != null) {
            if (data.hasImage()) {
                imageView.setVisibility(View.VISIBLE);
                imageView.setImageResource(data.getmPlaceImageId());
            } else {
                imageView.setVisibility(View.GONE);

            }
        }

        return listView;
    }
}
