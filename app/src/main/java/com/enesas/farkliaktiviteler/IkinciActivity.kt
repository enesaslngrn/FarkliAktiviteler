package com.enesas.farkliaktiviteler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.enesas.farkliaktiviteler.databinding.ActivityIkinciBinding
import android.content.Intent as Intent


class IkinciActivity : AppCompatActivity() {
    private lateinit var binding: ActivityIkinciBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIkinciBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val intent = intent
        val alinanVeri = intent.getStringExtra("yollananVeri")
        binding.textView2.text = alinanVeri
    }

    fun geriDon(view: View){
        // Bu fonksiyon ikinci aktiviteden main aktiviteye döndüğümüzde onCreate çalıştırmasını sağlayacak.
        val intent = Intent(applicationContext, MainActivity::class.java)
        startActivity(intent)
        
    }
}