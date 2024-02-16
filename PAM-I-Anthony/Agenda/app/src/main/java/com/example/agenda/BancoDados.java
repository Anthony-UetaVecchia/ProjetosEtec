package com.example.agenda;

import com.example.agenda.Pessoa;

import android.content.*;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

public class BancoDados extends SQLiteOpenHelper {
    public static final int VERSAO_BANCO = 1;
    public static final String BANCO_AGENDA = "BD_agenda";

    public BancoDados(Context content) {
        super(content, BANCO_AGENDA, null, VERSAO_BANCO);
    }

    public static final String TABELA_PESSOA = "tb_pessoa";

    public static final String COLUNA_CODIGO = "codigo";
    public static final String COLUNA_NOME = "nome";
    public static final String COLUNA_CELULAR = "celular";
    public static final String COLUNA_EMAIL = "email";
    public static final String COLUNA_ENDERECO = "endereco";


    @Override
    public void onCreate(SQLiteDatabase DB) {
        String CRIAR_TABELA = "CREATE TABLE " + TABELA_PESSOA + "(" +
                COLUNA_CODIGO + " INTEGER PRIMARY KEY, " +
                COLUNA_NOME + " TEXT, " + COLUNA_EMAIL + " TEXT, " +
                COLUNA_CELULAR + " TEXT, " + COLUNA_ENDERECO + " TEXT" +
                ")";

        DB.execSQL(CRIAR_TABELA);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    void addPessoa(Pessoa pessoa) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues valor = new ContentValues();
        valor.put(COLUNA_NOME, pessoa.getNome());
        valor.put(COLUNA_EMAIL, pessoa.getEmail());
        valor.put(COLUNA_CELULAR, pessoa.getCelular());
        valor.put(COLUNA_ENDERECO, pessoa.getEndereco());

        db.insert(TABELA_PESSOA, null, valor);
        db.close();
    }

    void apagarPessoa(Pessoa pessoa) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(TABELA_PESSOA, COLUNA_CODIGO + " =?", new String[]{
                String.valueOf(pessoa.getCodigo())
        });

        db.close();
    }

    Pessoa selecionarPessoa(int codigo) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.query(TABELA_PESSOA, new String[]{COLUNA_CODIGO, COLUNA_NOME, COLUNA_CELULAR, COLUNA_EMAIL, COLUNA_ENDERECO},
                COLUNA_CODIGO + " = ?", new String[]{String.valueOf(codigo)}, null, null, null, null);

        if (cursor != null) {
            cursor.moveToFirst();
        }

        Pessoa pessoa = new Pessoa(Integer.parseInt(cursor.getString(0)),
                cursor.getString(1), cursor.getString(2),
                cursor.getString(3), cursor.getString(4));



        return pessoa;
    }


    void atualizarPessoa(Pessoa pessoa){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues valor = new ContentValues();

        valor.put(COLUNA_NOME, pessoa.getNome());
        valor.put(COLUNA_EMAIL, pessoa.getEmail());
        valor.put(COLUNA_CELULAR, pessoa.getCelular());
        valor.put(COLUNA_ENDERECO, pessoa.getEndereco());

        db.update(TABELA_PESSOA, valor, COLUNA_CODIGO + " =?", new String[]{String.valueOf(pessoa.getCodigo())});
        db.close();
    }

    public List<Pessoa> listaPessoa(){
        List<Pessoa> pessoaLista = new ArrayList<Pessoa>();
        String query = "SELECT * FROM " + BANCO_AGENDA;
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(query, null);

        if(cursor.moveToFirst()){
            do{
                Pessoa pessoa = new Pessoa();
                pessoa.setCodigo(Integer.parseInt(cursor.getString(0)!=null?cursor.getString(0):"0"));
                pessoa.setNome(cursor.getString(1));
                pessoa.setCelular(cursor.getString(2));
                pessoa.setEmail(cursor.getString(3));
                pessoa.setEndereco(cursor.getString(4));

                pessoaLista.add(pessoa);
            }while (cursor.moveToNext());
        }

        return pessoaLista;
    }

}