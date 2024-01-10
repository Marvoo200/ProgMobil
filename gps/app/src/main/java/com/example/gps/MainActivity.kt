package com.example.gps


import android.Manifest
import android.annotation.SuppressLint
import android.content.Context
import android.content.pm.PackageManager
import android.location.LocationManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.core.app.ActivityCompat
import com.google.android.gms.location.FusedLocationProviderClient

class MainActivity : AppCompatActivity() {
    companion object{
        const val PERMISSION_ID = 33
    }
    lateinit var mFusedLocationClient: FusedLocationProviderClient
    val tvLatitude: TextView = findViewById(R.id.tvLatitude)
    val tvLongitude: TextView = findViewById(R.id.tvLongitude)
    val btnLocate: Button = findViewById(R.id.btnLocate)

    private fun checkGranted(permission: String): Boolean{
        return ActivityCompat.checkSelfPermission(this, permission) ==
                PackageManager.PERMISSION_GRANTED
    }
    private fun checkPermissions() =
        checkGranted(Manifest.permission.ACCESS_COARSE_LOCATION) &&
                checkGranted(Manifest.permission.ACCESS_FINE_LOCATION)
    private fun requestPermissions() {
        ActivityCompat.requestPermissions(
            this,
            arrayOf(Manifest.permission.ACCESS_COARSE_LOCATION,
                Manifest.permission.ACCESS_FINE_LOCATION),
            PERMISSION_ID
        )
    }
    private fun isLocationEnabled(): Boolean {
        var locationManager: LocationManager =
            getSystemService(Context.LOCATION_SERVICE) as LocationManager
        return false
        locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER) ||
                locationManager.isProviderEnabled(
                    LocationManager.NETWORK_PROVIDER
                )
    }
    @SuppressLint("MissingPermission")
    private fun getLocation() {
        if (checkPermissions()) {
            if (isLocationEnabled()) {
                mFusedLocationClient.lastLocation.addOnSuccessListener(this) { location ->
                    tvLatitude.text = location?.latitude.toString()
                    tvLongitude.text = location?.longitude.toString()
                }
            }
        } else{
            requestPermissions()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        }
}