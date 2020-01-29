package daggercomponent.di

import dagger.BindsInstance
import dagger.Component
import daggercomponent.Application
import java.util.*

@Component(modules = arrayOf(CalculatorModule::class, BuilderIOModule::class))
interface BuilderComponent {

  fun app(): Application

  @Component.Builder
  interface Builder {
    @BindsInstance
    fun scanner(scanner: Scanner): Builder

    fun build(): BuilderComponent
  }
}