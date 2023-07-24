package com.example.openeye_nftmaketplace.Controller.SearchPage;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.openeye_nftmaketplace.Controller.ProfilesPage.ProfilesActivity;
import com.example.openeye_nftmaketplace.R;

public class SearchFragment extends Fragment {

    private View mView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mView = inflater.inflate(R.layout.fragment_search, container, false);

        Button searchCollectionView = mView.findViewById(R.id.search_collection);
        searchCollectionView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), ProfilesActivity.class);
                startActivity(intent);
            }
        });

        Button searchNftView = mView.findViewById(R.id.search_nft);
        searchNftView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), ProfilesActivity.class);
                startActivity(intent);
            }
        });

        return mView;
    }
}
