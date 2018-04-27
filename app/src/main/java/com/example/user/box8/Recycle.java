package com.example.user.box8;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Map;

public class Recycle extends RecyclerView.Adapter<Recycle.ViewHolder> {

    String ItemValue;
    Map<String,String[]> item;

    String[] fusionBox = {
            "Dal Makhni Rice Box", " Chole Chawal Box",
            "Rajma Chawal Box", "Grilled Tikki Box", "Paneer Masala Box"
    };
    String[] curries = {
            "Basmati Rice", "Tawa Paratha",
            "Kadhai Paneer", " Raita", "Butter Chicken"
    };
    String[] biryani = {
            "Sahi Panner Biryani", " Firangi Subz Biryani",
            "Chicken Tikka Biryani", "Murg Dum Biryani"
    };
    String[] wraps = {
            "Paneer Wrap", "Chicken Wrap",
            "Mayo Wrap", "Tikki Wrap", "Patty Wrap"
    };
    String[] iceCream = {
            "Tender Coconut", "Sheer Khurma"
    };
    //Map<String,String[]> item=new HashMap<String,String[]>();

    Recycle(String ItemValue) {
        this.ItemValue = ItemValue;
        Log.d("ItemValue",""+ItemValue);
        //Log.d("StringValue",""+FusionBox.toString().matches(ItemValue));
       // ArrayList itemList= new ArrayList();
         item=new HashMap<String,String[]>();
        item.put("fusionBox",fusionBox);
        item.put("curries",curries);
        item.put("biryani",biryani);
        item.put("wraps",wraps);
        item.put("iceCream",iceCream);
    }



    class ViewHolder extends RecyclerView.ViewHolder {

        public TextView itemTitle;
        Context c;


        public ViewHolder(final View itemView) {
            super(itemView);

            itemTitle = (TextView) itemView.findViewById(R.id.item_title);
            c = itemView.getContext();

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position = getAdapterPosition();

                }
            });
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.layout_one, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(final ViewHolder viewHolder, final int i) {

            if ("fusionBox"==ItemValue) {
                viewHolder.itemTitle.setText(fusionBox[i]);
              //  Log.d("fusion",""+key1+ItemValue);

            }
            else if ("curries"==ItemValue){
                viewHolder.itemTitle.setText(curries[i]);
               // Log.d("curries",""+key1+ItemValue);
            }
            else if ("wraps"==ItemValue){
                viewHolder.itemTitle.setText(wraps[i]);
              //  Log.d("wraps",""+key1+ItemValue);
            }
            else if ("biryani"==ItemValue){
                viewHolder.itemTitle.setText(biryani[i]);
              //  Log.d("biryani",""+key1+ItemValue);
            }
            else if ("iceCream"==ItemValue){
                viewHolder.itemTitle.setText(iceCream[i]);
               // Log.d("icecream",""+key1+ItemValue);
            }

    }


    @Override
    public int getItemCount() {
        int itemLength=0;


            if ("fusionBox" == ItemValue) {
                itemLength= fusionBox.length;
            } else if ("curries" == ItemValue) {
                itemLength=curries.length;
            } else if ("wraps" == ItemValue) {
                itemLength= wraps.length;
            } else if ("biryani" == ItemValue) {
                itemLength= biryani.length;
            } else if ("iceCream" == ItemValue) {
                itemLength= iceCream.length;
            }



        return itemLength;
    }
}