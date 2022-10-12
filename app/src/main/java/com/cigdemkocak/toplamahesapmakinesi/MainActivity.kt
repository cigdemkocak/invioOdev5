package com.cigdemkocak.toplamahesapmakinesi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.cigdemkocak.toplamahesapmakinesi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var tasarim: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasarim = ActivityMainBinding.inflate(layoutInflater)
        setContentView(tasarim.root)

        var sonucMetni = ""
        var toplam = 0
        tasarim.button0.setOnClickListener{
            tasarim.sonuc.text = sonucMetni+"0"
            sonucMetni = sonucMetni+"0"
        }
        tasarim.button1.setOnClickListener{
            tasarim.sonuc.text = sonucMetni+"1"
            sonucMetni = sonucMetni+"1"
        }
        tasarim.button2.setOnClickListener{
            tasarim.sonuc.text = sonucMetni+"2"
            sonucMetni = sonucMetni+"2"
        }
        tasarim.button3.setOnClickListener{
            tasarim.sonuc.text = sonucMetni+"3"
            sonucMetni = sonucMetni+"3"
        }
        tasarim.button4.setOnClickListener{
            tasarim.sonuc.text = sonucMetni+"4"
            sonucMetni = sonucMetni+"4"
        }
        tasarim.button5.setOnClickListener{
            tasarim.sonuc.text = sonucMetni+"5"
            sonucMetni = sonucMetni+"5"
        }
        tasarim.button6.setOnClickListener{
            tasarim.sonuc.text = sonucMetni+"6"
            sonucMetni = sonucMetni+"6"
        }
        tasarim.button7.setOnClickListener{
            tasarim.sonuc.text = sonucMetni+"7"
            sonucMetni = sonucMetni+"7"
        }
        tasarim.button8.setOnClickListener{
            tasarim.sonuc.text = sonucMetni+"8"
            sonucMetni = sonucMetni+"8"
        }
        tasarim.button9.setOnClickListener{
            tasarim.sonuc.text = sonucMetni+"9"
            sonucMetni = sonucMetni+"9"
        }
        tasarim.buttonAC.setOnClickListener{
            tasarim.sonuc.text = ""
            tasarim.islem.text = ""
            sonucMetni = ""
        }

        tasarim.buttonArti.setOnClickListener{
            toplam += sonucMetni.toInt()
            tasarim.islem.text = toplam.toString() + " + "
            tasarim.sonuc.text = toplam.toString()
            sonucMetni = ""
        }

        tasarim.buttonEsittir.setOnClickListener{
            toplam += sonucMetni.toInt()
            var deger = toplam - sonucMetni.toInt()
            tasarim.islem.text = deger.toString() + " + " + sonucMetni + " ="
            tasarim.sonuc.text = toplam.toString()
            sonucMetni = ""
            toplam = 0

        }

    }
}