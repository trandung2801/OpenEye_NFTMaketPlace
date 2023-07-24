package com.example.openeye_nftmaketplace.Controller.SearchPage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.openeye_nftmaketplace.Adapter.ItemAdapter;
import com.example.openeye_nftmaketplace.Model.Item;
import com.example.openeye_nftmaketplace.R;

import java.util.ArrayList;
import java.util.List;

public class SearchCollectionActivity extends AppCompatActivity {

    private RecyclerView rcvItem;
    private ItemAdapter mItemAdapter;
    private Button follow_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_collection);
        rcvItem = findViewById(R.id.rcv_items);
        mItemAdapter = new ItemAdapter(this);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2);
        rcvItem.setLayoutManager(gridLayoutManager);
        mItemAdapter.setData(getListItem());
        rcvItem.setAdapter(mItemAdapter);


        ImageView searchNftBackSearch = findViewById(R.id.search_collection_back_search);

        searchNftBackSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SearchFragment.class);
                startActivity(intent);
            }
        });

    }

    private List<Item> getListItem() {
        List<Item> list = new ArrayList<>();
        list.add(new Item(R.drawable.avt1,"Avt1","10.000 VND"));
        list.add(new Item(R.drawable.avt2,"Avt2","20.000 VND"));
        list.add(new Item(R.drawable.avt3,"Avt3","30.000 VND"));
        list.add(new Item(R.drawable.avt4,"Avt4","40.000 VND"));
        list.add(new Item(R.drawable.avt5,"Avt5","50.000 VND"));
        list.add(new Item(R.drawable.avt6,"Avt6","60.000 VND"));
        list.add(new Item(R.drawable.avt7,"Avt7","70.000 VND"));
        list.add(new Item(R.drawable.avt8,"Avt8","80.000 VND"));
        list.add(new Item(R.drawable.avt9,"Avt9","90.000 VND"));
        list.add(new Item(R.drawable.avt9,"Avt9","90.000 VND"));
        return list;
    }
}