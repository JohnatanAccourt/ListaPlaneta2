package com.example.listaplaneta;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class ListarDadosPlanetasActivity extends AppCompatActivity {

    TextView lstPlanetas;
    ImageView imgPlanetas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listar_dados_planetas_layout);

        lstPlanetas = (TextView) findViewById(R.id.lstDPlanetas);
        imgPlanetas = (ImageView) findViewById(R.id.lstIMGPlanetas);

        Intent intent = getIntent();
        String nomeRetorno = intent.getStringExtra("name");
        int imageRetorno = intent.getIntExtra("image", 0);

        lstPlanetas.setText(nomeRetorno);
        imgPlanetas.setImageResource(imageRetorno);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
