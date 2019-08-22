package com.example.tae_kotlin_mvp_git.network


import com.example.tae_kotlin_mvp_git.model.RepoModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path


interface RepoRequest {
    @GET ("users/{user}/repos")

    //this is a list
    fun getRepo(@Path("user") user: String):Call<List<RepoModel>>
}