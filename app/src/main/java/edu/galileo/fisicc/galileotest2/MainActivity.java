package edu.galileo.fisicc.galileotest2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText usuario, clave;
    private Button ingreso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);
        usuario = findViewById(R.id.txtLogin);
        clave = findViewById(R.id.txtPass);
        ingreso = findViewById(R.id.btnIngresar);
        ingreso.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.btnIngresar) {
            String strUSuario = usuario.getText().toString();
            String strPass = clave.getText().toString();
            if (strUSuario.equals("Julio") && strPass.equals("Alfaro")) {
                Intent intent = new Intent(this, SegundaActivity.class);
                startActivityForResult(intent, 67);
            } else {
                Toast.makeText(this, getResources().getString(R.string.str_login_error), Toast.LENGTH_LONG).show();
            }
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 67) {
            Toast.makeText(this, "Regreso de la Actividad SegundaActivity", Toast.LENGTH_LONG).show();
        }
    }
}
