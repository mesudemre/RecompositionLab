package com.mesutemre.recompositionlab

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class MainActivityViewModel : ViewModel() {

    private val _textContent = MutableStateFlow<String>("Seçim yapınız...")
    val textContent = _textContent.asStateFlow()

    private val _stableUser = MutableStateFlow<StableUser>(
        StableUser(
            ad = "mesut emre",
            yas = 32
        )
    )
    val stableUser = _stableUser.asStateFlow()

    private val _unStableUser = MutableStateFlow<User>(
        User(
            ad = "mesut emre",
            soyad = "çelenk",
            yas = 32
        )
    )
    val unStableUser = _unStableUser.asStateFlow()


    private val _list = MutableStateFlow<List<ListItemData>>(emptyList())
    val list = _list.asStateFlow()

    init {
        _list.value = listOf(
            ListItemData(
                title = "Panda1",
                content = "Dev panda veya sadece panda, ayıgiller familyasından, beyaz postu üzerinde bölge bölge siyah büyük benekleri olan, iri, nesli tehlikede olan bir ayı türü. Küçük pandadan ayrıt edebilinmesi için büyük panda veya sadece bambu ile beslendiğine dikkati çekmek için bambu ayısı da denilir."
            ),
            ListItemData(
                title = "Panda2",
                content = "Dev panda veya sadece panda, ayıgiller familyasından, beyaz postu üzerinde bölge bölge siyah büyük benekleri olan, iri, nesli tehlikede olan bir ayı türü. Küçük pandadan ayrıt edebilinmesi için büyük panda veya sadece bambu ile beslendiğine dikkati çekmek için bambu ayısı da denilir."
            ),
            ListItemData(
                title = "Panda3",
                content = "Dev panda veya sadece panda, ayıgiller familyasından, beyaz postu üzerinde bölge bölge siyah büyük benekleri olan, iri, nesli tehlikede olan bir ayı türü. Küçük pandadan ayrıt edebilinmesi için büyük panda veya sadece bambu ile beslendiğine dikkati çekmek için bambu ayısı da denilir."
            ),
            ListItemData(
                title = "Panda4",
                content = "Dev panda veya sadece panda, ayıgiller familyasından, beyaz postu üzerinde bölge bölge siyah büyük benekleri olan, iri, nesli tehlikede olan bir ayı türü. Küçük pandadan ayrıt edebilinmesi için büyük panda veya sadece bambu ile beslendiğine dikkati çekmek için bambu ayısı da denilir."
            ),
            ListItemData(
                title = "Panda5",
                content = "Dev panda veya sadece panda, ayıgiller familyasından, beyaz postu üzerinde bölge bölge siyah büyük benekleri olan, iri, nesli tehlikede olan bir ayı türü. Küçük pandadan ayrıt edebilinmesi için büyük panda veya sadece bambu ile beslendiğine dikkati çekmek için bambu ayısı da denilir."
            ),
            ListItemData(
                title = "Panda6",
                content = "Dev panda veya sadece panda, ayıgiller familyasından, beyaz postu üzerinde bölge bölge siyah büyük benekleri olan, iri, nesli tehlikede olan bir ayı türü. Küçük pandadan ayrıt edebilinmesi için büyük panda veya sadece bambu ile beslendiğine dikkati çekmek için bambu ayısı da denilir."
            ),
            ListItemData(
                title = "Panda7",
                content = "Dev panda veya sadece panda, ayıgiller familyasından, beyaz postu üzerinde bölge bölge siyah büyük benekleri olan, iri, nesli tehlikede olan bir ayı türü. Küçük pandadan ayrıt edebilinmesi için büyük panda veya sadece bambu ile beslendiğine dikkati çekmek için bambu ayısı da denilir."
            ),
            ListItemData(
                title = "Panda8",
                content = "Dev panda veya sadece panda, ayıgiller familyasından, beyaz postu üzerinde bölge bölge siyah büyük benekleri olan, iri, nesli tehlikede olan bir ayı türü. Küçük pandadan ayrıt edebilinmesi için büyük panda veya sadece bambu ile beslendiğine dikkati çekmek için bambu ayısı da denilir."
            ),
            ListItemData(
                title = "Panda9",
                content = "Dev panda veya sadece panda, ayıgiller familyasından, beyaz postu üzerinde bölge bölge siyah büyük benekleri olan, iri, nesli tehlikede olan bir ayı türü. Küçük pandadan ayrıt edebilinmesi için büyük panda veya sadece bambu ile beslendiğine dikkati çekmek için bambu ayısı da denilir."
            ),
            ListItemData(
                title = "Panda10",
                content = "Dev panda veya sadece panda, ayıgiller familyasından, beyaz postu üzerinde bölge bölge siyah büyük benekleri olan, iri, nesli tehlikede olan bir ayı türü. Küçük pandadan ayrıt edebilinmesi için büyük panda veya sadece bambu ile beslendiğine dikkati çekmek için bambu ayısı da denilir."
            ),
            ListItemData(
                title = "Panda11",
                content = "Dev panda veya sadece panda, ayıgiller familyasından, beyaz postu üzerinde bölge bölge siyah büyük benekleri olan, iri, nesli tehlikede olan bir ayı türü. Küçük pandadan ayrıt edebilinmesi için büyük panda veya sadece bambu ile beslendiğine dikkati çekmek için bambu ayısı da denilir."
            ),
            ListItemData(
                title = "Panda12",
                content = "Dev panda veya sadece panda, ayıgiller familyasından, beyaz postu üzerinde bölge bölge siyah büyük benekleri olan, iri, nesli tehlikede olan bir ayı türü. Küçük pandadan ayrıt edebilinmesi için büyük panda veya sadece bambu ile beslendiğine dikkati çekmek için bambu ayısı da denilir."
            ),
            ListItemData(
                title = "Panda13",
                content = "Dev panda veya sadece panda, ayıgiller familyasından, beyaz postu üzerinde bölge bölge siyah büyük benekleri olan, iri, nesli tehlikede olan bir ayı türü. Küçük pandadan ayrıt edebilinmesi için büyük panda veya sadece bambu ile beslendiğine dikkati çekmek için bambu ayısı da denilir."
            ),
            ListItemData(
                title = "Panda14",
                content = "Dev panda veya sadece panda, ayıgiller familyasından, beyaz postu üzerinde bölge bölge siyah büyük benekleri olan, iri, nesli tehlikede olan bir ayı türü. Küçük pandadan ayrıt edebilinmesi için büyük panda veya sadece bambu ile beslendiğine dikkati çekmek için bambu ayısı da denilir."
            ),
            ListItemData(
                title = "Panda15",
                content = "Dev panda veya sadece panda, ayıgiller familyasından, beyaz postu üzerinde bölge bölge siyah büyük benekleri olan, iri, nesli tehlikede olan bir ayı türü. Küçük pandadan ayrıt edebilinmesi için büyük panda veya sadece bambu ile beslendiğine dikkati çekmek için bambu ayısı da denilir."
            ),
            ListItemData(
                title = "Panda16",
                content = "Dev panda veya sadece panda, ayıgiller familyasından, beyaz postu üzerinde bölge bölge siyah büyük benekleri olan, iri, nesli tehlikede olan bir ayı türü. Küçük pandadan ayrıt edebilinmesi için büyük panda veya sadece bambu ile beslendiğine dikkati çekmek için bambu ayısı da denilir."
            ),
            ListItemData(
                title = "Panda17",
                content = "Dev panda veya sadece panda, ayıgiller familyasından, beyaz postu üzerinde bölge bölge siyah büyük benekleri olan, iri, nesli tehlikede olan bir ayı türü. Küçük pandadan ayrıt edebilinmesi için büyük panda veya sadece bambu ile beslendiğine dikkati çekmek için bambu ayısı da denilir."
            ),
            ListItemData(
                title = "Panda18",
                content = "Dev panda veya sadece panda, ayıgiller familyasından, beyaz postu üzerinde bölge bölge siyah büyük benekleri olan, iri, nesli tehlikede olan bir ayı türü. Küçük pandadan ayrıt edebilinmesi için büyük panda veya sadece bambu ile beslendiğine dikkati çekmek için bambu ayısı da denilir."
            ),
            ListItemData(
                title = "Panda19",
                content = "Dev panda veya sadece panda, ayıgiller familyasından, beyaz postu üzerinde bölge bölge siyah büyük benekleri olan, iri, nesli tehlikede olan bir ayı türü. Küçük pandadan ayrıt edebilinmesi için büyük panda veya sadece bambu ile beslendiğine dikkati çekmek için bambu ayısı da denilir."
            ),
            ListItemData(
                title = "Panda20",
                content = "Dev panda veya sadece panda, ayıgiller familyasından, beyaz postu üzerinde bölge bölge siyah büyük benekleri olan, iri, nesli tehlikede olan bir ayı türü. Küçük pandadan ayrıt edebilinmesi için büyük panda veya sadece bambu ile beslendiğine dikkati çekmek için bambu ayısı da denilir."
            ),
            ListItemData(
                title = "Panda21",
                content = "Dev panda veya sadece panda, ayıgiller familyasından, beyaz postu üzerinde bölge bölge siyah büyük benekleri olan, iri, nesli tehlikede olan bir ayı türü. Küçük pandadan ayrıt edebilinmesi için büyük panda veya sadece bambu ile beslendiğine dikkati çekmek için bambu ayısı da denilir."
            ),
            ListItemData(
                title = "Panda22",
                content = "Dev panda veya sadece panda, ayıgiller familyasından, beyaz postu üzerinde bölge bölge siyah büyük benekleri olan, iri, nesli tehlikede olan bir ayı türü. Küçük pandadan ayrıt edebilinmesi için büyük panda veya sadece bambu ile beslendiğine dikkati çekmek için bambu ayısı da denilir."
            ),
            ListItemData(
                title = "Panda23",
                content = "Dev panda veya sadece panda, ayıgiller familyasından, beyaz postu üzerinde bölge bölge siyah büyük benekleri olan, iri, nesli tehlikede olan bir ayı türü. Küçük pandadan ayrıt edebilinmesi için büyük panda veya sadece bambu ile beslendiğine dikkati çekmek için bambu ayısı da denilir."
            ),
            ListItemData(
                title = "Panda24",
                content = "Dev panda veya sadece panda, ayıgiller familyasından, beyaz postu üzerinde bölge bölge siyah büyük benekleri olan, iri, nesli tehlikede olan bir ayı türü. Küçük pandadan ayrıt edebilinmesi için büyük panda veya sadece bambu ile beslendiğine dikkati çekmek için bambu ayısı da denilir."
            ),
            ListItemData(
                title = "Panda25",
                content = "Dev panda veya sadece panda, ayıgiller familyasından, beyaz postu üzerinde bölge bölge siyah büyük benekleri olan, iri, nesli tehlikede olan bir ayı türü. Küçük pandadan ayrıt edebilinmesi için büyük panda veya sadece bambu ile beslendiğine dikkati çekmek için bambu ayısı da denilir."
            ),
            ListItemData(
                title = "Panda26",
                content = "Dev panda veya sadece panda, ayıgiller familyasından, beyaz postu üzerinde bölge bölge siyah büyük benekleri olan, iri, nesli tehlikede olan bir ayı türü. Küçük pandadan ayrıt edebilinmesi için büyük panda veya sadece bambu ile beslendiğine dikkati çekmek için bambu ayısı da denilir."
            ),
            ListItemData(
                title = "Panda27",
                content = "Dev panda veya sadece panda, ayıgiller familyasından, beyaz postu üzerinde bölge bölge siyah büyük benekleri olan, iri, nesli tehlikede olan bir ayı türü. Küçük pandadan ayrıt edebilinmesi için büyük panda veya sadece bambu ile beslendiğine dikkati çekmek için bambu ayısı da denilir."
            ),
            ListItemData(
                title = "Panda28",
                content = "Dev panda veya sadece panda, ayıgiller familyasından, beyaz postu üzerinde bölge bölge siyah büyük benekleri olan, iri, nesli tehlikede olan bir ayı türü. Küçük pandadan ayrıt edebilinmesi için büyük panda veya sadece bambu ile beslendiğine dikkati çekmek için bambu ayısı da denilir."
            ),
            ListItemData(
                title = "Panda29",
                content = "Dev panda veya sadece panda, ayıgiller familyasından, beyaz postu üzerinde bölge bölge siyah büyük benekleri olan, iri, nesli tehlikede olan bir ayı türü. Küçük pandadan ayrıt edebilinmesi için büyük panda veya sadece bambu ile beslendiğine dikkati çekmek için bambu ayısı da denilir."
            ),
            ListItemData(
                title = "Panda30",
                content = "Dev panda veya sadece panda, ayıgiller familyasından, beyaz postu üzerinde bölge bölge siyah büyük benekleri olan, iri, nesli tehlikede olan bir ayı türü. Küçük pandadan ayrıt edebilinmesi için büyük panda veya sadece bambu ile beslendiğine dikkati çekmek için bambu ayısı da denilir."
            ),
            ListItemData(
                title = "Panda31",
                content = "Dev panda veya sadece panda, ayıgiller familyasından, beyaz postu üzerinde bölge bölge siyah büyük benekleri olan, iri, nesli tehlikede olan bir ayı türü. Küçük pandadan ayrıt edebilinmesi için büyük panda veya sadece bambu ile beslendiğine dikkati çekmek için bambu ayısı da denilir."
            ),
            ListItemData(
                title = "Panda32",
                content = "Dev panda veya sadece panda, ayıgiller familyasından, beyaz postu üzerinde bölge bölge siyah büyük benekleri olan, iri, nesli tehlikede olan bir ayı türü. Küçük pandadan ayrıt edebilinmesi için büyük panda veya sadece bambu ile beslendiğine dikkati çekmek için bambu ayısı da denilir."
            ),
            ListItemData(
                title = "Panda33",
                content = "Dev panda veya sadece panda, ayıgiller familyasından, beyaz postu üzerinde bölge bölge siyah büyük benekleri olan, iri, nesli tehlikede olan bir ayı türü. Küçük pandadan ayrıt edebilinmesi için büyük panda veya sadece bambu ile beslendiğine dikkati çekmek için bambu ayısı da denilir."
            ),
            ListItemData(
                title = "Panda34",
                content = "Dev panda veya sadece panda, ayıgiller familyasından, beyaz postu üzerinde bölge bölge siyah büyük benekleri olan, iri, nesli tehlikede olan bir ayı türü. Küçük pandadan ayrıt edebilinmesi için büyük panda veya sadece bambu ile beslendiğine dikkati çekmek için bambu ayısı da denilir."
            ),
            ListItemData(
                title = "Panda35",
                content = "Dev panda veya sadece panda, ayıgiller familyasından, beyaz postu üzerinde bölge bölge siyah büyük benekleri olan, iri, nesli tehlikede olan bir ayı türü. Küçük pandadan ayrıt edebilinmesi için büyük panda veya sadece bambu ile beslendiğine dikkati çekmek için bambu ayısı da denilir."
            ),

            )
    }

    fun setTextContent(value: String) {
        _textContent.value = value
    }

    fun changeUnStableUserAd() {
        _unStableUser.update {
            it.copy(
                ad = "zeynep ülkü"
            )
        }
    }

    fun changeUnStableUserYas() {
        _unStableUser.update {
            it.copy(
                yas = 4
            )
        }
    }

    fun changeStableUserAd() {
        _stableUser.update {
            it.copy(
                ad = "zeynep ülkü"
            )
        }
    }

    fun changeStableUserYas() {
        _stableUser.update {
            it.copy(
                yas = 4
            )
        }
    }

    fun changeSoyad() {
        _unStableUser.update {
            it.copy(
                soyad = "asddsa"
            )
        }
    }
}