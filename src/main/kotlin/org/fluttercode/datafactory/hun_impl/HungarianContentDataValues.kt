package org.fluttercode.datafactory.hun_impl

import org.fluttercode.datafactory.ContentDataValues

/*
 * Copyright 2011, Andrew M Gibson
 *
 * www.andygibson.net
 *
 * This file is part of DataFactory
 *
 * DataValve is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * DataFactory is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with DataFactory.  If not, see <http://www.gnu.org/licenses/>.
 *
 */
class HungarianContentDataValues : ContentDataValues {
    override val words: Array<String>
        get() = Companion.words

    override val businessTypes: Array<String>
        get() = Companion.businessTypes

    override val emailHosts: Array<String>
        get() = Companion.emailHosts

    override val tlds: Array<String>
        get() = Companion.tlds

    companion object {
        var words = arrayOf("dob", "labda", "sapka", "piros", "hordott",
                "lista", "szavak", "gép", "be", "ki", "forró", "hideg", "ugrik",
                "sepesség", "kapitány", "erőltet", "tart", "szoba", "hajó", "elveszett", "van",
                "tv", "műsor", "róla", "repülő", "zuhan", "sziget",
                "szörny", "fák", "paskol", "füst", "ahol", "vannak", "mi",
                "volt", "kérdezett", "nem", "megment", "elment", "épít", "tűz", "várt",
                "napok", "elmozdult", "oda", "barlangok", "talált", "val", "szellem", "apa",
                "ban", "fehér", "nyúl", "zár", "felfedezett", "val",
                "titkosan", "elrejtett", "az", "amíg", "próbál", "kinyitni",
                "azt", "amíg", "társ", "meghalt", "mint", "áldozat", "sziget",
                "követelt", "sok", "volt", "álmok", "vagy", "látomások", "többiek",
                "elment", "elvitt", "emberek", "ki", "vannak", "ők", "mi", "tenni",
                "ők", "akarnak", "fény", "jött", "keresztül", "ablak",
                "vezető", "is", "a", "jó", "ember", "számok", "egy", "szobában",
                "belép", "kulcsok", "gép", "vége", "a", "világ", "hallgat",
                "mágneses", "húz", "juhász", "mindig", "rossz", "sok",
                "nyomás", "mi", "be", "csinál", "amikor", "az", "végetér", "én", "fogok",
                "van", "be", "talál", "valami", "különben", "épít", "fal", "saját",
                "érdekeltség", "vagy", "ír", "sok", "kód", "talán", "politika",
                "automatikus", "kellett", "volna", "ez", "szöveg", "narancs",
                "létezik", "fog", "keres", "talál", "web", "vége", "rosszul", "könyvtár",
                "kezelt", "könyvek", "folyamatosan", "fülhallgató", "alma", "lázas", "rajt",
                "az", "buta", "ül", "fotel")
        private val businessTypes = arrayOf("Lakberendezés", "Pékség",
                "Könyvelés", "Textil", "Gyártás", "Industries",
                "Pro Services", "Kertészet", "Telek", "Utazás",
                "Orvosi eszközök", "Irodaszerek", "Biztosítás", "Szoftver",
                "Motors", "Kávézó", "Szolgáltatások", "Tornaterem", "Motoros szolgáltatások",
                "Signs", "Fejlesztés", "Studió", "Engineering")
        private val emailHosts = arrayOf("gma1l", "hotma1l", "yah00",
                "somema1l", "everyma1l", "ma1lbox", "b1zmail", "ma1l2u")
        private val tlds = arrayOf("org", "net", "com", "biz", "us", "co.uk", "hu")
    }
}