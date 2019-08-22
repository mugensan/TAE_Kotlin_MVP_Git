//package com.example.tae_kotlin_mvp_git.view
//
//import android.view.View
//import android.view.ViewGroup
//import androidx.recyclerview.widget.RecyclerView
//import com.example.tae_kotlin_mvp_git.R
//import com.example.tae_kotlin_mvp_git.model.RepoModel
//import kotlinx.android.synthetic.main.cardviewlayout.view.*
//
////package com.example.tae_kotlin_mvp_git.view
////
//
//
////in the adapter you have a constructor
//class GitAdapter(
//    private val repoModel: List<RepoModel>,
//    onGitClickListener: Any?
//) :
//    RecyclerView.Adapter<GitAdapter.GitViewHolder>() {
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GitViewHolder {
//        return GitViewHolder(parent.inflate(R.layout.cardviewlayout, false))
//    }
//
//
//    override fun getItemCount(): Int {
//        return repoModel.size
//    }
//
//    override fun onBindViewHolder(holder: GitViewHolder, position: Int) {
//        holder.title.text = repoModel[position].commits_url
////            holder.rv_data_display_git = repoModel[position].id.toString()
//    }
//}
//
//
//
//
