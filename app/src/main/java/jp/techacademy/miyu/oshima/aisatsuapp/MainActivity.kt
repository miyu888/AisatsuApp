package jp.techacademy.miyu.oshima.aisatsuapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.app.TimePickerDialog


class MainActivity : AppCompatActivity(),View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener(this)
    }

    override fun onClick(v:View){
        if(v.id == R.id.button){
            showTimePickerDialog()
        }
    }

    private fun showTimePickerDialog(){

        val timePickerDialog = TimePickerDialog(
            this,
            TimePickerDialog.OnTimeSetListener{view, hour, minute ->
                if(hour >= 2 && hour <= 9){
                Log.d("UI_PARTS","おはようございます")
                    textView.text = "おはようございます"
            }else if(hour >= 10 && hour <= 17){
                    Log.d("UI_PARTS", "こんにちは")
                    textView.text = "こんにちは"
                }else{
                    Log.d("UI_PARTS","こんばんは")
                    textView.text = "こんばんは"
                }
                Log.d("UI_PARTS", "$hour:$minute")
            },
        13,0,true)
        timePickerDialog.show()

        }
}

