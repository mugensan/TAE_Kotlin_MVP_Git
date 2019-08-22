package com.example.tae_kotlin_mvp_git.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.tae_kotlin_mvp_git.network.RepoRequest
import com.example.tae_kotlin_mvp_git.ConstantsGit
import com.example.tae_kotlin_mvp_git.R


class DisplayGitInfo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.git_main_layout)
    }

}


//        val intent = intent
//        val id = intent.getIntExtra(ConstantsGit.ID_GIT,0)
//        val repoRequest = RetrofitInstances().retrofitInstances.create(RepoRequest::class.java)


