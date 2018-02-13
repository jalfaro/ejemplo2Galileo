package edu.galileo.fisicc.galileotest2;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by jalfaro on 2/12/18.
 */

public class SegundaActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnLlamar, btnMapa;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.segunda_layout);
        btnLlamar = findViewById(R.id.llamar);
        btnMapa = findViewById(R.id.mapa);

        btnLlamar.setOnClickListener(this);
        btnMapa.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = null;
        if (v.getId() == R.id.llamar) {
            intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:34567890"));

        } else if(v.getId() == R.id.mapa) {
            intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:14.6418237,-90.513083")) ;
        }
        startActivity(intent);
    }
}
