# dota2api
Java wrapper for dota2 web api

Impletemented APIs

* [ ] getMatchHistory()
* [ ] getMatchDetails()
* [ ] getLeagueListing()
* [ ] getLiveLeagueGames()
* [ ] getTeamInfoByTeamId()
* [ ] getPlayerSummaries()
* [x] getHeros()
* [x] getItems()
* [ ] getTournamentPrizePool()

## Usage

```kotlin
fun main(args: Array<String>) {
    val dota2Client = Dota2Client("YOUR_SECRET_KEY")
    // Print all heroes
    dota2Client.heroes().forEach { println("${it.name} : ${it.images.large}") }
    // Print all items
    dota2Client.items().forEach { println(it.name) }
}
```

---

Inspired from python library [dota2api](https://dota2api.readthedocs.io/en/latest/installation.html)
