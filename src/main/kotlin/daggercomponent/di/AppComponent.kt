package daggercomponent.di

import dagger.Component
import daggercomponent.Application

//@Component(modules = arrayOf(CalculatorModule::class, IOModule::class))
@Component(modules = arrayOf(CalculatorModule::class, CustomIOModule::class))
interface AppComponent {

  fun app(): Application
}