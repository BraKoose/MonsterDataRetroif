package com.koose.monsterdataretroif.ui

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import com.koose.monsterdataretroif.data.MonsterRespository

class MonsterHomeViewModel(app:Application) : AndroidViewModel(app) {
    // TODO: Implement the ViewModel
    val datarepo = MonsterRespository(app)
    val monsterData = datarepo.monsterData

}