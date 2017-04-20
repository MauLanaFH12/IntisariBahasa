package id.sch.smktelkom_mlg.xirpl42022242835.myapplication.adapter;

/**
 * Created by Izza on 18/04/2017.
 */


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import id.sch.smktelkom_mlg.xirpl42022242835.myapplication.R;
import id.sch.smktelkom_mlg.xirpl42022242835.myapplication.model.AwalanKe;


/**
 * Created by Izza on 21/03/2017.
 */

public class AwalanKeAdapter extends RecyclerView.Adapter<AwalanKeAdapter.ViewHolder>{

    IAwalanKeAdapter mIAwalanKeAdapter;
    ArrayList<AwalanKe> awalankeList;
    public AwalanKeAdapter(Context context, ArrayList<AwalanKe> awalankeList){
        this.awalankeList = awalankeList;
        mIAwalanKeAdapter = (IAwalanKeAdapter) context;
    }
    @Override
    public AwalanKeAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.awalan_ke_layout,parent,false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(AwalanKeAdapter.ViewHolder holder, int position) {
        AwalanKe awalanke = awalankeList.get(position);
        holder.tvJudul.setText(awalanke.judul);
    }

    @Override
    public int getItemCount() {
        if(awalankeList!=null)
            return awalankeList.size();
        return 0;
    }
    public interface IAwalanKeAdapter{
        void doClick(int pos);
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvJudul;

        public ViewHolder(View itemView)
        {
            super(itemView);
            tvJudul = (TextView) itemView.findViewById(R.id.textViewJudul);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mIAwalanKeAdapter.doClick(getAdapterPosition());
                }
            });
        }


    }

}