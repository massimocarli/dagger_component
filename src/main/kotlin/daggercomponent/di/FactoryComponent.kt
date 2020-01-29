package daggercomponent.di

import dagger.BindsInstance
import dagger.Component
import daggercomponent.Application
import java.util.*

@Component(modules = arrayOf(CalculatorModule::class, BuilderIOModule::class))
interface FactoryComponent {

  fun app(): Application

  @Component.Factory
  interface Factory {

    fun create(@BindsInstance scanner: Scanner): FactoryComponent
  }
}