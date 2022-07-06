package dev.waceramercythird.mytwitter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import dev.waceramercythird.mytwitter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displayContacts()
    }
    fun displayContacts(){
        var tweet = Twitter("Pauline","@Pauline2","f you had to pick one streaming service as your source of entertainment for the rest of year, which would it be?",7,89,23)
        var tweet1 = Twitter("Mercy","@Mercy5","Think beyond crypto! Explore the fundamentals of blockchain for business in this guide",123,78,65)
        var tweet2 = Twitter("Christine","@Christline9"," i can't just but help to waste my vote on you. My entire family (nuclear and extended) votes are yours. Am convinced hearing you this morning. You just made my day",34,98,12)
        var tweet3 = Twitter("Chloe","@Chloe1","You might not know me in real life but I beg you to please remember this tweet and pray for my mom who was diagnosed of inflammation as a result of breast cancer she had over 20 years ago. She's been down. But better now.",3,23,34)
        var tweet4 = Twitter("Joan","@Joan","Meet Adrian Ledda, who explains how his love for making great games goes with a drive for building safe and supportive communities.",23,56,67)
        var tweet5 = Twitter("Cate","@Cate7","She ain't using GitHub because she is scared of committing",87,92,54)
        var tweet6 = Twitter("Purity","@Purity7","She ain't using GitHub because she is scared of committing",90,89,45)



        var tweetList = listOf(tweet,tweet1,tweet2,tweet3,tweet4,tweet5)
        var tweetAdapter = TweetsRvAdapter(tweetList)
        binding.rvTwitt.layoutManager= LinearLayoutManager(this)
        binding.rvTwitt.adapter  = tweetAdapter

    }
}