package com.example.tae_kotlin_mvp_git.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.tae_kotlin_mvp_git.ConstantsGit
import com.example.tae_kotlin_mvp_git.R
import com.example.tae_kotlin_mvp_git.model.RepoModel
import com.example.tae_kotlin_mvp_git.network.RepoRequest
import com.example.tae_kotlin_mvp_git.network.RetrofitInstanceGit
import com.example.tae_kotlin_mvp_git.presenter.GitPresenter
import com.example.tae_kotlin_mvp_git.presenter.GitView
import kotlinx.android.synthetic.main.git_main_layout.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class MainActivityGit : AppCompatActivity(),GitView {

    val presenter : GitPresenter = GitPresenter()

    override fun showLoading() {
        pb_progressBar.visibility = View.VISIBLE
    }

    override fun showGit(repoModel: RepoModel) {
        pb_progressBar.visibility = View.GONE
        Log.d("GITPOP",repoModel.archive_url)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.git_main_layout)

        presenter.onViewAttached(this)
    }
}



