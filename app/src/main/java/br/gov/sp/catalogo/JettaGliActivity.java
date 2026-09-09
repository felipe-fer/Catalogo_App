package br.gov.sp.catalogo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class JettaGliActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jetta_gli);

        // Recuperando dados da Intent
        String nomeCarro = getIntent().getStringExtra("nome_carro");
        
        if (nomeCarro != null) {
            setTitle(nomeCarro);
        }

        Button btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}