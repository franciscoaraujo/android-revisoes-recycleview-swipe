package br.com.nextapp;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MyViewHolder extends RecyclerView.ViewHolder {

    private TextView name;
    private TextView description;
    private TextView price;
    private ImageView thumbnail;
    private RelativeLayout viewBackground;
    private RelativeLayout viewForeground;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);

        name = itemView.findViewById(R.id.name);
        description = itemView.findViewById(R.id.description);

        price = itemView.findViewById(R.id.price);
        thumbnail = itemView.findViewById(R.id.thumbnail);

        viewBackground = itemView.findViewById(R.id.view_background);
        viewForeground = itemView.findViewById(R.id.view_foreground);
    }


}
