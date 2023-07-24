package com.example.openeye_nftmaketplace.Controller.CreateNftPage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.openeye_nftmaketplace.Controller.ProfilesPage.ProfilesFragment;
import com.example.openeye_nftmaketplace.R;

public class CreateNftActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_nft);

        ImageView backProfiles = findViewById(R.id.create_nft_back_profiles);
        backProfiles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ProfilesFragment.class);
                startActivity(intent);
            }
        });
    }
}