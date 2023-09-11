package com.santo.resistencia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.santo.resistencia.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var mainbinding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainbinding = ActivityMainBinding.inflate(layoutInflater)
        val view = mainbinding.root
        setContentView(view)



        var banda1 = ""

        mainbinding.negroButton.setOnClickListener {
                banda1 = ("0").toString()
        }
        mainbinding.marronButton2.setOnClickListener {
            banda1 = ("1").toString()
        }
        mainbinding.rojoButton3.setOnClickListener {
            banda1 = ("2").toString()
        }
        mainbinding.orangeButton4.setOnClickListener {
            banda1 = ("3").toString()
        }
        mainbinding.yellowButton5.setOnClickListener {
            banda1 = ("4").toString()
        }
        mainbinding.greenButton6.setOnClickListener {
            banda1 = ("5").toString()
        }
        mainbinding.blueButton7.setOnClickListener {
            banda1 = ("6").toString()
        }
        mainbinding.purpleButton8.setOnClickListener {
            banda1 = ("7").toString()
        }
        mainbinding.greyButton9.setOnClickListener {
            banda1 = ("8").toString()
        }
        mainbinding.whiteButton10.setOnClickListener {
            banda1 = ("1").toString()
        }

        var banda2 = ""
        mainbinding.dosButton11.setOnClickListener {
            banda2 = ("0").toString()
        }
        mainbinding.twoButton12.setOnClickListener {
            banda2 = ("1").toString()
        }
        mainbinding.twoboton.setOnClickListener {
            banda2 = ("2").toString()
        }
        mainbinding.twoorangeButton14.setOnClickListener {
            banda2 = ("3").toString()
        }
        mainbinding.twoYellowButton15.setOnClickListener {
            banda2 = ("4").toString()
        }
        mainbinding.twogrenButton21.setOnClickListener {
            banda2 = ("5").toString()
        }
        mainbinding.twoblueButton20.setOnClickListener {
            banda2 = ("6").toString()
        }
        mainbinding.purpleButton19.setOnClickListener {
            banda2 = ("7").toString()
        }
        mainbinding.twogreyButton18.setOnClickListener {
            banda2 = ("7").toString()
        }
        mainbinding.twowhiteButton16.setOnClickListener {
            banda2 = ("0").toString()
        }

        var banda3 = ""
        mainbinding.tresButton22.setOnClickListener {
            banda3 = ("").toString()
        }
        mainbinding.tresmarronbutton23.setOnClickListener {
            banda3 = ("0").toString()
        }
        mainbinding.tresrojo.setOnClickListener {
            banda3 = ("00").toString()
        }
        mainbinding.tresnaranja.setOnClickListener {
            banda3 = ("000").toString()
        }
        mainbinding.tresamarillo.setOnClickListener {
            banda3 = ("0000").toString()
        }
        mainbinding.tresverde.setOnClickListener {
            banda3 = ("00000").toString()
        }
        mainbinding.tresazul.setOnClickListener {
            banda3 = ("000000").toString()
        }
        mainbinding.trespurpura.setOnClickListener {
            banda3 = ("0.0").toString()
        }
        mainbinding.tresgris.setOnClickListener {
            banda3 = ("0.00").toString()
        }

        var banda4 = ""
        mainbinding.cuatromarron.setOnClickListener {
            banda4 = ("1%").toString()
        }
        mainbinding.cutrorojo.setOnClickListener {
            banda4 = ("2%").toString()
        }
        mainbinding.cutronaranja.setOnClickListener {
            banda4 = ("2%").toString()
        }
        mainbinding.cuatrogris.setOnClickListener {
            banda4 = ("5%").toString()
        }







        val info = banda1 + banda2  + banda3+ "con una tolerancia de "+banda4
        mainbinding.infoTextView7.text = info


    }
}