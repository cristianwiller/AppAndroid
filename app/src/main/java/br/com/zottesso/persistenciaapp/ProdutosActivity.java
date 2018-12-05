package br.com.zottesso.persistenciaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class ProdutosActivity extends AppCompatActivity {

    private ListView lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produtos);

        lista = (ListView) findViewById(R.id.listaProduto);

        // Buscar todos os produtos do banco
        List<Produto> produtos = Produto.listAll(Produto.class);

        ArrayAdapter<Produto> arrayAdapter = new ArrayAdapter<Produto>(this, android.R.layout.simple_list_item_1, produtos);
        lista.setAdapter(arrayAdapter);






    }
}
