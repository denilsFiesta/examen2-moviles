package com.ucb.testmovdos.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Whatsapp
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun HomeUI(){

    Box(modifier = Modifier.fillMaxSize()) {
        // Contenedor para botones laterales (ajustado en altura para no chocar con el inferior)
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 100.dp) // deja espacio para el botón inferior
        ) {
            Row(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 16.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Button(onClick = {}) {
                    Text("Izquierda")
                }
                Button(onClick = {}) {
                    Text("Derecha")
                }
            }
        }

        // Botón inferior (fijo al fondo, ocupa todo el ancho)
        Button(
            onClick = {},
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .fillMaxWidth()
                .padding(16.dp)
                .navigationBarsPadding() // ← ¡esto es lo importante!
        ) {
            Text("Botón inferior")
        }

        // Botón flotante (popup)
        IconButton(
            onClick = {},
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .offset(x = (-16).dp, y = (-140).dp)
                .size(56.dp)
        ) {
            Icon(
                imageVector = Icons.Filled.Whatsapp,
                contentDescription = "WhatsApp",
                tint = Color(0xFF25D366), // color oficial de WhatsApp
                modifier = Modifier.fillMaxSize()
            )
        }
    }
}