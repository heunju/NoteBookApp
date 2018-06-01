package org.androidtown.newjjjproject.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RatingBar;
import android.widget.TextView;

import org.androidtown.newjjjproject.BoardItem;
import org.androidtown.newjjjproject.BoardReviewAddActivity;
import org.androidtown.newjjjproject.R;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.Holder> {

    Context context;
    ArrayList<BoardItem> item = new ArrayList<>();


    public RecyclerAdapter(Context context,ArrayList<BoardItem> item)
    {
        this.context = context;
        this.item = item;
    }

    @Override
    public RecyclerAdapter.Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.boarditem, null);
        return new Holder(view);

    }

    @Override
    public void onBindViewHolder(RecyclerAdapter.Holder holder, int position) {

        holder.ratingBar.setNumStars(item.get(position).getRatingBar());
        holder.txt_modelName.setText(item.get(position).getTxt_modelName());
        holder.txt_review.setText(item.get(position).getTxt_review());

    }

    @Override
    public int getItemCount() {
        return item.size();
    }


    public class Holder extends RecyclerView.ViewHolder {

        RatingBar ratingBar;
        TextView txt_modelName;
        TextView txt_review;


        public Holder(View itemView) {
            super(itemView);

            ratingBar = itemView.findViewById(R.id.ratingBar);
            txt_modelName = itemView.findViewById(R.id.txt_modelName);
            txt_review = itemView.findViewById(R.id.txt_review);


            txt_modelName.setText(BoardReviewAddActivity.class.getName().toString());


        }
    }
}
