import org.w3c.dom.MessageChannel
import org.w3c.dom.MessageEvent
import kotlin.browser.window

fun configureChannel() {
    val channel = MessageChannel()
    var jsPortOne = channel.port1
    var jsPortTwo = channel.port2

    window.addEventListener("message", {
    }, false)

    jsPortOne.addEventListener("message", {
        window.alert((it as MessageEvent).data.toString())
    }, false)

    jsPortTwo.addEventListener("message", {
        window.alert((it as MessageEvent).data.toString())
    }, false)

    jsPortOne.start()
    jsPortTwo.start()
}