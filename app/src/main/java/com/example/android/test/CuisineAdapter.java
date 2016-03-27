package com.example.android.test;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.example.android.test.entity.Cuisine;

/**
 * Created by Hippo on 27/03/2016.
 */
public class CuisineAdapter extends ArrayAdapter<Cuisine>{
    private Cuisine[] cuisines;
    private Context context;

    public CuisineAdapter(Cuisine[] cuisines, Context context){
        super(context,R.layout.dish_layout,cuisines);
        this.cuisines = cuisines;
        this.context = context;
    }
    private static class Holder{
        public ImageView imgView;
        public TextView nameView;
        public TextView priceView;
        public RatingBar ratingView;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v= convertView;
        Holder holder = new Holder();

        if(convertView==null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = inflater.inflate(R.layout.dish_layout, null);
            //fill layout
            TextView name = (TextView) v.findViewById(R.id.dish_name);
            TextView price = (TextView) v.findViewById(R.id.dish_price);
            ImageView img = (ImageView) v.findViewById(R.id.dish_img);
            RatingBar rating = (RatingBar) v.findViewById(R.id.dish_rating);

            holder.imgView = img;
            holder.nameView = name;
            holder.priceView = price;
            holder.ratingView = rating;
            v.setTag(holder);
        }
        else{holder = (Holder)v.getTag();
        }
        Cuisine c = cuisines[position];
        String imgString = "drawable/"+c.getImageName();
        int imageRes = v.getContext().getApplicationContext().getResources()
                .getIdentifier(imgString, null, v.getContext().getApplicationContext().getPackageName());

        holder.imgView.setImageResource(imageRes);
        holder.nameView.setText(c.getName());
        String s = new Double(c.getPrice()).toString();
        holder.priceView.setText("S$"+s);
        holder.ratingView.setRating(c.getRatings());
        return v;
    }
}
