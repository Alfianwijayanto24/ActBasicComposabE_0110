package com.example.peratikum2

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun ContohColumn(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.padding(top = 20.dp, start = 20.dp)
    ) {
        Text("Helo")
        Text("word")
    }
}
@Composable
fun ContohRow(modifier: Modifier = Modifier) {
    val kota = stringResource(id = R.string.kota)

    Row(
        modifier = modifier
            .padding(top = 60.dp, start = 60.dp)
            .fillMaxWidth()
    ) {
        Text(text = "Helo ")
        Text(text = kota)
    }
}

@Composable
fun TugasLoginColumn(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.padding(top = 20.dp, start = 20.dp, end = 20.dp)
    ) {
        Text(text = "Komponen1")
        Text(text = "Komponen2")
        Text(text = "Komponen3")
        Text(text = "Komponen4")
    }
}
@Composable
fun TugasLoginRow(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        Text(text = "Komponen1")
        Text(text = "Komponen2")
        Text(text = "Komponen3")
        Text(text = "Komponen4")
    }
}

@Composable
fun TugasLoginBox(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxHeight()
            .fillMaxWidth(),
        contentAlignment = Alignment.Center
    ) {
        Text(text = "Box 1")
        Text(text = "Column 1")
        Text(text = "Row 1")
        Text(text = "Box 2")
        Text(text = "Column 2")
    }
}


@Composable
fun TugasLoginColumnRow(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        // Baris 1
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Text(text = "Komponen1Baris1")
            Text(text = "Komponen2Baris1")
            Text(text = "Komponen3Baris1")
        }
        // Baris 2
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Text(text = "Komponen1Baris2")
            Text(text = "Komponen2Baris2")
            Text(text = "Komponen3Baris2")
        }
    }
}

@Composable
fun TugasLoginRowColumn(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        // Kolom 1
        Column {
            Text(text = "Komponen1Kolom1")
            Text(text = "Komponen2Kolom1")
            Text(text = "Komponen3Kolom1")
        }
        // Kolom 2
        Column {
            Text(text = "Komponen1Kolom2")
            Text(text = "Komponen2Kolom2")
            Text(text = "Komponen3Kolom2")
        }
    }
}

@Composable
fun TugasLoginBoxColumnRow(modifier: Modifier = Modifier) {
    // Sumber gambar (sesuaikan ID drawable dengan file gambar milik Anda di res/drawable)
    val gambarBackground = painterResource(id = R.drawable.gambar_background)
    val gambarLogo = painterResource(id = R.drawable.logo_umy)
    val gambarBawah = painterResource(id = R.drawable.gambar_kaabah)
    Box(modifier = modifier.fillMaxSize()) {
        // 0. Gambar Latar Belakang (Background Layar Utama)
        Image(
            painter = gambarBackground,
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )

        // STRUKTUR KODE PERSIS SAMA (KOMPOSISI TIDAK DIUBAH):
        // Column -> Box -> Column -> Row & Row -> Spacer -> Box -> Image & Text
        Column(modifier = Modifier.fillMaxSize()) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 40.dp),
                contentAlignment = Alignment.Center
            ) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    // Row 1: Judul Login & Subtitle
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Text(
                            text = "Login",
                            fontSize = 28.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.White
                        )
                    }
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Text(
                            text = "Ini adalah halaman login,",
                            fontSize = 23.sp,
                            color = Color.Black
                        )
                    }

                    Spacer(modifier = Modifier.height(15.dp))

                    // Logo Tengah
                    Image(
                        painter = gambarLogo,
                        contentDescription = null,
                        modifier = Modifier.size(110.dp)
                    )

                    Spacer(modifier = Modifier.height(15.dp))

                    // Row 2: Informasi Identitas (Nama & NIM)
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Text(
                            text = "Nama",
                            color = Color.Red,
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Text(
                            text = "Alfian wijayanto",
                            color = Color.White,
                            fontSize = 17.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Text(
                            text = "20240140110",
                            color = Color.Black,
                            fontSize = 29.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(20.dp))

            Box(
                modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                // Gambar Berbentuk Lingkaran di Bagian Bawah
                Image(
                    painter = gambarBawah,
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(220.dp)
                        .clip(CircleShape)
                )
            }
        }
    }
}



