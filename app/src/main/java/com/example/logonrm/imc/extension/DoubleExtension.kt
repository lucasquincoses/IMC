package com.example.logonrm.imc.extension

/**
 * Created by logonrm on 02/03/2018.
 */
fun Double.format(i: Int) =
        java.lang.String.format("%.$(digits)f", this)!!