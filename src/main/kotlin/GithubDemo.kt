import feign.Feign
import feign.Param
import feign.RequestLine
import feign.gson.GsonDecoder
import feign.gson.GsonEncoder


/**
 * @author Ganessh Kumar (rpganesshkumar@gmail.com)
 */

open class Contributor(val login: String, var contributions: Int = 0) {
    override fun toString(): String {
        return "login ${login} has ${contributions} contributions"
    }
}

interface Github {
    @RequestLine("GET /repos/{owner}/{repo}/contributors")
    fun contributors(@Param("owner") owner: String, @Param("repo") repo: String): List<Contributor>
}

fun main(args: Array<String>) {
    val github = Feign.builder()
            .encoder(GsonEncoder())
            .decoder(GsonDecoder())
            .target(Github::class.java, "https://api.github.com")
    github.contributors("OpenFeign", "feign").stream().forEach { println(it) }
}