package com.nicer.attiary.view

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.nicer.attiary.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

	private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(binding.root)

		binding.btnSay.setOnClickListener {
			binding.textSay.text = "Hello, Kotlin!"
		}

		val intent = Intent(this, SignUpActivity::class.java)
		binding.btnStart.setOnClickListener {
			startActivity(intent)
		}

		val intent_signin = Intent(this, SignInActivity::class.java)
		binding.btnGotoSignin.setOnClickListener {
			startActivity(intent_signin)
		}
	}
}