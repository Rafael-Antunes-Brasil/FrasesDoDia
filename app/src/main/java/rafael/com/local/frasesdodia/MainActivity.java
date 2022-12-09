package rafael.com.local.frasesdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void trocarFrase(View view) {
        TextView texto = findViewById(R.id.mensagem);

        String[] frases = {
                "Um pequeno pensamento positivo pela manhã pode mudar todo o seu dia.",
                "Seus sonhos não precisam de plateia, eles só precisam de você.",
                "Seus sonhos não precisam de plateia, eles só precisam de você.",
                "Nem todas as tempestades vêm para atrapalhar a sua vida. Algumas vêm para limpar" +
                        " seu caminho."
        };

        int x = new Random().nextInt(4);

        texto.setText(frases[x]);
    }

}