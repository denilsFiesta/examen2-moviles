package com.ucb.testmovdos.home

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Whatsapp
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.ucb.testmovdos.R

@Composable
fun HomeBUI(
    viewModel: HomeViewModel = viewModel(),
    onGoToSend: () -> Unit,
    onGoToLeft: () -> Unit,
    onGoToRight: () -> Unit
) {
    val context = LocalContext.current
    val message = viewModel.message.value
    val number = viewModel.phoneNumber

    Box(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 100.dp)
                .align(Alignment.TopCenter),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Text(
                text = "Nuestros planes móviles",
                style = MaterialTheme.typography.headlineSmall,
                color = Color(0xFFF57261),
                modifier = Modifier.padding(top = 16.dp)
            )

            Text(
                text = "La mejor cobertura, increíbles beneficios\ny un compromiso con el planeta.",
                style = MaterialTheme.typography.bodyMedium,
                color = Color.Black,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(vertical = 8.dp)
            )

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 12.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ){

                IconButton(
                    onClick = onGoToLeft,
                    modifier = Modifier
                        .padding(end = 8.dp)
                        .size(40.dp)
                        .background(
                            color = Color(0xFFF57261),
                            shape = CircleShape
                        )
                ) {
                    Text(
                        text = "<",
                        color = Color.White,
                        style = MaterialTheme.typography.bodyLarge,
                        textAlign = TextAlign.Center
                    )
                }

                Column(
                    modifier = Modifier
                        .weight(1f)
                        .border(
                            width = 1.dp,
                            color = Color.LightGray,
                            shape = RoundedCornerShape(12.dp)
                        )
                        .padding(16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    Text(
                        text = "Plan FLEX 8",
                        style = MaterialTheme.typography.titleLarge,
                        color = Color(0xFFF57261)
                    )

                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center,
                        modifier = Modifier.padding(top = 8.dp, bottom = 4.dp)
                    ) {
                        Text("Antes", color = Color.Gray)
                        Text(
                            text = " \$370 ",
                            style = MaterialTheme.typography.bodyLarge.copy(
                                textDecoration = TextDecoration.LineThrough,
                                fontWeight = FontWeight.Bold
                            ),
                            color = Color.Gray
                        )
                        Text("/mes", color = Color.Gray)
                    }

                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center,
                        modifier = Modifier.padding(bottom = 4.dp)
                    ) {
                        Text("Ahora", color = Color.Gray)
                        Text(
                            text = " \$299 ",
                            style = MaterialTheme.typography.headlineMedium.copy(
                                fontWeight = FontWeight.ExtraBold
                            ),
                            color = Color.Black
                        )
                        Text("/mes", color = Color.Gray)
                    }

                    Text(
                        text = "8GB",
                        style = MaterialTheme.typography.titleMedium.copy(
                            fontWeight = FontWeight.Black
                        ),
                        color = Color.Gray
                    )

                    Spacer(modifier = Modifier.height(16.dp))

                    val benefits = listOf(
                        "Llamadas y SMS ilimitados",
                        "Hotspot. Comparte tus datos",
                        "Redes Sociales ilimitadas incluidas",
                        "Arma tu plan con más apps ilimitadas",
                        "CO2 Negativo"
                    )

                    benefits.forEach {
                        Text(
                            text = "✓ $it",
                            color = Color.Black,
                            textAlign = TextAlign.Center,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(vertical = 4.dp)
                        )
                    }

                    Spacer(modifier = Modifier.height(16.dp))

                    val socialIcons = listOf(
                        R.drawable.ic_whatsapp,
                        R.drawable.ic_facebook,
                        R.drawable.ic_messenger,
                        R.drawable.ic_x,
                        R.drawable.ic_instagram,
                        R.drawable.ic_snapchat,
                        R.drawable.ic_telegram
                    )

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 0.dp, top = 12.dp),
                        horizontalArrangement = Arrangement.Start,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        socialIcons.forEach { iconRes ->
                            IconButton(
                                onClick = {},
                                modifier = Modifier
                                    .size(36.dp)
                                    .background(Color.Black, CircleShape)
                                    .padding(4.dp)
                            ) {
                                Icon(
                                    painter = painterResource(id = iconRes),
                                    contentDescription = null,
                                    tint = Color.White,
                                    modifier = Modifier.fillMaxSize(0.6f)
                                )
                            }
                        }
                    }
                }


                IconButton(
                    onClick = onGoToRight,
                    modifier = Modifier
                        .padding(start = 8.dp)
                        .size(40.dp)
                        .background(
                            color = Color(0xFFF57261),
                            shape = CircleShape
                        )
                ) {
                    Text(
                        text = ">",
                        color = Color.White,
                        style = MaterialTheme.typography.bodyLarge,
                        textAlign = TextAlign.Center
                    )
                }
            }
        }


        Button(
            onClick = onGoToSend,
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .fillMaxWidth()
                .padding(16.dp)
                .navigationBarsPadding(),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFFF57261),
                contentColor = Color.White
            )
        ) {
            Text("Quiero este plan")
        }

        // Botón flotante WhatsApp
        IconButton(
            onClick = {
                val url = "https://wa.me/$number?text=${Uri.encode(message)}"
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                context.startActivity(intent)
            },
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .offset(x = (-16).dp, y = (-140).dp)
                .size(56.dp)
        ) {
            Icon(
                imageVector = Icons.Filled.Whatsapp,
                contentDescription = "WhatsApp",
                tint = Color(0xFF25D366),
                modifier = Modifier.fillMaxSize()
            )
        }
    }
}
