package br.com.dio.apprepositories.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import br.com.dio.apprepositories.R
import br.com.dio.apprepositories.databinding.ActivityStartScreenBinding

class StartScreenActivity : AppCompatActivity() {

    private val binding by lazy {  ActivityStartScreenBinding.inflate(layoutInflater)  }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start_screen)

        Handler().postDelayed({
                startActivity(Intent(this, MainActivity::class.java))
                finish()
        }, 3000)

    }
}