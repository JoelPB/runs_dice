package com.google.joel.coffee.program.runs_dice


import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.google.joel.coffee.program.runs_dice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding
    private lateinit var diceAnimation: AnimationDrawable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        val diceImage = binding.imgDice.apply {
//            setBackgroundResource(R.drawable.animation_dice)
//            diceAnimation = background as AnimationDrawable
//        }

//        diceImage.setOnClickListener({diceAnimation.start()})
//        binding.imgDice.setBackgroundResource(R.drawable.animation_dice)
//        diceAnimation = binding.imgDice.background as AnimationDrawable
        binding.imgDice.apply {
            setBackgroundResource(R.drawable.animation_dice)
            diceAnimation = background as AnimationDrawable
        }
        diceAnimation.start()

        binding.btnRun.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        
        val input: String? = binding.textInput.text.toString()


        if ((input != null) && (input != "")) {

            var dice = EventDice(binding, input)

            if (dice.run()){
                Toast.makeText(this, "Parabéns, você advinhou o $input", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Infelizmente você errou, tente novamente", Toast.LENGTH_SHORT).show()
            }

        }
    }
}