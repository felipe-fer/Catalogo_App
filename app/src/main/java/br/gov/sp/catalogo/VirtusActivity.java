package br.gov.sp.catalogo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class VirtusActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_virtus);

        // Recuperando dados da Intent
        String nomeCarro = getIntent().getStringExtra("nome_carro");
        
        // Poderíamos usar o nomeCarro para atualizar um TextView, 
        // mas o layout já possui o nome definido via XML.
        // Apenas para demonstrar a recepção:
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