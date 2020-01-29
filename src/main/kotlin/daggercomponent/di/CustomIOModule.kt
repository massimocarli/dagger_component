package daggercomponent.di

import dagger.Module
import dagger.Provides
import daggercomponent.IntReader
import daggercomponent.StdIOIntReader
import java.util.*

@Module
class CustomIOModule(val scanner: Scanner) {

  @Provides
  fun intReader(): IntReader = StdIOIntReader(scanner)
}