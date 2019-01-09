package e.wolfsoft1.uiuxlabecommerce_jp_shop40.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;

import java.util.ArrayList;

import e.wolfsoft1.uiuxlabecommerce_jp_shop40.R;
import e.wolfsoft1.uiuxlabecommerce_jp_shop40.model.Color_Model_40;

public class ColorAdapter_40 extends RecyclerView.Adapter<ColorAdapter_40.MyColorHolder> {

    private final Context context;
    private final ArrayList<Color_Model_40> color_modelArrayList;
    private int position;

    public ColorAdapter_40(Context context, ArrayList<Color_Model_40> color_modelArrayList) {
        this.context = context;
        this.color_modelArrayList = color_modelArrayList;
    }

    @NonNull
    @Override
    public MyColorHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(context).inflate(R.layout.item_color_40, viewGroup, false);
        return new MyColorHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull final MyColorHolder myColorHolder, final int i) {

        myColorHolder.color_image.setImageResource(color_modelArrayList.get(i).getColor());

        myColorHolder.framlayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                position = i;
                notifyDataSetChanged();
            }
        });

        if (position == i) {
            myColorHolder.selection.setVisibility(View.VISIBLE);
        } else {
            myColorHolder.selection.setVisibility(View.GONE);
        }
    }

    @Override
    public int getItemCount() {
        return color_modelArrayList.size();
    }

    class MyColorHolder extends RecyclerView.ViewHolder {
        ImageView color_image;
        FrameLayout framlayout;
        ImageView selection;

        public MyColorHolder(@NonNull View itemView) {
            super(itemView);
            color_image = itemView.findViewById(R.id.color_image);
            framlayout = itemView.findViewById(R.id.framlayout);
            selection = itemView.findViewById(R.id.selection);
        }
    }
}
