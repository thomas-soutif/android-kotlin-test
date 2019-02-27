package com.example.s16005532.gestionnavire

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.example.s16005532.gestionnavire.model.Port

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        start(this.findViewById(android.R.id.content))

    }

    fun start(view: View){
        val port = Port("bat1",0.1212,1.121)
        val textPort = findViewById<TextView>(R.id.portView)
        //var coordonne: Double = 0.0;
        //for(i in port.getCoordonne())
          //  coordonne = coordonne.plus(';').plus((port.getCoordonne()[i].toDouble())
                textPort.setText(port.getCoordonne()[0].toString())

    }
}
