package cn.spacexc.bilibilisdk.sdk.user.favorite

import cn.spacexc.bilibilisdk.network.KtorNetworkUtils
import cn.spacexc.bilibilisdk.network.NetworkResponse
import cn.spacexc.bilibilisdk.sdk.user.favorite.remote.content.FavoriteFolderContent
import cn.spacexc.bilibilisdk.sdk.user.favorite.remote.list.FavoriteFolderList
import cn.spacexc.bilibilisdk.sdk.user.favorite.remote.metadata.FavoriteFolderMetaData
import cn.spacexc.bilibilisdk.utils.UserUtils

/**
 * Created by XC-Qan on 2023/6/24.
 * I'm very cute so please be nice to my code!
 * 给！爷！写！注！释！
 * 给！爷！写！注！释！
 * 给！爷！写！注！释！
 */

object FavoriteInfo {
    suspend fun getAllFavoriteFolders(): NetworkResponse<FavoriteFolderList> =
        KtorNetworkUtils.get("https://api.bilibili.com/x/v3/fav/folder/created/list-all?up_mid=${UserUtils.mid()}")

    suspend fun getFavouriteFolderMetadata(
        folderId: Long
    ): NetworkResponse<FavoriteFolderMetaData> = KtorNetworkUtils.get("https://api.bilibili.com/x/v3/fav/folder/info?media_id=$folderId")

    suspend fun getFavoriteFolderContentById(
        folderId: Long,
        itemsPerPage: Int = 20,
        page: Int
    ): NetworkResponse<FavoriteFolderContent> =
        KtorNetworkUtils.get("https://api.bilibili.com/x/v3/fav/resource/list?media_id=${folderId}&pn=$page&ps=$itemsPerPage&order=mtime&type=2&platform=web")

}