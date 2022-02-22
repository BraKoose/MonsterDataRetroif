package com.koose.monsterdataretroif.data

import com.koose.monsterdataretroif.utlis.IMAGE_BASE_URL

data class MonsterData(
    val imageFile: String,
    val monsterName: String,
    val caption:String,
    val description:String,
    val price : Double,
    val scariness: Int,
){
    val imageFileUrl
        get() = IMAGE_BASE_URL+"/$imageFile.webp"

        val imageFullUrl
        get() = "$IMAGE_BASE_URL/${imageFile}_tn.webp"
}

