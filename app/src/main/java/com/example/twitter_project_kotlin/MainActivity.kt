package com.example.twitter_project_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.twitter_project_kotlin.adapter.FeetAdapter
import com.example.twitter_project_kotlin.adapter.StoryAdapter
import com.example.twitter_project_kotlin.model.Post
import com.example.twitter_project_kotlin.model.Story

class MainActivity : AppCompatActivity() {

    lateinit var recyclerStory: RecyclerView
    lateinit var recyclerFeed: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
    }

    private fun initViews() {
        recyclerStory = findViewById(R.id.recyclerStory)
        recyclerFeed = findViewById(R.id.recyclerFeed)
        recyclerStory.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        recyclerFeed.layoutManager = GridLayoutManager(this,1)

        refreshPostAdapter(getAllPost())
        refreshStoryAdapter(getAllStory())
    }

    private fun getAllPost(): ArrayList<Post> {
        val feed : ArrayList<Post> = ArrayList()
         feed.add(Post("https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885_960_720.jpg","Murodjon Avazov","https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885_960_720.jpg"))
         feed.add(Post("https://i.pinimg.com/600x315/56/c4/c6/56c4c655ba4ce51def62cf46201e1891.jpg","Murodjon Avazov ","https://i.pinimg.com/600x315/56/c4/c6/56c4c655ba4ce51def62cf46201e1891.jpg"))
         feed.add(Post("https://i.pinimg.com/600x315/e1/db/2d/e1db2d96dcd4a1b9bf2d4eb4d141af99.jpg","Murodjon Avazov ","https://i.pinimg.com/600x315/e1/db/2d/e1db2d96dcd4a1b9bf2d4eb4d141af99.jpg"))
         feed.add(Post("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRiqdVPd0NaJgyuAMoeoKcOaXtWHn2w1unvsw&usqp=CAU","Murodjon Avazov ","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRiqdVPd0NaJgyuAMoeoKcOaXtWHn2w1unvsw&usqp=CAU"))
         feed.add(Post("https://gumlet.assettype.com/swarajya%2F2020-08%2Fbbb3ae0d-611b-42ab-8737-08550dab358e%2FEfQcSggXYAAU4Ov.jpg?q=75&auto=format%2Ccompress&w=1200","Murodjon Avazov ","https://gumlet.assettype.com/swarajya%2F2020-08%2Fbbb3ae0d-611b-42ab-8737-08550dab358e%2FEfQcSggXYAAU4Ov.jpg?q=75&auto=format%2Ccompress&w=1200"))
         feed.add(Post("https://ih1.redbubble.net/image.2739056193.9588/ur,mouse_pad_flatlay,square,600x600.jpg","Murodjon Avazov ","https://ih1.redbubble.net/image.2739056193.9588/ur,mouse_pad_flatlay,square,600x600.jpg"))

        return feed
    }

    private fun getAllStory(): ArrayList<Story> {
        val chats : ArrayList<Story> = ArrayList()
        chats.add(Story(R.drawable.img30,"Avazov"))
        chats.add(Story(R.drawable.img31,"Abdumajid"))
        chats.add(Story(R.drawable.img33,"Bek"))
        chats.add(Story(R.drawable.img42,"Bek"))
        chats.add(Story(R.drawable.img32,"Bek"))
        chats.add(Story(R.drawable.img42,"Bek"))
        chats.add(Story(R.drawable.img33,"Bek"))
        chats.add(Story(R.drawable.img30,"Bek"))
        chats.add(Story(R.drawable.img31,"Bek"))
        chats.add(Story(R.drawable.img30,"Bek"))
        chats.add(Story(R.drawable.img34,"Bek"))

        return chats
    }

    private fun refreshPostAdapter(feed: ArrayList<Post>) {
        val adapter = FeetAdapter(this,feed)
        recyclerFeed.adapter = adapter
    }

    private fun refreshStoryAdapter(chats: ArrayList<Story>) {
        val adapter = StoryAdapter(this,chats)
        recyclerStory.adapter = adapter
    }
}