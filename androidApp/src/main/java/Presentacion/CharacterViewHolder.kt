package Presentacion

import Modelo.Character
import android.util.Log
import androidx.recyclerview.widget.RecyclerView
import com.example.marveltptaller.android.databinding.ListItemCharacterBinding
//import com.example.marveltptaller.android.databinding.ListItemCharacterBinding
//import com.example.marveltptaller.android.marvelcharacters.
import com.squareup.picasso.Picasso

class CharacterViewHolder(private val binding: ListItemCharacterBinding) : RecyclerView.ViewHolder(binding.root) {

    fun bind(character: Character) {
        binding.name.text = character.name
        binding.description.text = character.description
        if (character.thumbnail.toUrl().isNotEmpty()) {
            Log.d("thumbnail", character.thumbnail.toUrl())
            Picasso.get()
                .load(character.thumbnail.toUrl())
                .into(binding.image)
        } else {
            binding.image.setImageURI(null)
        }
    }

}
