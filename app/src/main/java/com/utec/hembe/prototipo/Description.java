package com.utec.hembe.prototipo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.TextView;

public class Description extends AppCompatActivity {
    private TextView tvTitulo;
    private TextView tvDirector;
    private TextView tvGenero;
    private TextView tvDuracion;
    private TextView tvFecha;
    private ItemList itemDetail;

    private TextView txtRating;
    private RatingBar ratingBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);
        setTitle(getClass().getSimpleName());
        initView();
        initValues();

        txtRating = findViewById(R.id.adTvQualification);
        ratingBar = findViewById(R.id.ratingBar);

        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                txtRating.setText("Calificación: "+rating);
            }
        });
    }

    private void initView(){
        //Enlazamos los id del xml
        tvTitulo = findViewById(R.id.adTvTitulo);
        tvDirector = findViewById(R.id.adTvDirector);
        tvGenero = findViewById(R.id.adTvGenero);
        tvDuracion = findViewById(R.id.adTvDuracion);
        tvFecha = findViewById(R.id.adTvFecha);

    }
    private void initValues(){
        itemDetail = (ItemList) getIntent().getExtras().getSerializable("itemDetail");
        //Seteamos los valores que esta trayendo el objeto
        tvTitulo.setText(itemDetail.getTitulo());
        tvDirector.setText(itemDetail.getDirector());
        tvGenero.setText(itemDetail.getGenero());
        tvDuracion.setText(itemDetail.getDuracion());
        tvFecha.setText(itemDetail.getFecha());
    }
}
