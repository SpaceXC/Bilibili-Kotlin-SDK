package cn.spacexc.bilibilisdk.sdk.article.info

import cn.spacexc.bilibilisdk.network.KtorNetworkUtils
import cn.spacexc.bilibilisdk.network.NetworkResponse
import cn.spacexc.bilibilisdk.sdk.article.info.remote.content.ArticleInfo
import com.google.gson.Gson
import org.jsoup.Jsoup
import org.jsoup.select.Elements

data class Article(
    val articleInfo: ArticleInfo,
    val decodedContent: Elements
)

object ArticleInfo {
    suspend fun getArticle(
        articleId: Long
    ): NetworkResponse<Article> {
        val response = KtorNetworkUtils.getBytes("https://www.bilibili.com/read/cv$articleId")
            ?: return NetworkResponse.Failed(
                -1,
                "Network failed",
                apiUrl = "https://www.bilibili.com/read/cv$articleId"
            )
        val documentHtml = String(response)
        val document = Jsoup.parse(documentHtml)

        val script =
            document.body().select("script").find { it.html().contains("__INITIAL_STATE__") }
                ?.html()//.first()?.text() ?: ""//?.replace("<script>", "")?.replace(";(function(){var s;(s=document.currentScript||document.scripts[document.scripts.length-1]).parentNode.removeChild(s);}());</script>", "") ?: return "no INITIAL_STATE"
        val json = script?.replace("window.__INITIAL_STATE__=", "")?.replace(
            ";(function(){var s;(s=document.currentScript||document.scripts[document.scripts.length-1]).parentNode.removeChild(s);}());",
            ""
        ) ?: ""
        val articleInfo = Gson().fromJson(json, ArticleInfo::class.java)
        val articleContentHtml = articleInfo.readInfo.content
        val articleContentDocument = Jsoup.parseBodyFragment(articleContentHtml)

        return NetworkResponse.Success(
            Article(
                articleInfo,
                articleContentDocument.body().children()
            ),
            "https://www.bilibili.com/read/cv$articleId"
        )
    }
}