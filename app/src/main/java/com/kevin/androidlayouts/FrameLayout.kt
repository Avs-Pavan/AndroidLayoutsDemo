package com.kevin.androidlayouts

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.kevin.androidlayouts.databinding.ActivityFrameLayoutBinding
import com.kevin.androidlayouts.databinding.ActivityMainBinding
import kotlin.math.log

class FrameLayout : AppCompatActivity() {
    private val binding by lazy {
        ActivityFrameLayoutBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        initViews()
    }

    private fun initViews() {
        binding.video.setVideoURI(Uri.parse("http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4"))

        binding.play.setOnClickListener {
            Log.e("--","clicked")
            binding.video.requestFocus()
            binding.video.start()
        }
    }
}