package com.example.user.box8;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class MainActivity extends BaseAdapter {

    private Context mContext;

        Integer[] mThumbIds = {
                R.drawable.image_first, R.drawable.image_second,
                R.drawable.image_fourth,R.drawable.image_fourth, R.drawable.image_third
        };
    String[] mThumbNames = {
            "fusionBox","curries",
            "biryani","wraps","iceCream"
    };

         MainActivity(Context c){
            mContext = c;
        }

        @Override
        public int getCount() {
            return mThumbIds.length;
        }

        @Override
        public Object getItem(int position) {
            return mThumbIds[position];
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            ImageView imageView = new ImageView(mContext);
            imageView.setImageResource(mThumbIds[position]);
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setLayoutParams(new GridView.LayoutParams(500, 500));
            return imageView;
        }

    }



