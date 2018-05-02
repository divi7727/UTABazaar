package com.example.android.utabazzar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class ProductDetails1 extends AppCompatActivity {
    Spinner spinner1, spinner2, spinner3;
    Button delete, message;
    ImageView imageView;
    TextView producName, productPrice, productId, seller_name, seller_phone, seller_email, seller_block, seller_room, time_period;
    String prod_id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.product_details_final);



        imageView = (ImageView) findViewById(R.id.product_pic);
        producName = (TextView) findViewById(R.id.product_name1);
        productPrice = (TextView) findViewById(R.id.product_price1);
        seller_name = (TextView) findViewById(R.id.sold_by);
        //seller_phone = (TextView) findViewById(R.id.seller_phone);
        //seller_email = (TextView) findViewById(R.id.seller_email);
        //seller_block = (TextView) findViewById(R.id.seller_block);
        //seller_room = (TextView) findViewById(R.id.seller_room);
        //time_period = (TextView) findViewById(R.id.time_period);


        delete = (Button) findViewById(R.id.delete);

        message = (Button) findViewById(R.id.message);

        Album album = (Album) getIntent().getSerializableExtra("Album");
        Picasso.with(this).load(MainActivity.domain + album.getUrl()).into(imageView);
        producName.setText(album.getProduct_name());
        productPrice.setText("$"+album.getProduct_price());
        seller_name.setText(album.getSeller_name());

        //productId.setText(album.getProduct_id());
        //seller_phone.setText(album.getSeller_phone());
        //seller_email.setText(album.getSeller_email());



    }
}
