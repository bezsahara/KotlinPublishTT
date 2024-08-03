package com.korol.pckg

class Info {
    fun stuff(add: String): String {
        return "Added: $add"
    }

    fun printStuff(add: String) {
        println(stuff(add))
    }
}