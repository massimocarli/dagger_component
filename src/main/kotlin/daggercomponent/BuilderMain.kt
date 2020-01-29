package daggercomponent

import daggercomponent.di.DaggerBuilderComponent
import java.util.*

fun main() {
  DaggerBuilderComponent
    .builder()
    .scanner(Scanner(System.`in`))
    .build()
    .app()
    .execute()
}