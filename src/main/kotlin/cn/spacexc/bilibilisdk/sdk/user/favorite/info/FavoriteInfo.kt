package cn.spacexc.bilibilisdk.sdk.user.favorite.info

import cn.spacexc.bilibilisdk.network.KtorNetworkUtils
import cn.spacexc.bilibilisdk.network.NetworkResponse
import cn.spacexc.bilibilisdk.sdk.user.favorite.info.remote.content.FavoriteFolderContent
import cn.spacexc.bilibilisdk.sdk.user.favorite.info.remote.list.FavoriteFolderList
import cn.spacexc.bilibilisdk.sdk.user.favorite.info.remote.metadata.FavoriteFolderMetaData
import cn.spacexc.bilibilisdk.utils.UserUtils

/**
 * Created by XC-Qan on 2023/6/24.
 * I'm very cute so please be nice to my code!
 * 给！爷！写！注！释！
 * 给！爷！写！注！释！
 * 给！爷！写！注！释！
 */

object FavoriteInfo {
    /**
     * @param videoAid 传入视频av号，以在返回中获取各个收藏夹中是否包含该视频
     */
    suspend fun getAllFavoriteFolders(
        videoAid: Long? = null
    ): NetworkResponse<FavoriteFolderList> =
        if (UserUtils.mid() == null) NetworkResponse.Failed(
            code = -101,
            message = "未登录",
            data = null,
            apiUrl = "https://api.bilibili.com/x/v3/fav/folder/created/list-all?up_mid=${UserUtils.mid()}${if (videoAid != null) "&rid=$videoAid" else ""}"
        ) else KtorNetworkUtils.get("https://api.bilibili.com/x/v3/fav/folder/created/list-all?up_mid=${UserUtils.mid()}${if (videoAid != null) "&rid=$videoAid" else ""}")

    suspend fun getFavouriteFolderMetadata(
        folderId: Long
    ): NetworkResponse<FavoriteFolderMetaData> =
        KtorNetworkUtils.get("https://api.bilibili.com/x/v3/fav/folder/info?media_id=$folderId")

    suspend fun getFavoriteFolderContentById(
        folderId: Long,
        itemsPerPage: Int = 20,
        page: Int
    ): NetworkResponse<FavoriteFolderContent> =
        KtorNetworkUtils.get("https://api.bilibili.com/x/v3/fav/resource/list?media_id=${folderId}&pn=$page&ps=$itemsPerPage&order=mtime&type=2&platform=web")

}