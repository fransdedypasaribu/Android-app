package com.dicoding.fransdedypasaribu.mysubmissionapp;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import java.util.ArrayList;

public class ListAlatAdapter extends RecyclerView.Adapter<ListAlatAdapter.ListViewHolder> {
    private ArrayList<Alat> listAlat;
    public ListAlatAdapter(ArrayList<Alat> list) {
        this.listAlat = list;
    }
    private Context context;

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_alat, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, final int position) {
        final Alat alat = listAlat.get(position);
        Glide.with(holder.itemView.getContext())
                .load(alat.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPhoto);
        holder.tvName.setText(alat.getName());
        holder.tvFrom.setText(alat.getFrom());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context = v.getContext();
                Intent detailIntent = new Intent(context, DetailActivity.class);
                detailIntent.putExtra(DetailActivity.EXTRA_ALAT, listAlat.get(holder.getAdapterPosition()));
                System.out.print("SUSU" + (listAlat.get(holder.getAdapterPosition())).toString());
                context.startActivity(detailIntent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listAlat.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvFrom;
        ListViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvFrom = itemView.findViewById(R.id.tv_item_from);
        }
    }
}
