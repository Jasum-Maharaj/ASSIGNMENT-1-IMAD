package vcmsa.ci.mealapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        // Find the buttons and text views by their IDs
       val resetButton = findViewById<Button>(R.id.btnReset)
       val suggestButton = findViewById<Button>(R.id.btnSuggestMeal)
       val displayMeals = findViewById<TextView>(R.id.txtDisplayMeals)
       val userInput = findViewById<TextView>(R.id.userInput)

        //title: Kotlin if..else
        //author: w3Schools
        //date: 1/04/2025
        //version: 1.0
        //available: https://www.w3schools.com/kotlin/kotlin_conditions.php

        //this button will generate a meal suggestion based on the user input
        suggestButton.setOnClickListener {
            //mealOptions stores the user input from the edit text
            val mealOptions = userInput.text.toString()
            // if the user inputs MORNING then the meal options below will be displayed
            if (mealOptions == "MORNING") {
                // these are the meal options that will be displayed
                displayMeals.text="Breakfast meal suggestion: Oatmeal, Eggs, Toast, Cereal"
                // else if the user inputs MID-MORNING then the meal options below will be displayed
            }else if (mealOptions == "MID-MORNING") {
                // these are the meal options that will be displayed
                displayMeals.text="Mid-morning meal suggestion: Yogurt, Fruit, Granola"
                // else if the user inputs AFTERNOON then the meal options below will be displayed
            }else if (mealOptions == "AFTERNOON") {
                // these are the meal options that will be displayed
                displayMeals.text="Lunch meal suggestion: Sandwich, Salad, Wrap"
                // else if the user inputs MID-AFTERNOON then the meal options below will be displayed
            }else if (mealOptions == "MID-AFTERNOON") {
                // these are the meal options that will be displayed
                displayMeals.text="Mid-afternoon meal suggestion: Donut, Smoothie, Cake"
                // else if the user inputs DINNER then the meal options below will be displayed
            }else if (mealOptions == "DINNER") {
                // these are the meal options that will be displayed
                displayMeals.text="Dinner meal suggestion: Roast chicken, Pasta, Fish and chips"
                // else if the user inputs DESSERT then the meal options below will be displayed
            }else if (mealOptions == "DESSERT") {
                // these are the meal options that will be displayed
                displayMeals.text="Dessert meal suggestion: Ice cream, Cheesecake, Pudding"
                // else the user will be asked to enter a meal option if they do not enter a meal option
            }else displayMeals.text="Please enter a time of day to get a meal suggestion"

        }
       // this button will reset the program and clear the text in the edit text and text view
       resetButton.setOnClickListener {
           // this will clear the text in the edit text and text view
           displayMeals.text = ""
           userInput.text = ""
       }
                 //Title: adding clear button to edit text
                 //Author: Dmytro Batyuk
                 //Date: 1/04/2025
                //Version: 1.0
               //Available: https://medium.com/@dimabatyuk/adding-clear-button-to-edittext-9655e9dbb721
    }
}