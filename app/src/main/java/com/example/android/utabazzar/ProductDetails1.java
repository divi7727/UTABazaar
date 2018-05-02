package com.example.android.utabazzar;

import android.content.Intent;
import android.os.Bundle;
<<<<<<< HEAD
import android.support.design.widget.FloatingActionButton;
=======
import android.content.Intent;
>>>>>>> 00499cb083ca2e7577f298cd3864db7a7f049dcc
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class ProductDetails1 extends AppCompatActivity {
    Spinner spinner1, spinner2, spinner3;
    Button delete, message, addtobag;
    ImageView imageView;
    TextView producName, productPrice, productId, seller_name, seller_phone, seller_email, seller_block, seller_room, time_period;
    String prod_id;
<<<<<<< HEAD
    public static String seller_email_stat, product_name_stat, seller_utaid_stat;
=======

    public static String productPriceUsd;

>>>>>>> 00499cb083ca2e7577f298cd3864db7a7f049dcc
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

        addtobag = (Button) findViewById(R.id.addtobag);

        message = (Button) findViewById(R.id.message);

        Album album = (Album) getIntent().getSerializableExtra("Album");
        Picasso.with(this).load(MainActivity.domain + album.getUrl()).into(imageView);
        producName.setText(album.getProduct_name());
        productPrice.setText("$"+album.getProduct_price());
        seller_name.setText(album.getSeller_name());
<<<<<<< HEAD
        seller_email_stat = album.getSeller_email();
        seller_utaid_stat = album.getSeller_block();
        product_name_stat = album.getProduct_name();

        FloatingActionButton myFab = (FloatingActionButton) findViewById(R.id.messageSeller);
        myFab.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent2= new Intent(getApplicationContext(),ChatActivity.class);
                startActivity(intent2);
                finish();
            }
        });
=======
        productPriceUsd = album.getProduct_price();
>>>>>>> 00499cb083ca2e7577f298cd3864db7a7f049dcc
        //productId.setText(album.getProduct_id());
        //seller_phone.setText(album.getSeller_phone());
        //seller_email.setText(album.getSeller_email());


        addtobag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                Intent intent = new Intent(ProductDetails1.this, Payment.class);
                startActivity(intent);
            }
            });
    }
}
