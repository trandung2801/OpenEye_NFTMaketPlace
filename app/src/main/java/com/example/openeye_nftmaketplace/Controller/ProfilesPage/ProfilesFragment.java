package com.example.openeye_nftmaketplace.Controller.ProfilesPage;

import static androidx.databinding.DataBindingUtil.setContentView;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.openeye_nftmaketplace.Adapter.ItemAdapter;
import com.example.openeye_nftmaketplace.Model.Item;
import com.example.openeye_nftmaketplace.R;


import java.util.ArrayList;
import java.util.List;

public class ProfilesFragment extends Fragment {

    private View mView;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mView = inflater.inflate(R.layout.fragment_profiles, container, false);

        Button collectionView = mView.findViewById(R.id.collection_profiles);
        collectionView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), ProfilesActivity.class);
                startActivity(intent);
            }
        });

        Button createNftView = mView.findViewById(R.id.create_nft);
        createNftView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), ProfilesActivity.class);
                startActivity(intent);
            }
        });

        return mView;
    }

//    @Override
//    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
//        super.onViewCreated(view, savedInstanceState);
//
//        dataInitialize();
//
//        rcvItem = view.findViewById(R.id.rcv_items);
//        rcvItem.setLayoutManager(new GridLayoutManager(getContext(), 2));
//        rcvItem.setHasFixedSize(true);
//
//        mItemAdapter = new ItemAdapter(getContext());
//        rcvItem.setAdapter(mItemAdapter);
//    }
//
//    private void dataInitialize() {
//        List<Item> list = new ArrayList<>();
//        list.add(new Item(R.drawable.avt1,"Avt1","10.000 VND"));
//        list.add(new Item(R.drawable.avt2,"Avt2","20.000 VND"));
//        list.add(new Item(R.drawable.avt3,"Avt3","30.000 VND"));
//        list.add(new Item(R.drawable.avt4,"Avt4","40.000 VND"));
//        list.add(new Item(R.drawable.avt5,"Avt5","50.000 VND"));
//        list.add(new Item(R.drawable.avt6,"Avt6","60.000 VND"));
//        list.add(new Item(R.drawable.avt7,"Avt7","70.000 VND"));
//        list.add(new Item(R.drawable.avt8,"Avt8","80.000 VND"));
//        list.add(new Item(R.drawable.avt9,"Avt9","90.000 VND"));
//
//    }
}
