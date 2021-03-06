package com.kevadiyakrunalk.recycleadapter.animator.impl;

import android.support.v7.widget.RecyclerView;

public class MoveAnimationInfo extends ItemAnimationInfo {
    public RecyclerView.ViewHolder holder;
    public final int fromX;
    public final int fromY;
    public final int toX;
    public final int toY;

    public MoveAnimationInfo(RecyclerView.ViewHolder holder, int fromX, int fromY, int toX, int toY) {
        this.holder = holder;
        this.fromX = fromX;
        this.fromY = fromY;
        this.toX = toX;
        this.toY = toY;
    }

    @Override
    public RecyclerView.ViewHolder getAvailableViewHolder() {
        return holder;
    }

    @Override
    public void clear(RecyclerView.ViewHolder item) {
        if (holder == item) {
            holder = null;
        }
    }

    @Override
    public String toString() {
        return "MoveAnimationInfo{" +
                "holder=" + holder +
                ", fromX=" + fromX +
                ", fromY=" + fromY +
                ", toX=" + toX +
                ", toY=" + toY +
                '}';
    }
}