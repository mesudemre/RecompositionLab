package com.mesutemre.recompositionlab

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.selection.triStateToggleable
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.mesutemre.recompositionlab.components.ListItem
import com.mesutemre.recompositionlab.ui.theme.RecompositionLabTheme

class MainActivity : ComponentActivity() {

    private val viewModel: MainActivityViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RecompositionLabTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val textContent by viewModel.textContent.collectAsState()
                    val onClickSetText = remember<(String) -> Unit> {
                        {
                            viewModel.setTextContent(it)
                        }
                    }
                    val stableUser by viewModel.stableUser.collectAsState()
                    val unStableUser by viewModel.unStableUser.collectAsState()
                    val list by viewModel.list.collectAsState()

                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(24.dp)
                    ) {
                        /*------------------------------------Lambda--------------------------------------------------------*/
                        /*AdSoyadYasSet(textContent = textContent, onClick = {
                            viewModel.setTextContent(it)
                        }) */
                        //AdSoyadYasSet(textContent = textContent, onClick = viewModel::setTextContent)
                        //AdSoyadYasSet(textContent = textContent, onClick = onClickSetText)


                        /*------------------------------------Stable & Unstable--------------------------------------------------------*/

                        /*UserInfoUnStable(user = unStableUser, onSetAd = viewModel::changeUnStableUserAd, onSetYas = viewModel::changeUnStableUserYas)
                        UserInfoStable(
                            user = stableUser,
                            onSetAd = viewModel::changeStableUserAd,
                            onSetYas = viewModel::changeStableUserYas
                        )
                        Spacer(modifier = Modifier.height(24.dp))
                        Button(onClick = viewModel::changeSoyad) {
                            Text(text = "Alakasız fonksiyon")
                        }*/


                        /*------------------------------------derivedStateOf--------------------------------------------------------*/
                        val listState = rememberLazyListState()

                        Box(modifier = Modifier.fillMaxWidth()) {
                            LazyColumn(
                                state = listState,
                                modifier = Modifier.fillMaxSize()) {
                                itemsIndexed(list, key = { index, item ->
                                    index
                                }) {index, item ->
                                    ListItem(title = item.title, content = item.content)
                                    Spacer(modifier = Modifier.height(8.dp))
                                }
                            }

                            if (listState.isScrollingUp()) {
                                Box(modifier = Modifier
                                    .size(64.dp)
                                    .align(Alignment.BottomEnd)
                                    .padding(end = 8.dp, bottom = 8.dp)
                                    .background(
                                        color = MaterialTheme.colorScheme.primary,
                                        shape = CircleShape
                                    )
                                    .clip(shape = CircleShape), contentAlignment = Alignment.Center) {
                                    Icon(imageVector = Icons.Filled.Add, contentDescription = "", tint = Color.White, modifier = Modifier.size(64.dp))
                                }
                            }


                        }
                    }
                }
            }
        }
    }

    @Composable
    private fun ColumnScope.AdSoyadYasSet(
        textContent: String,
        onClick: (String) -> Unit
    ) {
        Text(
            text = textContent,
            textAlign = TextAlign.Center,
            style = TextStyle.Default.copy(
                fontWeight = FontWeight.SemiBold
            ),
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.CenterHorizontally)
        )
        Spacer(modifier = Modifier.height(24.dp))
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
            Button(onClick = {
                onClick("mesut emre")
            }) {
                Text(text = "Ad")
            }
            Button(onClick = {
                onClick("çelenk")
            }) {
                Text(text = "Soyad")
            }
            Button(onClick = {
                onClick("32")
            }) {
                Text(text = "Yaş")
            }
        }
    }

    @Composable
    fun ColumnScope.UserInfoStable(
        user: StableUser,
        onSetAd: () -> Unit,
        onSetYas: () -> Unit
    ) {
        Text(text = "Ad : ${user.ad}")
        Spacer(modifier = Modifier.height(24.dp))
        Text(text = "Yaş : ${user.yas}")
        Spacer(modifier = Modifier.height(24.dp))
        Spacer(modifier = Modifier.height(24.dp))
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
            Button(onClick = {
                onSetAd()
            }) {
                Text(text = "Adı setle")
            }

            Button(onClick = {
                onSetYas()
            }) {
                Text(text = "Yaşı setle")
            }
        }
    }

    @Composable
    fun ColumnScope.UserInfoUnStable(
        user: User,
        onSetAd: () -> Unit,
        onSetYas: () -> Unit
    ) {
        Text(text = "Ad : ${user.ad}")
        Spacer(modifier = Modifier.height(24.dp))
        Text(text = "Soyad : ${user.yas}")
        Spacer(modifier = Modifier.height(24.dp))
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
            Button(onClick = {
                onSetAd()
            }) {
                Text(text = "Adı setle")
            }

            Button(onClick = {
                onSetYas()
            }) {
                Text(text = "Yaşı setle")
            }
        }
    }

    @Composable
    private fun LazyListState.isScrollingUp(): Boolean {
        var previousIndex by remember(this) { mutableStateOf(firstVisibleItemIndex) }
        var previousScrollOffset by remember(this) { mutableStateOf(firstVisibleItemScrollOffset) }
        return if (previousIndex != firstVisibleItemIndex) {
            previousIndex > firstVisibleItemIndex
        } else {
            previousScrollOffset >= firstVisibleItemScrollOffset
        }.also {
            previousIndex = firstVisibleItemIndex
            previousScrollOffset = firstVisibleItemScrollOffset
        }
        /*return remember(this) {
            derivedStateOf {

            }
        }.value */
    }
}