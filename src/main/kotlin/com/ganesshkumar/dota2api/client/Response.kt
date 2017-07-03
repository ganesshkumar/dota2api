package com.ganesshkumar.dota2api.client.response

import com.ganesshkumar.dota2api.models.Hero
import com.ganesshkumar.dota2api.models.Item

class Response<T> (var result: T)

class HeroesResult (
        var count: Int,
        var status: Int,
        var heroes: List<Hero>
)

class ItemsResult (
        var status: Int,
        var items: List<Item>
)