package com.fly.pyqp.adapter;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.view.ViewGroup;

import com.fly.pyqp.entity.ProductionEntity;

import java.util.List;

/**
 * Created by huangfei on 2017/10/8.
 */

public class RecentAdapter extends Adapter {

    List<ProductionEntity> mList;

    public  RecentAdapter(List<ProductionEntity> list){
        mList = list;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    @Override
    public int getItemViewType(int position) {
        return mList.get(position).getType();
    }
}
