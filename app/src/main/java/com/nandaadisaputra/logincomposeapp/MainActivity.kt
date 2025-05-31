package com.nandaadisaputra.logincomposeapp
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

// MainActivity adalah activity utama yang dijalankan saat aplikasi dimulai
class MainActivity : ComponentActivity() {

    // Fungsi onCreate dipanggil saat activity pertama kali dibuat
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState) // Memanggil implementasi onCreate dari superclass (ComponentActivity)

        // Menentukan isi tampilan activity menggunakan Jetpack Compose
        setContent {
            // Memanggil fungsi LoginScreen() yang berisi tampilan login
            LoginScreen()
        }
    }
}
