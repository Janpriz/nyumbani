package com.dang.nyumbaniapp.model

import android.location.Location

class Product{
    var name:String=""
    var Location:String=""
    var price:String=""
    var id:String=""

    constructor(name:String,quantity:String,price:String,id:String){
        this.name=name
        this.Location=quantity
        this.price=price
        this.id=id

    }
    constructor()
}