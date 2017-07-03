package com.ganesshkumar.dota2api.models

import com.ganesshkumar.dota2api.constants.API_URLS

class Hero(var id: String, var name: String) {
    var images: Images
    var heroName: String

    init {
        // substring(14) removes `npc_dota_hero_`
        val baseUrl = "${API_URLS.HEROES_IMAGE_URL}${name.substring(14)}"

        images = Images("${baseUrl}_lg.png", "${baseUrl}_sb.png","${baseUrl}_full.png","${baseUrl}_vert.png")
        heroName = name.substring(14).split('_').map { it.capitalize() }.joinToString(separator = " ")
    }
}