package daggercomponent

import daggercomponent.di.DaggerFactoryComponent
import java.util.*

fun main() {
  DaggerFactoryComponent
    .factory()
    .create(Scanner(System.`in`))
    .app()
    .execute()
}