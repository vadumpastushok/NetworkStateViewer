    package pastushok.vadum.networkstateviewer

import android.Manifest
import android.content.Context
import android.content.pm.PackageManager
import android.graphics.Color
import android.net.wifi.WifiManager
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.format.Formatter
import android.view.LayoutInflater
import android.widget.Toast
import androidx.core.app.ActivityCompat
import pastushok.vadum.networkstateviewer.databinding.ActivityMainBinding

    class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private var ipAddress = "12"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)
        getNetworkData()
    }

    private fun getNetworkData(){
        val wifiManager = this.getSystemService(Context.WIFI_SERVICE) as WifiManager
        ipAddress = Formatter.formatIpAddress(wifiManager.connectionInfo.ipAddress)
        showNetworkData()
    }

    private fun showNetworkData(){
        binding.textView.text = "IpAddress: $ipAddress"
    }

}