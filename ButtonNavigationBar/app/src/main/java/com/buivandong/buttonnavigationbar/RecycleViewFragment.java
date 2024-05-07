package com.buivandong.buttonnavigationbar;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class RecycleViewFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        List<Item> items = new ArrayList<Item>();
        items.add(new Item("Bui Van Dong", "vandong78py@gmail.com", R.drawable.avatar_112));
        items.add(new Item("Bui Van Dong", "vandong78py@gmail.com", R.drawable.avatar_112));
        items.add(new Item("Bui Van Dong", "vandong78py@gmail.com", R.drawable.avatar_112));
        items.add(new Item("Bui Van Dong", "vandong78py@gmail.com", R.drawable.avatar_112));
        items.add(new Item("Bui Van Dong", "vandong78py@gmail.com", R.drawable.avatar_112));
        items.add(new Item("Bui Van Dong", "vandong78py@gmail.com", R.drawable.avatar_112));
        items.add(new Item("Bui Van Dong", "vandong78py@gmail.com", R.drawable.avatar_112));
        items.add(new Item("Bui Van Dong", "vandong78py@gmail.com", R.drawable.avatar_112));
        items.add(new Item("Bui Van Dong", "vandong78py@gmail.com", R.drawable.avatar_112));
        items.add(new Item("Bui Van Dong", "vandong78py@gmail.com", R.drawable.avatar_112));
        items.add(new Item("Bui Van Dong", "vandong78py@gmail.com", R.drawable.avatar_112));
        items.add(new Item("Bui Van Dong", "vandong78py@gmail.com", R.drawable.avatar_112));
        items.add(new Item("Bui Van Dong", "vandong78py@gmail.com", R.drawable.avatar_112));
        items.add(new Item("Bui Van Dong", "vandong78py@gmail.com", R.drawable.avatar_112));
        items.add(new Item("Bui Van Dong", "vandong78py@gmail.com", R.drawable.avatar_112));
        items.add(new Item("Bui Van Dong", "vandong78py@gmail.com", R.drawable.avatar_112));
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_recycle_view, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.recylerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(new MyAdapter(getActivity().getApplicationContext(), items));
        return view;
    }
}