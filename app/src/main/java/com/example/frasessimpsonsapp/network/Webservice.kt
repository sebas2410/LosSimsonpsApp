package com.example.frasessimpsonsapp.network

import com.example.frasessimpsonsapp.models.personaje
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface Webservice {

    @GET("quotes?count=12")
    suspend fun obtenerPersonajes(): Response<List<personaje>>

    @GET("quotes")
    suspend fun obtenerPersonaje(
        @Query("character") personaje: String
    ): Response<List<personaje>>
}