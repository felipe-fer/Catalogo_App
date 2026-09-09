package br.gov.sp.catalogo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private ImageView ivMainCar;
    private TextView tvSelectedCarName;
    private LinearLayout llVirtus, llCorolla, llJetta;
    private Button btnDetails, btnClear;

    private int selectedCar = 0; // 0: None, 1: Virtus, 2: Corolla, 3: Jetta

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize UI components
        ivMainCar = findViewById(R.id.ivMainCar);
        tvSelectedCarName = findViewById(R.id.tvSelectedCarName);
        llVirtus = findViewById(R.id.llVirtus);
        llCorolla = findViewById(R.id.llCorolla);
        llJetta = findViewById(R.id.llJetta);
        btnDetails = findViewById(R.id.btnDetails);
        btnClear = findViewById(R.id.btnClear);

        // Selection listeners
        llVirtus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectCar(1);
            }
        });

        llCorolla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectCar(2);
            }
        });

        llJetta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectCar(3);
            }
        });

        // Details button listener
        btnDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDetails();
            }
        });

        // Clear button listener
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearSelection();
            }
        });
    }

    private void selectCar(int carCode) {
        selectedCar = carCode;
        
        // Reset backgrounds
        llVirtus.setBackgroundColor(android.graphics.Color.TRANSPARENT);
        llCorolla.setBackgroundColor(android.graphics.Color.TRANSPARENT);
        llJetta.setBackgroundColor(android.graphics.Color.TRANSPARENT);
        
        switch (carCode) {
            case 1:
                ivMainCar.setImageResource(R.drawable.virtus);
                tvSelectedCarName.setText(getString(R.string.virtus_name));
                llVirtus.setBackgroundColor(android.graphics.Color.LTGRAY);
                break;
            case 2:
                ivMainCar.setImageResource(R.drawable.corolla);
                tvSelectedCarName.setText(getString(R.string.corolla_name));
                llCorolla.setBackgroundColor(android.graphics.Color.LTGRAY);
                break;
            case 3:
                ivMainCar.setImageResource(R.drawable.jetta);
                tvSelectedCarName.setText(getString(R.string.jetta_name));
                llJetta.setBackgroundColor(android.graphics.Color.LTGRAY);
                break;
        }
    }

    private void clearSelection() {
        selectedCar = 0;
        ivMainCar.setImageResource(R.drawable.imagem_padrao);
        tvSelectedCarName.setText(getString(R.string.no_car_selected));
        
        llVirtus.setBackgroundColor(android.graphics.Color.TRANSPARENT);
        llCorolla.setBackgroundColor(android.graphics.Color.TRANSPARENT);
        llJetta.setBackgroundColor(android.graphics.Color.TRANSPARENT);
    }

    private void showDetails() {
        Intent intent;
        switch (selectedCar) {
            case 1:
                intent = new Intent(MainActivity.this, VirtusActivity.class);
                intent.putExtra("nome_carro", getString(R.string.virtus_name));
                intent.putExtra("id_carro", 1);
                startActivity(intent);
                break;
            case 2:
                intent = new Intent(MainActivity.this, CorollaActivity.class);
                intent.putExtra("nome_carro", getString(R.string.corolla_name));
                intent.putExtra("id_carro", 2);
                startActivity(intent);
                break;
            case 3:
                intent = new Intent(MainActivity.this, JettaGliActivity.class);
                intent.putExtra("nome_carro", getString(R.string.jetta_name));
                intent.putExtra("id_carro", 3);
                startActivity(intent);
                break;
            default:
                Toast.makeText(this, "Selecione um carro primeiro.", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}