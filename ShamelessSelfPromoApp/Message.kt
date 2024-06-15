package com.hayleydodkins.shamlessselfpromoapp

import java.io.Serializable

class Message(val contactName : String, val contactNumber : String, val displayName : String, val startDate : String, val junior : Boolean, val immidiateStart : Boolean, val jobTitle : String )
    : Serializable {

    //Objects can be persisted through serialization
    fun getJobDescription() : String = if(junior) "a Junior $jobTitle" else "a $jobTitle"

    fun getAvailability() : String = if(immidiateStart) "immediately" else "from $startDate"

}