package com.example.testapp

import kotlin.random.Random

//Определите количество элементов в списке, которые отличаются от среднего на 5

class Logic {

    var numbers: List<Int> = listOf()

    init {
        updateNumbers()
    }

    fun updateNumbers(){
        numbers = List(20){ Random.nextInt(1, 20) }
    }

    fun numOfElem(): Int {

        return numbers
            .filter{ value  -> (value == numbers.average().toInt() + 5 )  || (value == numbers.average().toInt() - 5)}
            .size

    }

}