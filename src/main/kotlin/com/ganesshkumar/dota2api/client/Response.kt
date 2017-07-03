package com.ganesshkumar.dota2api.client.response

import com.ganesshkumar.dota2api.models.Hero
import com.ganesshkumar.dota2api.models.Item
import com.google.gson.annotations.SerializedName

class Response<T> (var result: T)

class HeroesResult (
        val count: Int,
        val status: Int,
        val heroes: List<Hero>
)

class ItemsResult (
        val status: Int,
        val items: List<Item>
)

class PrizePoolResult (
        @SerializedName("prize_pool") val prizePool: Int,
        @SerializedName("league_id") val leagueId: Int,
        val status: Int
)