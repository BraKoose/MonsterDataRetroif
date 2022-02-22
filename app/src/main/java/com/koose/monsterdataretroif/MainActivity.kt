package com.koose.monsterdataretroif

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.inflate
import androidx.fragment.app.add
import androidx.fragment.app.commit
import com.koose.monsterdataretroif.ui.MonsterHomeFrag

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.commit {
            add<MonsterHomeFrag>(R.id.container, null)

        }
    }
}