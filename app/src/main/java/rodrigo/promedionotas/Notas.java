package rodrigo.promedionotas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Notas extends AppCompatActivity {
    EditText nota1, nota2, nota3, nota4;
    double  a=4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notas);
        nota1 = (EditText) findViewById(R.id.nota1);
        nota2 = (EditText) findViewById(R.id.nota2);
        nota3 = (EditText) findViewById(R.id.nota3);
        nota4 = (EditText) findViewById(R.id.nota4);
        Button sumar  = (Button) findViewById(R.id.CalcularSuma);
        final TextView Resultado = (TextView) findViewById(R.id.resultado);
        final Button promedio  = (Button) findViewById(R.id.promedio);
        final TextView Promedio  = (TextView) findViewById(R.id.promedio);
        sumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int aux1 = Integer.valueOf(nota1.getText().toString());
                int aux2 = Integer.valueOf(nota2.getText().toString());
                int aux3 = Integer.valueOf(nota3.getText().toString());
                int aux4 = Integer.valueOf(nota4.getText().toString());
                int resultado = aux1 + aux2 + aux3 + aux4;
                Resultado.setText("" + resultado);
                double total = resultado / a;
                Promedio.setText("" + total);
                if (total >= 3.0 ) {
                    System.out.println(" A P R O B A D O ");
                } else {
                    System.out.println("R E P R O B A D O ");
                }
               }
                });
    }

}
