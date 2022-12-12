package ru.stas.statechange

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import ru.stas.statechange.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    private val TAG = "StateChange"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Log.i(TAG,"OnCreate")


    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG,"OnStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG,"OnResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG,"OnPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG,"onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG,"onDestroy")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.i(TAG,"onSaveInstanceState")
        val userText = binding.editText.text
        outState.putCharSequence("savedText",userText)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.i(TAG,"onRestoreInstanceState")
        val userText = savedInstanceState.getCharSequence("savedText")
        binding.editText.setText(userText)
    }
}