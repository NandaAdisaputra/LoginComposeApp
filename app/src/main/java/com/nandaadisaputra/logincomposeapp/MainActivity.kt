package com.nandaadisaputra.logincomposeapp
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // State untuk menentukan layar mana yang aktif, "login" atau "register"
        var currentScreen by mutableStateOf("login")

        setContent {
            // UI utama bergantung pada nilai currentScreen
            if (currentScreen == "login") {
                // Menampilkan layar LoginScreen
                LoginScreen(
                    onNavigateToRegister = {
                        // Jika user pilih daftar, ganti currentScreen ke "register"
                        currentScreen = "register"
                    }
                )
            } else {
                // Menampilkan layar RegisterScreen
                RegisterScreen(
                    onNavigateToLogin = {
                        // Jika user sudah punya akun, kembali ke layar login
                        currentScreen = "login"
                    }
                )
            }
        }
    }
}

