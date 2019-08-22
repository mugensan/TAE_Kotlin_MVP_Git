package com.example.tae_kotlin_mvp_git.presenter

import android.provider.SyncStateContract
import android.util.Log
import com.example.tae_kotlin_mvp_git.model.RepoModel

import com.example.tae_kotlin_mvp_git.ConstantsGit
import com.example.tae_kotlin_mvp_git.model.Owner
//import com.example.tae_kotlin_mvp_git.model.RepoModel
import com.example.tae_kotlin_mvp_git.network.RepoRequest
import com.example.tae_kotlin_mvp_git.network.RetrofitInstanceGit
import retrofit2.Call
import retrofit2.Response
import javax.security.auth.callback.Callback


class GitPresenter : BasePresenter<GitView>(){
    override fun onViewAttached(view: GitView) {
        super.onViewAttached(view)

        view.showLoading()

        val gitRequest = RetrofitInstanceGit().retrofitInstances.create(RepoRequest::class.java)
        val call = gitRequest.getRepo(ConstantsGit.USER)

        call.enqueue(object : retrofit2.Callback<List<RepoModel>>{
            override fun onFailure(call: Call<List<RepoModel>>, t: Throwable) {

            }

            override fun onResponse(call: Call<List<RepoModel>>, response: Response<List<RepoModel>>) {
                val res = response.body()
                Log.d("GITITEMS", res!![0].comments_url)
            }

        })
    }
}



interface GitView : BasePresenter.View{
    fun showLoading()
    fun showGit(repoModel: RepoModel)
}