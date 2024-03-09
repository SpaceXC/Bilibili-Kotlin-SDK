package cn.spacexc.bilibilisdk.data

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

/**
 * Created by XC-Qan on 2023/5/25.
 * I'm very cute so please be nice to my code!
 * 给！爷！写！注！释！
 * 给！爷！写！注！释！
 * 给！爷！写！注！释！
 */

class SimpleDataManager : DataManager {
    override suspend fun saveString(name: String, value: String?) {

    }

    override suspend fun saveInt(name: String, value: Int) {

    }

    override suspend fun saveBool(name: String, value: Boolean) {

    }

    override suspend fun deleteString(name: String) {

    }

    override suspend fun getString(name: String, defVal: String?): String? {
        return ""
    }

    override suspend fun getInt(name: String, defVal: Int?): Int? {
        return 0
    }

    override suspend fun getBool(name: String, defVal: Boolean?): Boolean? {
        return true
    }

    override fun getBoolFlow(name: String, defVal: Boolean?): Flow<Boolean> {
        return flow {  }
    }

    override fun getStringFlow(name: String, defVal: String?): Flow<String> {
        return flow {  }
    }
}