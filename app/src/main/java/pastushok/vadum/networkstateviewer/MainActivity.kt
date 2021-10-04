    package pastushok.vadum.networkstateviewer

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import pastushok.vadum.networkstateviewer.databinding.ActivityMainBinding

    class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(LayoutInflater.from(applicationContext))
        getNetworkData()
        showNetworkData()
    }

    private fun getNetworkData(){

    }

    private fun showNetworkData(){

    }

}