package com.example.frasessimpsonsapp.models

import com.google.gson.annotations.SerializedName

data class personaje(
  @SerializedName("quote")
  val frase: String,
  @SerializedName("character")
  val  personaje: String,
  @SerializedName("image")
  val  imagen: String,
  @SerializedName("characterDirection")
  val  direccionpersonaje: String,
  )