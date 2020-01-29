package daggercomponent.di

import dagger.Module
import dagger.Provides
import daggercomponent.IntReader
import daggercomponent.StdIOIntReader
import java.util.*

@Module
class BuilderIOModule() {

  @Provides
  fun intReader(scanner: Scanner): IntReader = StdIOIntReader(scanner)
}