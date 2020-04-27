package org.fluttercode.datafactory.hun_impl

import org.fluttercode.datafactory.AddressDataValues
import org.fluttercode.datafactory.ContentDataValues
import org.fluttercode.datafactory.NameDataValues
import org.fluttercode.datafactory.impl.DataFactory
import java.util.*

class DataFactoryHungarian private constructor(random: Random) : DataFactory(random) {
    override var nameDataValues: NameDataValues = HungarianNameDataValues()
    override var addressDataValues: AddressDataValues = HungarianAddressDataValues()
    override var contentDataValues: ContentDataValues = HungarianContentDataValues()

    constructor() : this(DataFactory.original_random) {
    }

    companion object {
        fun create(): DataFactoryHungarian {
            return DataFactoryHungarian()
        }

        fun create(seed: Long): DataFactoryHungarian {
            return DataFactoryHungarian(Random(seed))
        }
    }
}