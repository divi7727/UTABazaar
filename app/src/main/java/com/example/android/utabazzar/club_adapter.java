package com.example.android.utabazzar;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.util.List;

public class club_adapter extends RecyclerView.Adapter<club_adapter.MyViewHolder> {

    private Context mContext;
    private List<Album> albumList;
    public ImageView thumbnail;
    TextView priceView, nameView;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title;
        public Album album;
        private CardView cardView;

        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.title);
            thumbnail = (ImageView) view.findViewById(R.id.thumbnail);
            priceView = (TextView) view.findViewById(R.id.product_price);
            nameView = (TextView) view.findViewById(R.id.product_name);
            cardView = (CardView) itemView.findViewById(R.id.card_view);
        }
    }


    public club_adapter(Context mContext, List<Album> albumList) {
        this.mContext = mContext;
        this.albumList = albumList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.album_card, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {
        final Album album = albumList.get(position);
        //String url = album.getUrl();
        String url ="https://firebasestorage.googleapis.com/v0/b/chatapp-f6a0c.appspot.com/o/images%2F-LBZNkffa3K2b4NjVFGN?alt=media&token=f35ed0ea-efae-4cd1-bde6-9401f7077a33";

        //System.out.println(url);
        //Log.v("This is the URL:", url);
        Picasso.with(mContext).load(ClubStoreFragment.returnUrl(position)).into(thumbnail);
        nameView.setText(album.getProduct_name());
        priceView.setText(album.getProduct_price());

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //implement onClick
                System.out.println("Clicked");
                Intent intent = new Intent(v.getContext(), ProductDetails1.class);
                intent.putExtra("Album", album);
                v.getContext().startActivity(intent);
                Toast.makeText(v.getContext(), album.getUrl(), Toast.LENGTH_LONG).show();
            }
        });

        thumbnail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), ProductDetails1.class);
                intent.putExtra("Album", album);
                v.getContext().startActivity(intent);
                Toast.makeText(v.getContext(), album.getUrl(), Toast.LENGTH_LONG).show();
            }
        });
    }


    @Override
    public int getItemCount() {
        return albumList.size();
    }
}
