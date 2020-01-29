package daggercomponent.di

import dagger.Binds
import dagger.Module
import daggercomponent.Calculator
import daggercomponent.CalculatorImpl

@Module
abstract class CalculatorModule {

  @Binds
  abstract fun calculator(calc: CalculatorImpl): Calculator
}