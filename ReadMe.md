### Reproducer for [kotlinx.serialization issue 1123](https://github.com/Kotlin/kotlinx.serialization/issues/1123)

To reproduce, run:

```
gradlew clean compileProductionExecutableKotlinJs
```

Result:
```
java.lang.IllegalStateException: Not found Idx for public /LazyReference|null[0]
	at org.jetbrains.kotlin.backend.common.serialization.IrFileDeserializer.loadTopLevelDeclarationProto(IrFileDeserializer.kt:48)
	at org.jetbrains.kotlin.backend.common.serialization.IrFileDeserializer.deserializeDeclaration(IrFileDeserializer.kt:39)
	[...]
```

#### Notes

* Any of these actions will make the error disappear:
    1. Putting the two classes into a common source file.
    2. Changing the visibility of `LazyReference.targetID` from `private` to `public`.
    3. Changing the Kotlin plugins to version `1.6.0-M1`.

