package com.example.s16005532.gestionnavire.model

 class Port {

     private var name: String
     private var longitude: Double
     private var latitude: Double

     constructor(name: String, longitude: Double, latitude: Double) {

         this.name = name
         this.longitude = longitude
         this.latitude = latitude

     }

     fun getName(): String {

         return this.name

     }

    fun getCoordonne(): Array<Double> {

        return arrayOf(this.longitude,this.latitude)

    }


}