package daggercomponent.di

import dagger.Module
import dagger.Provides
import daggercomponent.IntReader
import daggercomponent.StdIOIntReader
import java.util.*

@Module
class IOModule {

  @Provides
  fun provideScanner() = Scanner(System.`in`)

  @Provides
  fun intReader(scanner: Scanner): IntReader = StdIOIntReader(scanner)
}