package br.senai.sp.jandira.imcapp20

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class LoginActivity2 : AppCompatActivity() {

    lateinit var editUser: EditText
    lateinit var editPassword: EditText
    lateinit var btnLogin: Button
    lateinit var tvMensagemErro: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login2)

        editUser = findViewById(R.id.ed_user)
        editPassword = findViewById(R.id.ed_password)
        btnLogin = findViewById(R.id.btn_login)
        tvMensagemErro = findViewById(R.id.tv_mensagem_de_erro)

        btnLogin.setOnClickListener {
            login()
        }

    }

    private fun login() {

        var user = editUser.text.toString()
        var pass =  editPassword.text.toString()

        if (user == "user@gmail.com" && pass =="123"){
            // Armazenar os dados do usuario no sharedPreferences
            val preferences = getSharedPreferences("biometria", Context.MODE_PRIVATE)
        val intent = Intent( this, MainActivity::class.java)
         startActivity(intent)
            finish()
        } else {
            tvMensagemErro.text = "Usuário ou senha incorreto"
        }
    }


    }