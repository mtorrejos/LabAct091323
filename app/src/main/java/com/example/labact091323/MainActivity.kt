package com.example.labact091323

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    var displayString : String = " "
    var displayInt : Int = 0
    var currentChar : String = " "
    var currentInt : Int = 0
    var lastButtonPressed : Int = 0



    fun buttonClick(view: View) {
    //checks if button is either character or integer
        if(findViewById<Button>(R.id.a).isPressed || findViewById<Button>(R.id.b).isPressed || findViewById<Button>(R.id.c).isPressed){
            lastButtonPressed = 1
            Toast.makeText(this, "Please select an operation.", Toast.LENGTH_SHORT).show()
        }
        if(findViewById<Button>(R.id.one).isPressed || findViewById<Button>(R.id.two).isPressed || findViewById<Button>(R.id.three).isPressed) {
            lastButtonPressed = 2
            Toast.makeText(this, "Please select an operation.", Toast.LENGTH_SHORT).show()
        }

    //string display
        if (findViewById<Button>(R.id.plus).isPressed) {
            if (lastButtonPressed == 1) {
                displayString += currentChar
                Toast.makeText(this, displayString, Toast.LENGTH_SHORT).show()
            }

            else if (lastButtonPressed == 2) {
                displayInt += currentInt
                Toast.makeText(this, displayInt.toString(), Toast.LENGTH_SHORT).show()
            }
        }

        else if (findViewById<Button>(R.id.minus).isPressed) {
            if (lastButtonPressed == 1) {
                if (displayString == " ") {
                    Toast.makeText(this, "You need to add text first!", Toast.LENGTH_SHORT).show()
                }
                else {
                    displayString = (displayString.substring(0, displayString.length - 1))
                    Toast.makeText(this, displayString, Toast.LENGTH_SHORT).show()
                }
            }

            else if (lastButtonPressed == 2) {
                displayInt -= currentInt
                Toast.makeText(this, displayInt.toString(), Toast.LENGTH_SHORT).show()
            }
        }


    //set character/integer to be added/subtracted
        if (lastButtonPressed == 1) {
            if (findViewById<Button>(R.id.a).isPressed) { currentChar = "a" }
            else if (findViewById<Button>(R.id.b).isPressed) { currentChar = "b" }
            else if (findViewById<Button>(R.id.c).isPressed) { currentChar = "c" }
        }

        else if (lastButtonPressed == 2) {
            if (findViewById<Button>(R.id.one).isPressed) { currentInt = 1 }
            else if (findViewById<Button>(R.id.two).isPressed) { currentInt = 2 }
            else if (findViewById<Button>(R.id.three).isPressed) { currentInt = 3 }
        }

    }


}