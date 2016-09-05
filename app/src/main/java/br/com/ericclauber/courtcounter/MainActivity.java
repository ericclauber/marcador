package br.com.ericclauber.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int pontuacaoA = 0;
    int pontuacaoB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //super.onSaveInstanceState(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void btn3PontosEquipeA(View view) {
        pontuacaoA += 3;
        calcularPontosEquipeA(pontuacaoA);
    }

    public void btn2PontosEquipeA(View view) {

        pontuacaoA += 2;
        calcularPontosEquipeA(pontuacaoA);
    }

    public void btnLanceLivreEquipeA(View view) {
        pontuacaoA += 1;
        calcularPontosEquipeA(pontuacaoA);
    }

    //
    public void btn3PontosEquipeB(View view) {
        pontuacaoB += 3;
        calcularPontosEquipeB(pontuacaoB);
    }

    public void btn2PontosEquipeB(View view) {
        pontuacaoB += 2;
        calcularPontosEquipeB(pontuacaoB);
    }

    public void btnLanceLivreEquipeB(View view) {
        pontuacaoB += 1;
        calcularPontosEquipeB(pontuacaoB);
    }

    //
    public void btnReset(View view) {
        pontuacaoA = 0;
        pontuacaoB = 0;
        calcularPontosEquipeA(pontuacaoA);
        calcularPontosEquipeB(pontuacaoB);
    }

    public void calcularPontosEquipeA(int pontos) {
        TextView textView = (TextView) findViewById(R.id.points_Equipe_A_text_view);
        textView.setText(String.valueOf(pontos));
    }

    public void calcularPontosEquipeB(int pontos) {
        TextView textView = (TextView) findViewById(R.id.points_Equipe_B_text_view);
        textView.setText(String.valueOf(pontos));
    }

}
