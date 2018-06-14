package android.usuario.peso_ideal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivityPeso extends AppCompatActivity {

    RadioButton rbF, rbM;
    EditText etAlt;
    TextView rtResult;
    Button btVerificar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_peso);
        rbM = (RadioButton)findViewById(R.id.rbM);
        rbF = (RadioButton)findViewById(R.id.rbF);
        btVerificar = (Button) findViewById(R.id.btVerificar);
        etAlt = (EditText) findViewById(R.id.etAlt);
        rtResult = (TextView) findViewById(R.id.rtResult);

        rbM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(), "Voce selecionou o Masculino" ,Toast.LENGTH_SHORT).show();
            }
        });

        rbF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(), "Voce selecionou o Feminino" ,Toast.LENGTH_SHORT).show();
            }
        });

        btVerificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(rbM.isChecked()){
                    double Altura = Double.parseDouble(etAlt.getText().toString());
                    double AlturaFinal = 72.7 * Altura - 58;
                    rtResult.setText(""+AlturaFinal);
                }else if (rbF.isChecked()){
                    double Altura = Double.parseDouble(etAlt.getText().toString());
                    double AlturaFinal = 62.1 * Altura - 44.7;
                    rtResult.setText("" +AlturaFinal);
                }else {
                    Toast.makeText(getBaseContext(), "Selecione uma opção", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }


}
