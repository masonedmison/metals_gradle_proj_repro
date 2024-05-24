## Reproduction of Java gradle project making it such that metals can't find a build source

Metals versions effected seem to be > 1.X
Able to reproduce with both JDK17 and 21.

When _both_ a `build.gradle` and `settings.gradle` are present, metals is unable to find a build target.