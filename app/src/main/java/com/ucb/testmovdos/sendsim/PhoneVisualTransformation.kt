import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.input.OffsetMapping
import androidx.compose.ui.text.input.TransformedText
import androidx.compose.ui.text.input.VisualTransformation

class PhoneVisualTransformation : VisualTransformation {
    override fun filter(text: AnnotatedString): TransformedText {
        val trimmed = text.text.take(8)

        val formatted = trimmed.chunked(3).joinToString(" ")

        return TransformedText(AnnotatedString(formatted), OffsetMapping.Identity)
    }
}
