import com.soywiz.klock.TimeSpan
import com.soywiz.korau.sound.AudioTone
import com.soywiz.korau.sound.toSound
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main(args: Array<String>) {
    runBlocking {
        val tone = AudioTone.generate(TimeSpan(200.0), 500.0).toSound()
        while (true) {
            tone.play()
            delay(1000)
        }
    }
}