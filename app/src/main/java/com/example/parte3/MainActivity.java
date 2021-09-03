
package com.example.parte3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText nomb, gen, eda, dirc;
    Button cancel, regist;
    CheckBox checkB;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nomb = (EditText) findViewById(R.id.edTxtNombre);
        gen = (EditText) findViewById(R.id.edTxtGenero);
        eda = (EditText) findViewById(R.id.edTxtEdad);
        dirc = (EditText) findViewById(R.id.edTxtDireccion);
        cancel = (Button) findViewById(R.id.btnCancelar);
        regist = (Button) findViewById(R.id.bntRegistrar);
        checkB = (CheckBox) findViewById(R.id.checkBox);
        resultado = (TextView) findViewById(R.id.txtResult);

    }

    public void Cancelar(View view) {
        nomb.setText("");
        gen.setText("");
        eda.setText("");
        dirc.setText("");
        checkB.setChecked(false);
    }

    public void Registrar(View view) {
        int edad;

        if(!nomb.getText().toString().isEmpty() && !eda.getText().toString().isEmpty()) {
            if (checkB.isChecked()) {
                edad = Integer.parseInt(eda.getText().toString());
                if (edad >= 18) {
                    resultado.setText("BIENVENIDO " + nomb.getText().toString());
                } else {
                    resultado.setText(nomb.getText().toString() + " Usted no es mayor de edad");
                }
            } else {
                Toast toast = Toast.makeText(this, "Por Favor marcar Terminos y Condiciones", Toast.LENGTH_SHORT);
                toast.show();
            }
        }else{
            Toast toast = Toast.makeText(this, "Por Favor Rellenar los campos vacios", Toast.LENGTH_SHORT);
            toast.show();
        }
    }
}