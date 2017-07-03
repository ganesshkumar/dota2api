package com.ganesshkumar.dota2api.client

import com.ganesshkumar.dota2api.client.feign.FeignDota2Client
import com.ganesshkumar.dota2api.models.Hero
import com.ganesshkumar.dota2api.models.Item
import feign.Feign
import feign.gson.GsonDecoder
import feign.gson.GsonEncoder

/**
 * @author Ganessh Kumar (ganessh@nomadly.in)
 */

class Dota2Client(val apiKey: String) {
    val client: FeignDota2Client

    init {
        client = Feign.builder()
                .encoder(GsonEncoder())
                .decoder(GsonDecoder())
                .target(FeignDota2Client::class.java, "http://api.steampowered.com")
    }

    fun heroes(): List<Hero> {
        val response = client.heroes(apiKey)
        return response.result.heroes.map { Hero(it.id, it.name) }
    }

    fun items(): List<Item> {
        val response = client.items(apiKey)
        return response.result.items
    }
}