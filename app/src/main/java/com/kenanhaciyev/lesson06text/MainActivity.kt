package com.kenanhaciyev.lesson06text

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.kenanhaciyev.lesson06text.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    lateinit var viewModel: MyViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewModel=ViewModelProvider(this).get(MyViewModel::class.java)

        binding=ActivityMainBinding.inflate(layoutInflater)
        binding.lifecycleOwner = this
        setContentView(binding.root)
        binding.viewModel=viewModel
        binding.btnDaxilEt.setOnClickListener{


        }




    }
}