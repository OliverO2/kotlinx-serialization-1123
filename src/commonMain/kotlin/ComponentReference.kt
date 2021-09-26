import kotlinx.serialization.Serializable

@Serializable
class ComponentReference : LazyReference() {
    override var target: String? = null
}