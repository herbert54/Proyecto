package com.utec.hembe.prototipo;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerHolder> {
    private List<ItemList> items;

    // Este es nuestro constructor
    public RecyclerAdapter(List<ItemList> items){
        this.items = items;
    }

    @NonNull
    @Override
    public RecyclerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Creamos una nueva vista
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_list_view,parent,false);
        return new RecyclerHolder(view);
    }
    // Este método asigna valores para cada elemento de la lista
    @Override
    public void onBindViewHolder(@NonNull RecyclerHolder holder, int position) {
        // - obtenemos un elemento del dataset según su posición
        // - reemplazamos el contenido usando tales datos
        ItemList item = items.get(position);
        holder.imgItem.setImageResource(item.getImgResource());
        holder.tvTitulo.setText(item.getTitulo());
        holder.tvGenero.setText(item.getGenero());
        holder.tvPrecio.setText(item.getPrecio());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(holder.itemView.getContext(),Description.class);
                intent.putExtra("itemDetail",item);
                holder.itemView.getContext().startActivity(intent);
            }
        });

    }
    // Método que define la cantidad de elementos del RecyclerView
    @Override
    public int getItemCount() {
        return items.size();
    }

    public static class RecyclerHolder extends RecyclerView.ViewHolder{
        private ImageView imgItem;
        private TextView tvTitulo;
        private TextView tvGenero;
        private TextView tvPrecio;

        public RecyclerHolder(@NonNull View itemView){
            super(itemView);
            imgItem = itemView.findViewById(R.id.imgItem);
            tvTitulo = itemView.findViewById(R.id.tvTitulo);
            tvGenero = itemView.findViewById(R.id.tvGenero);
            tvPrecio = itemView.findViewById(R.id.tvPrecio);
        }
    }
}
