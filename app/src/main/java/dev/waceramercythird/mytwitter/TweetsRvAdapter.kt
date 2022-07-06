package dev.waceramercythird.mytwitter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TweetsRvAdapter(var tweetList: List<Twitter>): RecyclerView.Adapter<TwitterViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TwitterViewHolder {
        var itemsView = LayoutInflater.from(parent.context)
            .inflate(R.layout.twitt_list_item, parent, false)
        return TwitterViewHolder(itemsView)
    }

    override fun onBindViewHolder(holder: TwitterViewHolder, position: Int) {
        var currentTwitter = tweetList.get(position)
        holder.tvName.text = currentTwitter.name
        holder.tvNumber.text = currentTwitter.userName
        holder.tvpost.text = currentTwitter.tweet
        holder.tvReplay.text = currentTwitter.replay.toString()
        holder.tvRetweet.text = currentTwitter.retweet.toString()
        holder.tvLike.text = currentTwitter.like.toString()
    }

    override fun getItemCount(): Int {
        return tweetList.size
    }
}
class TwitterViewHolder (itemsView: View): RecyclerView.ViewHolder(itemsView) {
    var tvName = itemsView.findViewById<TextView>(R.id.tvName1)
    var tvNumber = itemsView.findViewById<TextView>(R.id.tvUserName)
    var tvpost = itemsView.findViewById<TextView>(R.id.tvPost)
    var tvReplay = itemsView.findViewById<TextView>(R.id.tvReplay)
    var tvRetweet = itemsView.findViewById<TextView>(R.id.tvRetweet)
    var tvLike = itemsView.findViewById<TextView>(R.id.tvLike)
    var imgTwit = itemsView.findViewById<ImageView>(R.id.imgTwit)
    var imgTweet = itemsView.findViewById<ImageView>(R.id.imgTweet)
    var imgRetweet = itemsView.findViewById<ImageView>(R.id.imgRetweet)
    var imgList = itemsView.findViewById<ImageView>(R.id.imgLike)


}
