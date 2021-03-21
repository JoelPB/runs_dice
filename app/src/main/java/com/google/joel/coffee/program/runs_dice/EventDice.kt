package com.google.joel.coffee.program.runs_dice

import com.google.joel.coffee.program.runs_dice.databinding.ActivityMainBinding


class EventDice(
        val binding: ActivityMainBinding,
        val input: String
){
    fun run(): Boolean {

        val runDice = (1..6).random()

        printDice(runDice)


        return (runDice == input.toInt())
    }

    private fun printDice(runDice: Int) {
        when (runDice) {
            1 -> binding.imgDice.setImageResource(R.drawable.dice_1)
            2 -> binding.imgDice.setImageResource(R.drawable.dice_2)
            3 -> binding.imgDice.setImageResource(R.drawable.dice_3)
            4 -> binding.imgDice.setImageResource(R.drawable.dice_4)
            5 -> binding.imgDice.setImageResource(R.drawable.dice_5)
            6 -> binding.imgDice.setImageResource(R.drawable.dice_6)

        }

    }

}