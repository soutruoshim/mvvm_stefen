package com.example.mvvm_stef.model

import com.example.mvvm_stef.R

class CityDataProvider {
    private val cities = arrayListOf<City>()

    init {
        cities.add(City(name = "bangkok", R.drawable.bangkok, 560000))
        cities.add(City(name = "beijing", R.drawable.beijing, 560000))
        cities.add(City(name = "london", R.drawable.london, 560000))
        cities.add(City(name = "newyork", R.drawable.newyork, 560000))
        cities.add(City(name = "paris", R.drawable.paris, 560000))
        cities.add(City(name = "rio", R.drawable.rio, 560000))
        cities.add(City(name = "rome", R.drawable.rome, 560000))
        cities.add(City(name = "singapore", R.drawable.singapore, 560000))
        cities.add(City(name = "sydney", R.drawable.sydney, 560000))
        cities.add(City(name = "tokyo", R.drawable.tokyo, 560000))
    }
    fun getCites() = cities
}