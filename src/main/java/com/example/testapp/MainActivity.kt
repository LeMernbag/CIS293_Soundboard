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
    }

    fun playSound(view: View) {
        when(view.id) {
            R.id.button1 -> {Toast.makeText(this@MainActivity, "Wilhelm Scream", Toast.LENGTH_SHORT).show()
                                var mediaPlayer: MediaPlayer? = MediaPlayer.create(applicationContext, R.raw.wilhelm)
                                mediaPlayer?.start()}
            R.id.button2 -> {Toast.makeText(this@MainActivity, "Air Horn", Toast.LENGTH_SHORT).show()
                                var mediaPlayer: MediaPlayer? = MediaPlayer.create(applicationContext, R.raw.airhorn)
                                mediaPlayer?.start()}
            R.id.button3 -> {Toast.makeText(this@MainActivity, "Cabal", Toast.LENGTH_SHORT).show()
                                var mediaPlayer: MediaPlayer? = MediaPlayer.create(applicationContext, R.raw.cabal)
                                mediaPlayer?.start()}
            R.id.button4 -> {Toast.makeText(this@MainActivity, "High Noon", Toast.LENGTH_SHORT).show()
                                var mediaPlayer: MediaPlayer? = MediaPlayer.create(applicationContext, R.raw.highnoon)
                                mediaPlayer?.start()}
            R.id.button5 -> {Toast.makeText(this@MainActivity, "Game Over", Toast.LENGTH_SHORT).show()
                                var mediaPlayer: MediaPlayer? = MediaPlayer.create(applicationContext, R.raw.gameover)
                                mediaPlayer?.start()}
            R.id.button6 -> {Toast.makeText(this@MainActivity, "Hive", Toast.LENGTH_SHORT).show()
                                var mediaPlayer: MediaPlayer? = MediaPlayer.create(applicationContext, R.raw.hive)
                                mediaPlayer?.start()}
            R.id.button7 -> {Toast.makeText(this@MainActivity, "Mom", Toast.LENGTH_SHORT).show()
                                var mediaPlayer: MediaPlayer? = MediaPlayer.create(applicationContext, R.raw.psycho1)
                                mediaPlayer?.start()}
            R.id.button8 -> {Toast.makeText(this@MainActivity, "Zenyatta", Toast.LENGTH_SHORT).show()
                                var mediaPlayer: MediaPlayer? = MediaPlayer.create(applicationContext, R.raw.zenyatta)
                                mediaPlayer?.start()}
        }
    }
}
