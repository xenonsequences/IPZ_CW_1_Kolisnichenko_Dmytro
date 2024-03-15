package ua.edu.lntu.cw_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val photo = findViewById<ImageView>(R.id.photo)
        val drawable = resources.getDrawable(R.drawable.profile_picture, null)
        photo.setImageDrawable(drawable)

        val name = findViewById<TextView>(R.id.name)
        name.text = "Kolisnichenko Dmytro"

        val position = findViewById<TextView>(R.id.position)
        position.text = "Android Developer"

        val phoneNumber = findViewById<TextView>(R.id.phone_number)
        phoneNumber.text = "+380 (95) 777 777"

        val email = findViewById<TextView>(R.id.email)
        email.text = "xenonsequences@gmail.com"

        val socialNetworkTag = findViewById<TextView>(R.id.social_network_tag)
        socialNetworkTag.text = "#telegramusername"
    }
}