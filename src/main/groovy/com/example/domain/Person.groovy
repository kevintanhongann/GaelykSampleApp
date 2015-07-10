package com.example.domain

import groovy.transform.ToString
import groovyx.gaelyk.datastore.Entity
import groovyx.gaelyk.datastore.Unindexed

/**
 * Created by kevintanhongann on 7/9/15.
 */
@ToString
@Entity(unindexed = false)
class Person {

    String name

    @Unindexed
    String tagline

    String email

}
