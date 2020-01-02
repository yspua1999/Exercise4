package com.example.exercise4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun showDatePicker(view: View) {
        val newFragment = DatePickerFragment()
        newFragment.show(supportFragmentManager, "datePicker")
    }

    fun processDatePickerResult(year: Int, month: Int, day: Int) {
        val c = Calendar.getInstance()
        val calYear = c.get(Calendar.YEAR)
        val monthString = (month + 1).toString()
        val dateMessage = monthString  +
                "/" + day.toString() + "/" + year.toString()
        val age = calYear - year

        DoB.text = "DOB : " + dateMessage
        Age.text = "Age : " + age.toString()

        when (age) {
            in 16..20 -> Allowance.text = "Minimum basic savings : " + "RM 5000" +"\n\n Maximum amount in excess : RM " + String.format("%.0f",5000*0.30)
            in 21..25 -> Allowance.text = "Minimum basic savings : "  + "RM 14000"+"\n\n Maximum amount in excess : RM " + String.format("%.0f",14000*0.30)
            in 26..30 -> Allowance.text = "Minimum basic savings : "  + "RM 29000"+"\n\n Maximum amount in excess : RM " + String.format("%.0f",29000*0.30)
            in 31..35 -> Allowance.text = "Minimum basic savings : "  + "RM 50000"+"\n\n Maximum amount in excess : RM " + String.format("%.0f",50000*0.30)
            in 36..40 -> Allowance.text = "Minimum basic savings : "  + "RM 78000"+"\n\n Maximum amount in excess : RM " + String.format("%.0f",78000*0.30)
            in 41..45 -> Allowance.text = "Minimum basic savings : "  + "RM 116000"+"\n\n Maximum amount in excess : RM " + String.format("%.0f",116000*0.30)
            in 46..50 -> Allowance.text = "Minimum basic savings : "  + "RM 165000"+"\n\n Maximum amount in excess : RM " + String.format("%.0f",165000*0.30)
            in 51..55 -> Allowance.text = "Minimum basic savings : "  + "RM 228000"+"\n\n Maximum amount in excess : RM " + String.format("%.0f",228000*0.30)
            else -> Allowance.text = "Do not reach the minimum age or over age"
        }
    }
}
