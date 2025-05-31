package com.nandaadisaputra.logincomposeapp

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LoginScreen(onNavigateToRegister: () -> Unit) {
    // STATE UNTUK MENYIMPAN INPUT EMAIL DAN PASSWORD
    var email by remember { mutableStateOf("") } // Menyimpan nilai input dari email
    var password by remember { mutableStateOf("") } // Menyimpan nilai input dari password

    // COLUMN UNTUK MENYUSUN ELEMEN SECARA VERTIKAL
    Column(
        modifier = Modifier
            .fillMaxSize() // Mengisi seluruh ukuran layar
            .padding(24.dp), // Memberikan padding di sekeliling konten
        verticalArrangement = Arrangement.Center, // Konten ditengah secara vertikal
        horizontalAlignment = Alignment.CenterHorizontally // Konten ditengah secara horizontal
    ) {
        // TEKS JUDUL LOGIN
        Text(
            text = "Login",
            fontSize = 28.sp, // Ukuran teks
            fontWeight = FontWeight.Bold, // Teks tebal
            modifier = Modifier.padding(bottom = 32.dp) // Jarak bawah antara teks dan input
        )

        // INPUT FIELD UNTUK EMAIL
        OutlinedTextField(
            value = email, // Nilai yang ditampilkan di TextField
            onValueChange = { email = it }, // Mengubah nilai email saat user mengetik
            label = { Text("Email") }, // Label di atas input
            singleLine = true, // Hanya satu baris input
            modifier = Modifier.fillMaxWidth() // Lebar mengikuti lebar parent
        )

        Spacer(modifier = Modifier.height(16.dp)) // Spasi antar input

        // INPUT FIELD UNTUK PASSWORD
        OutlinedTextField(
            value = password, // Nilai yang ditampilkan di TextField
            onValueChange = { password = it }, // Mengubah nilai password saat user mengetik
            label = { Text("Password") }, // Label di atas input
            singleLine = true, // Hanya satu baris input
            visualTransformation = PasswordVisualTransformation(), // Menyembunyikan karakter password
            modifier = Modifier.fillMaxWidth() // Lebar mengikuti parent
        )

        Spacer(modifier = Modifier.height(24.dp)) // Spasi sebelum tombol login

        // TOMBOL LOGIN
        Button(
            onClick = {
                // Di sinilah logika login bisa ditambahkan nanti
                // Contoh: Kirim data ke server untuk verifikasi
            },
            modifier = Modifier
                .fillMaxWidth() // Tombol selebar parent
                .height(48.dp) // Tinggi tombol
        ) {
            Text("Masuk") // Teks pada tombol
        }
        Spacer(modifier = Modifier.height(12.dp))

        // Tombol teks untuk navigasi ke halaman Register
        TextButton(onClick = {
            onNavigateToRegister()
        }) {
            Text("Daftar akun baru")
        }

        Spacer(modifier = Modifier.height(12.dp)) // Spasi sebelum tombol lupa password

        // TOMBOL TEKS UNTUK LUPA PASSWORD
        TextButton(onClick = {
            // Aksi ketika pengguna menekan "Lupa Password?"
            // Bisa diarahkan ke halaman reset password
        }) {
            Text("Lupa Password?") // Teks tombol
        }
    }
}

