package com.example.devin.kotlintest

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import java.util.*

class MainActivity : AppCompatActivity() {

    private val tag = "MAIN ACT"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    private fun bankStuff(){
        val account1 = BankAccount()
        val account2 = BankAccount(4195726)
        val account3 = BankAccount(5891246, 452.57)
        val account4 = BankAccount(5927539, 10482.42, "John Doe")
        val account5 = BankAccount(5817593, 412.20, "Jane Doe")
        val account6 = BankAccount(4125263, 124.25)


    }

    private fun unitConversion{
        val inch = 12.353
        val feet = 1.52
        val yard = 3.252

        Log.d(tag, "inches: $inch")
        Log.d(tag, "feet: $feet")
        Log.d(tag, "yard: $yard")

        Log.d(tag, "inches to Feet: " + inchesToFeet(inch.toFloat()))
        Log.d(tag, "inches to yard: " + inchesToYards(inch.toFloat()))

        Log.d(tag, "feet to inches: " + feetToInches(feet.toFloat()))
        Log.d(tag, "feet to yards: " + feetToYards(feet.toFloat()))

        Log.d(tag, "yards to inches: " + yardsToInches(yard.toFloat()))
        Log.d(tag, "yards to feet: " + yardsToFeet(yard.toFloat()))

        Log.d(tag, "feet to yards to feet: " + yardsToFeet(feetToYards(feet.toFloat())))
        Log.d(tag, "yards to feet to yards: " + feetToYards(yardsToFeet(yard.toFloat())))

        Log.d(tag, "feet to inches to feet: " + inchesToFeet(feetToInches(feet.toFloat())))
        Log.d(tag, "inches to feet to inches: " + feetToInches(inchesToFeet(inch.toFloat())))

        Log.d(tag, "yards to inches to yards: " + inchesToYards(yardsToInches(yard.toFloat())))
        Log.d(tag, "inches to yards to inches: " + yardsToInches(inchesToYards(inch.toFloat())))

    }
    private fun inchesToFeet  (inches: Float): Float {return inches / 12}
    private fun inchesToYards (inches: Float): Float {return inches / 36}
    private fun feetToInches  (feet:   Float): Float {return feet   * 12}
    private fun yardsToInches (yards:  Float): Float {return yards  * 36}
    private fun feetToYards   (feet:   Float): Float {return feet   * 3}
    private fun yardsToFeet   (yards:  Float): Float {return yards  / 3}

}
