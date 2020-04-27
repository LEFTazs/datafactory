package org.fluttercode.datafactory.impl

import org.fluttercode.datafactory.hun_impl.DataFactoryHungarian
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class DataFactoryHungarianTextTest: DataFactoryTextTest() {
    private lateinit var dataFactory: DataFactoryHungarian
    private val ITERATION_COUNT = 100000

    @Before
    override fun initTest() {
        dataFactory = DataFactoryHungarian.create()
        super.initTest()
    }
}