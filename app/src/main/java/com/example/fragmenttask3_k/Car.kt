package com.example.fragmenttask3_k

class Car(s: String, s1: String, s2: String, s3: String) {
    private var make: String? = null
    private var model: String? = null
    private var ownerName: String? = null
    private var ownerTel: String? = null

    fun Car(make: String?, model: String?, ownerName: String?, ownerTel: String?) {
        this.make = make
        this.model = model
        this.ownerName = ownerName
        this.ownerTel = ownerTel
    }
    fun getMake(): String? {
        return make
    }

    fun setMake(make: String?) {
        this.make = make
    }

    fun getModel(): String? {
        return model
    }

    fun setModel(model: String?) {
        this.model = model
    }

    fun getOwnerName(): String? {
        return ownerName
    }

    fun setOwnerName(ownerName: String?) {
        this.ownerName = ownerName
    }

    fun getOwnerTel(): String? {
        return ownerTel
    }

    fun setOwnerTel(ownerTel: String?) {
        this.ownerTel = ownerTel
    }

}