import kotlin.test.*

import kotlinx.serialization.*
import kotlinx.serialization.json.*

@Test
fun smokeTest() {
    assertEquals(4, 2 + 2)
}

@Test
fun serialization() {
    val serializer = SimpleData.serializer()
    val data = SimpleData("foo", 42)
    val json = JSON.stringify(serializer, data)
    println(json)
    val restoredData = JSON.parse(serializer, json)
    assertEquals(data, restoredData)
}
