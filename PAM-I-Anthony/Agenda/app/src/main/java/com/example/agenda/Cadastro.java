package com.example.agenda;
import com.example.agenda.Pessoa;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Service;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Cadastro extends AppCompatActivity {

    EditText cCodigo;
    EditText cNome;
    EditText cTelefone;
    EditText cEmail;
    EditText cEndereco;
    Button btSalvar;
    Button btExcluir;
    Button btLimpar;
    ListView viewPessoa;


    ArrayAdapter<String> adapter;
    ArrayList<String> arrayList;

    InputMethodManager imm;

    BancoDados db = new BancoDados(this);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        imm = (InputMethodManager) this.getSystemService(Service.INPUT_METHOD_SERVICE);

        cCodigo = findViewById(R.id.txtCodigo);
        cNome = findViewById(R.id.edt_nome);
        cTelefone = findViewById(R.id.edt_celular);
        cEmail = findViewById(R.id.edt_email);
        cEndereco = findViewById(R.id.edt_endereco);
        btSalvar = findViewById(R.id.btnSalvar);
        btExcluir = findViewById(R.id.btnExcluir);
        btLimpar = findViewById(R.id.btnLimpar);
        viewPessoa = findViewById(R.id.listViewPessoa);

        cNome.requestFocus();

        viewPessoa.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                String conteudo = (String)viewPessoa.getItemAtPosition(position);
                String codigo = conteudo.substring(0,conteudo.indexOf("-"));
                Pessoa pessoa = db.selecionarPessoa(Integer.parseInt(codigo));
                cCodigo.setText(String.valueOf(pessoa.getCodigo()));
                cNome.setText(String.valueOf(pessoa.getNome()));
                cTelefone.setText(String.valueOf(pessoa.getCelular()));
                cEmail.setText(String.valueOf(pessoa.getEmail()));
                cEndereco.setText(String.valueOf(pessoa.getEndereco()));
            }
        });

        btLimpar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                limpaCampos();
            }
        });

        btSalvar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String codigo = cCodigo.getText().toString();
                String nome = cNome.getText().toString();
                String telefone = cTelefone.getText().toString();
                String email = cEmail.getText().toString();
                String endereco = cEndereco.getText().toString();

                if(nome.isEmpty()){
                    cNome.setError("Este campo é obrigatório!");
                }else if(codigo.isEmpty()){
                    db.addPessoa(new Pessoa(nome, telefone, email, endereco));
                    Toast.makeText(Cadastro.this,
                        "Cadastro salvo com sucesso", Toast.LENGTH_SHORT).show();
                    listarPessoas();
                    limpaCampos();
                    escondeTeclado();
                }else{
                    db.atualizarPessoa(new Pessoa(Integer.parseInt(codigo),
                            nome, telefone, email, endereco));
                    Toast.makeText(Cadastro.this,
                        "Cadastro atualizado com sucesso", Toast.LENGTH_SHORT).show();
                    listarPessoas();
                    limpaCampos();
                    escondeTeclado();
                }
            }
        });

        btExcluir.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String codigo = cCodigo.getText().toString();
                if(codigo.isEmpty()){
                    Toast.makeText(Cadastro.this,
                        "Nenhuma pessoa Registrada", Toast.LENGTH_SHORT).show();
                }else{
                    Pessoa pessoa = new Pessoa();
                    pessoa.setCodigo(Integer.parseInt(codigo));
                    db.apagarPessoa(pessoa);
                    Toast.makeText(Cadastro.this,
                        "Registro da pessoa apagado com sucesso", Toast.LENGTH_SHORT).show();
                    cCodigo.setText("");
                    listarPessoas();
                    limpaCampos();
                }
            }
        });
    }

    void escondeTeclado(){
        imm.hideSoftInputFromWindow(cNome.getWindowToken(),0);
    }

    public void limpaCampos(){
        cCodigo.setText("");
        cNome.setText("");
        cTelefone.setText("");
        cEmail.setText("");
        cEndereco.setText("");

        cNome.requestFocus();
    }

    public void listarPessoas(){
        List<Pessoa> pessoas = db.listaPessoa();
        arrayList = new ArrayList<String>();
        adapter = new ArrayAdapter<String>(
            Cadastro.this,android.R.layout.simple_list_item_1, arrayList);
        viewPessoa.setAdapter(adapter);
        for(Pessoa c : pessoas){
            //Log.d( "Lista", "\nID: " + c.getCodigo() + "Nome: " +
            // c.getNome(  ));            //arrayList. add( c.getCodigo()
            // + "-" + c.getCodigo());
            arrayList.add(c.getCodigo() + "-" + c.getNome());
            adapter.notifyDataSetChanged();

        }
    }
}