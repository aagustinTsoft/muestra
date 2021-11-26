package Presentacion

import Datos.KtorCharactersRepository
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import Modelo.CharactersService
import Datos.*


class CharactersViewModelFactory : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        val charactersApi = KtorCharactersRepository()
        val charactersService = CharactersService(charactersApi)
        return CharactersViewModel(charactersService) as T
    }
}

