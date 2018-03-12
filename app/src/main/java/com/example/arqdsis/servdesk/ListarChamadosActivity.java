package com.example.arqdsis.servdesk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import java.util.List;

public class ListarChamadosActivity extends AppCompatActivity {

    public static final String DESCRICAO = "br.usjt.servicedesk.descricao";

    private List<String> lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_chamados);
        Intent origemIntent = getIntent();
        String chave = origemIntent.getStringExtra(MainActivity.NOME);
        //lista = buscaChamados(chave);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, lista);

    }
}
