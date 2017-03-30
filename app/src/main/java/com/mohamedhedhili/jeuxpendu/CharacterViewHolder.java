package com.mohamedhedhili.jeuxpendu;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.github.anastr.speedviewlib.Speedometer;

/**
 * Created by mohamedHedhili on 29/03/2017.
 */
public class CharacterViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

    ImageView iv_icon;
    TextView tv_name;
    Speedometer speedometer;
    Context context = null ;

    CharacterViewHolder(View itemView) {
        super(itemView);
        itemView.setOnClickListener(this);
        iv_icon = (ImageView) itemView.findViewById(R.id.iv_icon);
        tv_name = (TextView) itemView.findViewById(R.id.tv_name);
        speedometer = (Speedometer) itemView.findViewById(R.id.speedometer);
    }

    public void bind(   MyObject myObject){
        tv_name.setText(myObject.name);
        iv_icon.setImageResource(myObject.imageId);
        speedometer.speedPercentTo(myObject.lovePercent);
    }

    @Override
    public void onClick(View view) {
        context = view.getContext();

        if (tv_name.getText().toString().equals("Ecole"))
        {
            Intent i  =  new Intent(view.getContext() , Level.class);
           i.putExtra("nameFile","Ecole.txt");

            context.startActivity(i);

        }
        else if (tv_name.getText().toString().equals("Cartoon"))
        {
            Intent i  =  new Intent(view.getContext() , Level.class);
            i.putExtra("nameFile", "Cartoon.txt");
            context.startActivity(i);


        }
        else if (tv_name.getText().toString().trim().equals("Sport"))
        {
            Intent i  =  new Intent(view.getContext() , Level.class);
            i.putExtra("nameFile","Sport.txt");

            context.startActivity(i);
        }
        else if (tv_name.getText().toString().trim().equals("Histoire"))
        {
            Intent i  =  new Intent(view.getContext(), Level.class);
            i.putExtra("nameFile","Histoire.txt");

            context.startActivity(i);
        }
        else if (tv_name.getText().toString().trim().equals("Géographic"))
        {
            Intent i  =  new Intent(view.getContext() , Level.class);
            i.putExtra("nameFile","Geographic.txt");

            context.startActivity(i);
        }
        else if (tv_name.getText().toString().trim().equals("Pays et  Capitales"))
        {
            Intent i  =  new Intent(view.getContext() , Level.class);
            i.putExtra("nameFile","Pays-Capitales.txt");

            context.startActivity(i);
        }
        else if (tv_name.getText().toString().trim().equals("Métiers"))
        {
            Intent i  =  new Intent(view.getContext() , Level.class);
            i.putExtra("nameFile","Metiers.txt");

            context.startActivity(i);
        }
        else if (tv_name.getText().toString().trim().equals("Maison"))
        {
            Intent i  =  new Intent(view.getContext() , Level.class);
            i.putExtra("nameFile","Maison.txt");

           context.startActivity(i);
        }
        else if (tv_name.getText().toString().equals("Animaux"))
        {
            Intent i  =  new Intent(view.getContext() , Level.class);
            i.putExtra("nameFile","Animaux.txt");

            context.startActivity(i);

        }


    }


}
