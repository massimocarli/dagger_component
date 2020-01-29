package daggercomponent

import daggercomponent.di.CustomIOModule
import daggercomponent.di.DaggerAppComponent
import java.util.*

fun main() {
  DaggerAppComponent
    .builder()
    .customIOModule(CustomIOModule(Scanner(System.`in`)))
    .build()
    .app()
    .execute()
}