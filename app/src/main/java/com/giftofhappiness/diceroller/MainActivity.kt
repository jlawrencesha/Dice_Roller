package com.giftofhappiness.diceroller

import android.app.ProgressDialog.show
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    //the following is used to store the diceImage in a field which
    //can be used to limit the number of times findviewbyid is called and
    //therefore increase efficiency.
    lateinit var diceImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        diceImage = findViewById(R.id.diceImageView)



        val roll: Button = findViewById(R.id.rollBtn)
        roll.text = "Let's Roll"
        roll.setOnClickListener {
            rollDice()

        }
    }


    private fun rollDice() {


        val RandomNumber = java.util.Random().nextInt(6) + 1
        val drawableResource = when (RandomNumber) {

            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(drawableResource)

    }
}















