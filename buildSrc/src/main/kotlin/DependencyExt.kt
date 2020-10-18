import org.gradle.api.artifacts.dsl.DependencyHandler
import org.gradle.kotlin.dsl.DependencyHandlerScope

fun DependencyHandlerScope.composeComponent() {
    implementation(Compose.ui)
    implementation(Compose.material)
    implementation(Compose.uiTooling)
}

private fun DependencyHandler.implementation(depName: String) =
    add("implementation", depName)

private fun DependencyHandler.kapt(depName: String) =
    add("kapt", depName)

private fun DependencyHandler.testImplementation(depName: String) =
    add("testImplementation", depName)
