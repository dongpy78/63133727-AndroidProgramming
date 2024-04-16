package com.buivandong.registrationformapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import kotlinx.android.synthetic.main.activity_main.button_create_account
import kotlinx.android.synthetic.main.activity_main.edit_text_email
import kotlinx.android.synthetic.main.activity_main.edit_text_first_name
import kotlinx.android.synthetic.main.activity_main.edit_text_last_name
import kotlinx.android.synthetic.main.activity_main.edit_text_password
import kotlinx.android.synthetic.main.activity_main.edit_text_phone
import kotlinx.android.synthetic.main.activity_main.spinner_title

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupSpinner()
        setupButton()
    }

    private fun setupButton() {
        val titles = arrayOf("Miss", "Mrs", "Ms", "Mr", "Mx", "Dr", "Prof")
        val titleAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, titles)
        spinner_title.adapter = titleAdapter
    }

    private fun setupSpinner() {
        button_create_account.setOnClickListener {
            createAccount()
        }
    }

    private fun createAccount() {
        val user = User(
            spinner_title.selectedItem as String,
            edit_text_first_name.text.toString(),
            edit_text_last_name.text.toString(),
            edit_text_email.text.toString(),
            edit_text_phone.text.toString(),
            edit_text_password.text.toString(),
        )

        val intent = Intent(this, SummaryActivity::class.java)
        intent.putExtra("User", user)
        startActivity(intent)
    }
}