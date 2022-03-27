package com.example.fragmenttask3_k

import android.app.Application

class ApplicationClass : Application() {
    override fun onCreate() {
        super.onCreate()
        cars = ArrayList()
        cars!!.add(Car("Mercedes", "E200", "Peter Pollock", "092309809"))
        cars!!.add(Car("Nissan", "Almera", "Chris James", "092309809"))
        cars!!.add(Car("Mercedes", "E180", "John Rambo", "092309809"))
        cars!!.add(Car("Volkswagen", "Kombi", "Nelson Mandela", "092309809"))
        cars!!.add(Car("Nissan", "Navara", "Paul Bunting", "092309809"))
        cars!!.add(Car("Mercedes", "E180", "John Rambo", "092309809"))
        cars!!.add(Car("Volkswagen", "Kombi", "Nelson Mandela", "092309809"))
        cars!!.add(Car("Nissan", "Navara", "Paul Bunting", "092309809"))
        cars!!.add(Car("Mercedes", "E200", "Peter Pollock", "092309809"))
    }

    companion object {
        var cars: ArrayList<Car>? = null
    }
}