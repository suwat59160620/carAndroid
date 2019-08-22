package buu.informatics.s59160620.carparking

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import buu.informatics.s59160620.carparking.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val parking: ArrayList<Space> = ArrayList<Space>()
    private lateinit var binding: ActivityMainBinding

    var btn123:Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding.apply {
            btn_one.setBackgroundColor(Color.RED)
            btn_two.setBackgroundColor(Color.RED)
            btn_three.setBackgroundColor(Color.RED)

            btn_one.setOnClickListener {
                btn123 = 1;
                useSlot1()

            }
        }
    }

    private fun Init() {
        binding.apply {
            val Space: Space = Space("","","")
            val Space2: Space2 = Space2("","","")
            val Space3: Space3 = Space3("","","")
            binding.space = Space
            binding.space2 = Space2
            binding.space3 = Space3

        }
    }


    private fun useSlot1() {

        binding.apply {
            editTextBrand.visibility = View.VISIBLE
            editTextLicense.visibility = View.VISIBLE
            editTextName.visibility = View.VISIBLE

            editTextBrand2.visibility = View.GONE
            editTextLicense2.visibility = View.GONE
            editTextName2.visibility = View.GONE

            editTextBrand3.visibility = View.GONE
            editTextLicense3.visibility = View.GONE
            editTextName3.visibility = View.GONE
        }
    }

}
