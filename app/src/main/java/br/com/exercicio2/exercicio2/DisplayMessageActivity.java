package br.com.exercicio2.exercicio2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        Intent intent = getIntent();// getintent() pega o Intent que chamou a Activity no o do MainActivity
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);//recupera os dados passados pela primeira Activity
        TextView textView = new TextView(this);// Criação por meio de código um TextView
        textView.setTextSize(40);// Configurando o tamanho do TextView
        textView.setText(message);// Passando o texto ao TextView

        ViewGroup layout = (ViewGroup) findViewById(R.id.activity_display_message);// Localizando Layout
        layout.addView(textView);// o TextView Foi adicionado ao Layout identificado por "R.id.activity_display_message"

    }
}
