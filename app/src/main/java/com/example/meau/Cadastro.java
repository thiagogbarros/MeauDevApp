package com.example.meau;

import android.os.Build;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.L;


public class Cadastro extends AppCompatActivity {
    private EditText Nome, Idade, Email, Estado, Cidade, Endereco, Telefone, Nome_Usuario, Senha, Confirmacao_Senha;
    private Button Fazer_Cadastro;
    private DatabaseReference reff;
    private Member member;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
        final EditText Nome=(EditText)findViewById(R.id.Nome);
        final EditText Idade=(EditText)findViewById(R.id.Idade);
        final EditText Email=(EditText)findViewById(R.id.Email);
        final EditText Estado=(EditText)findViewById(R.id.Estado);
        final EditText Cidade=(EditText)findViewById(R.id.Cidade);
        final EditText Endereco=(EditText)findViewById(R.id.Endereco);
        final EditText Telefone=(EditText)findViewById(R.id.Telefone);
        final EditText Nome_Usuario=(EditText)findViewById(R.id.Nome_Usuario);
        final EditText Senha=(EditText)findViewById(R.id.Senha);
        final EditText Confirmacao_Senha=(EditText)findViewById(R.id.Confirmacao_Senha);
        final Button Fazer_Cadastro =(Button)findViewById(R.id.FazerCadastro);
        //Data base
        reff = FirebaseDatabase.getInstance().getReference().child("Member");
        member = new Member();
        Fazer_Cadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int age=Integer.parseInt(Idade.getText().toString().trim());
                member.setNome(Nome.getText().toString().trim());
                member.setIdade(age);
                member.setEmail(Email.getText().toString().trim());
                member.setEstado(Estado.getText().toString().trim());
                member.setCidade(Cidade.getText().toString().trim());
                member.setEndereco(Endereco.getText().toString().trim());
                member.setTelefone(Telefone.getText().toString().trim());
                member.setNome_Usuario(Nome_Usuario.getText().toString().trim());
                member.setSenha(Senha.getText().toString().trim());
                member.setConfirmacao_Senha(Confirmacao_Senha.getText().toString().trim());
                reff.push().setValue(member);
                //Toast.makeText(datainsert.this, text="Dados inseridos com sucesso", Toast:L);
            }
        });
    }


}
