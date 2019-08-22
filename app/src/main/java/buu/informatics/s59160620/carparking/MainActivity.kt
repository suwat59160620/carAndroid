package buu.informatics.s59160620.carparking

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
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

            btn_two.setOnClickListener {
                btn123 = 2;
                useSlot2()

            }

            btn_three.setOnClickListener {
                btn123 = 3;
                useSlot3()

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
            license_plate.visibility = View.VISIBLE
            barnd.visibility = View.VISIBLE
            name.visibility = View.VISIBLE

            license_plate2.visibility = View.GONE
            barnd2.visibility = View.GONE
            name2.visibility = View.GONE

            license_plate3.visibility = View.GONE
            barnd3.visibility = View.GONE
            name3.visibility = View.GONE
        }
    }

    private fun useSlot2() {

        binding.apply {
            license_plate.visibility = View.GONE
            barnd.visibility = View.GONE
            name.visibility = View.GONE

            license_plate2.visibility = View.VISIBLE
            barnd2.visibility = View.VISIBLE
            name2.visibility = View.VISIBLE

            license_plate3.visibility = View.GONE
            barnd3.visibility = View.GONE
            name3.visibility = View.GONE
        }
    }

    private fun useSlot3() {

        binding.apply {
            license_plate.visibility = View.GONE
            barnd.visibility = View.GONE
            name.visibility = View.GONE

            license_plate2.visibility = View.GONE
            barnd2.visibility = View.GONE
            name2.visibility = View.GONE

            license_plate3.visibility = View.VISIBLE
            barnd3.visibility = View.VISIBLE
            name3.visibility = View.VISIBLE
        }
    }

}
