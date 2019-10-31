package org.realstudio.ktxutils

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import org.realstudio.library.lang.isEmpty
import org.realstudio.library.lang.isNotEmpty

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sendGod(view: View) {
//        var powerBean: PowerBean = PowerBean(1, 2, 3, 4)
        var powerBean: PowerBean? = null
        powerBean.isEmpty {
            Toast.makeText(this@MainActivity, "空空空空空空空空", Toast.LENGTH_LONG).show()
            powerBean = PowerBean(1, 2, 3, 4)

        }.isNotEmpty {
            Toast.makeText(this@MainActivity, "不不不不不不不不", Toast.LENGTH_LONG).show()
        }
    }
}
