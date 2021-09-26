import kotlinx.serialization.Serializable

@Serializable
abstract class LazyReference {
    private var targetID: String? = null
    abstract var target: String?
}