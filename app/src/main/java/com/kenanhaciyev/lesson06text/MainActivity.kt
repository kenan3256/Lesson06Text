package com.kenanhaciyev.lesson06text


import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.kenanhaciyev.lesson06text.DB.AppDatabase

import com.kenanhaciyev.lesson06text.databinding.ActivityMainBinding
import com.kenanhaciyev.lesson06text.entity.Prodact
import com.kenanhaciyev.repository.ProdactRepository
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

            var context = this
            val db=AppDatabase.getDatabase(context)

        val repository = ProdactRepository(db.prodactDao())



        binding.btnInsert.setOnClickListener{
            var etCode = binding.etcode.text.toString()
            var etName = binding.etname.text.toString()
            var etdesc = binding.etdesc.text.toString()

            if (etCode.isNotEmpty() && etName.isNotEmpty() && etdesc.isNotEmpty()){
                var produkt = Prodact(prodactName = etName, prodactCode = etCode.toInt(), prodactDescriptio = etdesc)

                  runBlocking {
                      launch{
                          repository.insert(produkt)
                      }
                  }


            }else{
                Toast.makeText(applicationContext, "bos yerleri doldur", Toast.LENGTH_LONG).show()
            }
        }

    }
}