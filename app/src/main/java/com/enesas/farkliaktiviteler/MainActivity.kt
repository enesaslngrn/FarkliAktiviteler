package com.enesas.farkliaktiviteler

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.enesas.farkliaktiviteler.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        println("onCreate çağırıldı.")
    }

    override fun onStart() {
        super.onStart()
        println("onStart çağırıldı.")
    }

    override fun onResume() {
        super.onResume()
        println("onResume çağırıldı.")
    }

    override fun onPause() {
        super.onPause()
        println("onPause çağırıldı.")
    }

    override fun onStop() {
        super.onStop()
        println("onStop çağırıldı.")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("onDestroy çağırıldı.")
    }

    fun aktiviteDegistir(view:View) {
        val kullaniciVerisi = binding.editText.text.toString()
        val intent = Intent(applicationContext, IkinciActivity:: class.java) // bu sayede diğer aktiviteye gidebiliyoruz.
        intent.putExtra("yollananVeri", kullaniciVerisi)
        startActivity(intent)

        finish() // bu sayede ikinci aktiviteye geçtiğimizde main aktivite tamamen kapatılacak. Yani onDestroy fonksiyonu çağırılacak.
                // mesela login ekranından diğer ekrana geçerken, login ekranın artık kullanılmaması gibi.
    }
}