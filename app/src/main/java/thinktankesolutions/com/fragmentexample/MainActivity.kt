package thinktankesolutions.com.fragmentexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstFragment = Alpha()
        val secondFragment = Beta()

        val btnFrag1: Button = findViewById(R.id.btnFrag1)
        btnFrag1.setOnClickListener{
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flFrag, firstFragment)
                commit()
            }
        }

        val btnFrag2: Button = findViewById(R.id.btnFrag2)
        btnFrag2.setOnClickListener{
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flFrag, secondFragment)
                commit()
            }
        }
    }


}