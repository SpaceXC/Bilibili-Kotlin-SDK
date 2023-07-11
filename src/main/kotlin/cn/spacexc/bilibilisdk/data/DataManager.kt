package cn.spacexc.bilibilisdk.data

import kotlinx.coroutines.flow.Flow

/**
 * Created by XC-Qan on 2023/3/23.
 * I'm very cute so please be nice to my code!
 * 给！爷！写！注！释！
 * 给！爷！写！注！释！
 * 给！爷！写！注！释！
 */

interface DataManager {
    suspend fun saveString(name: String, value: String)
    suspend fun saveInt(name: String, value: Int)
    suspend fun saveBool(name: String, value: Boolean)

    suspend fun getString(name: String, defVal: String? = null): String?
    suspend fun getInt(name: String, defVal: Int? = null): Int?
    suspend fun getBool(name: String, defVal: Boolean? = null): Boolean?

    fun getBoolFlow(name: String, defVal: Boolean? = null): Flow<Boolean>
    fun getStringFlow(name: String, defVal: String? = null): Flow<String>
}