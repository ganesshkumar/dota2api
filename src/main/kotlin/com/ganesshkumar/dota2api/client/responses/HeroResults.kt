package com.ganesshkumar.dota2api.client.responses

import com.ganesshkumar.dota2api.models.Hero

class HeroesResult (
        var count: Int,
        var status: Int,
        var heroes: List<Hero>
)