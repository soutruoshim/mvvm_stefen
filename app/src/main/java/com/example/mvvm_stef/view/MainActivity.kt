package com.example.mvvm_stef.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.core.content.res.ResourcesCompat
import androidx.lifecycle.Observer
import com.example.mvvm_stef.R
import com.example.mvvm_stef.databinding.ActivityMainBinding
import com.example.mvvm_stef.viewmodel.CityViewModel

class MainActivity : AppCompatActivity() {
    private val model:CityViewModel by viewModels()
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    override fun onResume() {
        super.onResume()

        model.getCityData().observe(this, Observer {
              binding.cityImage.setImageDrawable(ResourcesCompat.getDrawable(resources, it.image, applicationContext.theme))
              binding.cityNameTV.text = it.name
              binding.cityPopulation.text = it.population.toString()
        })
    }
}