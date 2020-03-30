package com.dicoding.fransdedypasaribu.mysubmissionapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import java.util.Objects;

public class DetailActivity extends AppCompatActivity {

    public static final String EXTRA_ALAT = "extra_alat";

    ImageView ivPhoto;
    TextView tvTitle, tvDescription;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        getAlatData();

    }

    private void initView() {
        ivPhoto = findViewById(R.id.detail_item_photo);
        tvTitle = findViewById(R.id.detail_item_name);
        tvDescription = findViewById(R.id.detail_item_desc);
    }

    private void getAlatData() {
        initView();
        Alat alat = getIntent().getParcelableExtra(EXTRA_ALAT);
        Glide.with(this).load(Objects.requireNonNull(alat).getPhoto()).into(ivPhoto);
        tvTitle.setText(alat.getName());
        tvDescription.setText(alat.getFrom());
    }
}
