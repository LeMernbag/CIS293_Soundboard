package com.example.testapp

import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.testapp.R.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.NonCancellable.start

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main)

        btn_click_me.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                Toast.makeText(this@MainActivity, "Air Horn", Toast.LENGTH_SHORT).show()
                var mediaPlayer: MediaPlayer? = MediaPlayer.create(applicationContext, R.raw.airhorn)
                mediaPlayer?.start()
            }
        })
        btnWilhelm.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                Toast.makeText(this@MainActivity, "Wilhelm Scream", Toast.LENGTH_SHORT).show()
                var mediaPlayer: MediaPlayer? = MediaPlayer.create(applicationContext, R.raw.wilhelm)
                mediaPlayer?.start()
            }
        })


    }
}