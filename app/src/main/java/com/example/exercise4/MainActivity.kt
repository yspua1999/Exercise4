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
        val month_string = Integer.toString(month + 1)
        val day_string = Integer.toString(day)
        val year_string = Integer.toString(year)
        val dateMessage = month_string +
                "/" + day_string + "/" + year_string
        val age = calYear - year

        DoB.text = "DOB : " + dateMessage

        when{
            age in 16..20 -> Allowance.text = "Allowance allowed : " + "RM 5000"
            age in 21..25 -> Allowance.text = "Allowance allowed : "  + "RM 14000"
            age in 26..30 -> Allowance.text = "Allowance allowed : "  + "RM 29000"
            age in 31..35 -> Allowance.text = "Allowance allowed : "  + "RM 50000"
            age in 36..40 -> Allowance.text = "Allowance allowed : "  + "RM 78000"
            age in 41..45 -> Allowance.text = "Allowance allowed : "  + "RM 116000"
            age in 46..50 -> Allowance.text = "Allowance allowed : "  + "RM 165000"
            age in 51..55 -> Allowance.text = "Allowance allowed : "  + "RM 228000"
            else -> Allowance.text = "Do not reach the minimum age or over age"
        }


    }
}
