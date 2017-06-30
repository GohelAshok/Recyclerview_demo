package com.example.mind.recyclerview_demo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by mind on 30/6/17.
 */

class MultiViewTypeAdapter extends RecyclerView.Adapter {

    Context context;
    ArrayList list;
    int size;

    public MultiViewTypeAdapter(Context context, ArrayList list) {
        this.context = context;
        this.list = list;
        size = list.size();
    }

    public static class TextTypeViewHolder extends RecyclerView.ViewHolder {

        TextView textView,textView2,textView3;

        public TextTypeViewHolder(View itemView) {
            super(itemView);
            textView = (TextView) itemView.findViewById(R.id.textView);
            textView2=(TextView)itemView.findViewById(R.id.textView2);
            textView3=(TextView)itemView.findViewById(R.id.textView3);

        }
    }

    public static class ImageTypeViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView textView;

        public ImageTypeViewHolder(View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.imageView);
            textView=(TextView)itemView.findViewById(R.id.text4);
        }
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view;

        switch (viewType) {
            case User.TEXT_TYPE:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.texttype, parent, false);
                return new TextTypeViewHolder(view);

            case User.IMAGE_TYPE:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.imagetype, parent, false);
                return new ImageTypeViewHolder(view);

        }
        return null;

    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {


        User object = (User) list.get(position);
        if (object != null) {
            switch (object.type) {
                case User.TEXT_TYPE:
                    ((TextTypeViewHolder) holder).textView.setText(object.text);
                    ((TextTypeViewHolder) holder).textView2.setText(object.email);
                    ((TextTypeViewHolder) holder).textView3.setText(object.number);
                    break;

                case User.IMAGE_TYPE:
                    ((ImageTypeViewHolder) holder).imageView.setImageResource(object.data);
                    ((ImageTypeViewHolder) holder).textView.setText(object.text);

                    break;
            }
        }


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    @Override
    public int getItemViewType(int position) {


        switch (((User) list.get(position)).type) {
            case 0:
                return User.TEXT_TYPE;
            case 1:
                return User.IMAGE_TYPE;

            default:
                return -1;
        }
    }

}
