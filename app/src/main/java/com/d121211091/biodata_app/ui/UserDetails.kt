package com.d121211091.biodata_app.ui

import android.content.Context
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import coil.compose.rememberAsyncImagePainter
import com.d121211091.biodata_app.data.model.User
import com.d121211091.biodata_app.ui.theme.fontLexend
import com.d121211091.biodata_app.data.response.Screen
import com.d121211091.biodata_app.data.response.getUserLocation
import com.d121211091.biodata_app.data.response.getUsername
import com.d121211091.biodata_app.ui.viewmodel.UserViewModel

@Composable
fun UserDetailsPreview(
    navController: NavHostController, viewModel: UserViewModel, context: Context
) {
    viewModel.user?.let {
        UserDetailsScreen(
            navController = navController,
            user = it,
            context = context
        )
    }
}

@Composable
fun UserDetailsScreen(navController: NavHostController, user: User, context: Context) {
    Box(
        modifier = Modifier
            .padding(8.dp, 4.dp, 8.dp, 4.dp)
            .fillMaxWidth(),
    ) {
        Column(
            modifier = Modifier
                .padding(8.dp)
                .fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            Image(
                painter = rememberAsyncImagePainter(model = user.picture.large),
                contentDescription = "image",
                modifier = Modifier
                    .size(250.dp)
                    .align(Alignment.CenterHorizontally)
                    .clip(RoundedCornerShape(CornerSize(10.dp)))
            )

            Text(
                text = "Nama: " + user.name.getUsername(),
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                style = MaterialTheme.typography.subtitle1,
                fontFamily = fontLexend
            )

            Text(
                text = "Email: " + user.email,
                modifier = Modifier.padding(0.dp, 0.dp, 4.dp, 0.dp),
                style = MaterialTheme.typography.caption,
                fontFamily = fontLexend
            )

            Text(
                text = "Nomor HP: " + user.phone,
                style = MaterialTheme.typography.caption,
                fontFamily = fontLexend
            )

            Text(
                text = "Jenis Kelamin: " + user.gender,
                style = MaterialTheme.typography.caption,
                fontFamily = fontLexend
            )

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable {
                        navController.navigate(Screen.Home.route)
                    },
            ) {
                Text(
                    text = "Alamat: ",
                    style = MaterialTheme.typography.caption,
                    fontFamily = fontLexend
                )
                Text(
                    text = user.location.getUserLocation(),
                    style = MaterialTheme.typography.caption,
                    fontFamily = fontLexend,
                    softWrap = true
                )
            }

        }
    }
}