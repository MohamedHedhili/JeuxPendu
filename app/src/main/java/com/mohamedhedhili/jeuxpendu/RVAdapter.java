package com.mohamedhedhili.jeuxpendu;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by mohamedHedhili on 29/03/2017.
 */
public class RVAdapter extends RecyclerView.Adapter<CharacterViewHolder> {

    List<MyObject> characters;

    RVAdapter(List<MyObject> characters) {
        this.characters = characters;
    }

    @Override
    public CharacterViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cv, viewGroup, false);


        return new CharacterViewHolder(v);
    }

    @Override
    public void onBindViewHolder(CharacterViewHolder holder, int position) {
        MyObject myObject = characters.get(position);
        holder.bind(myObject);
    }


    @Override
    public int getItemCount() {
        return characters.size();
    }



}
