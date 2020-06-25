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
import androidx.appcompat.widget.AppCompatButton
import androidx.navigation.fragment.findNavController
import com.example.testapp.R.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.NonCancellable.start

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main)
    }

    fun playSound(view: View) {
        var source = 0;
        val getTextBtn = findViewById<AppCompatButton>(view.id)

        when(view.id) {
            R.id.button1 -> {source = R.raw.airhorn}
            R.id.button2 -> {source = R.raw.wilhelm}
            R.id.button3 -> {source = R.raw.cabal}
            R.id.button4 -> {source = R.raw.highnoon}
            R.id.button5 -> {source = R.raw.gameover}
            R.id.button6 -> {source = R.raw.hive}
            R.id.button7 -> {source = R.raw.psycho1}
            R.id.button8 -> {source = R.raw.zenyatta}
        }

        Toast.makeText(this@MainActivity, getTextBtn.text, Toast.LENGTH_SHORT).show()
        var mediaPlayer: MediaPlayer? = MediaPlayer.create(applicationContext, source)
        mediaPlayer?.start()
    }
}
