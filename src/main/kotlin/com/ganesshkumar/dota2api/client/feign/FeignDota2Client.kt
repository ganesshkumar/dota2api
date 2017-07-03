package com.ganesshkumar.dota2api.client.feign

import com.ganesshkumar.dota2api.client.response.*
import com.ganesshkumar.dota2api.constants.API_URLS
import feign.Param
import feign.RequestLine

/**
 * @author Ganessh Kumar (ganessh@nomadly.in)
 */
interface FeignDota2Client {
    @RequestLine("GET ${API_URLS.HEROES_URL}?key={key}")
    fun heroes(@Param("key") apiKey: String): Response<HeroesResult>

    @RequestLine("GET ${API_URLS.ITEMS_URL}?key={key}")
    fun items(@Param("key") apiKey: String): Response<ItemsResult>
}