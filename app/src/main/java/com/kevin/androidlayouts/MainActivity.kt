package com.kevin.androidlayouts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kevin.androidlayouts.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val mainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(mainBinding.root)
        initViews()
    }

    private fun initViews() {
        mainBinding.linearBtn.setOnClickListener {
            val intent = Intent(this, LinearLayout::class.java)
            startActivity(intent)
        }

        mainBinding.linearAssignmentBtn.setOnClickListener {
            val intent = Intent(this, LinearAssignment::class.java)
            startActivity(intent)
        }

        mainBinding.relativeBtn.setOnClickListener {
            val intent = Intent(this, RelativeLayout::class.java)
            startActivity(intent)
        }

        mainBinding.relativeAssignmentBtn.setOnClickListener {
            val intent = Intent(this, RelativeAssignment::class.java)
            startActivity(intent)
        }
    }
}