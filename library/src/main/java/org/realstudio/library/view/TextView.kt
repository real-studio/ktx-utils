package org.realstudio.library.view


/**
 * @author         yanjie
 * @date           2019-10-31 22:48
 * @version        1.0
 */

import android.text.Editable
import android.text.TextWatcher
import android.widget.TextView

inline fun TextView.afterTextChanged(crossinline action: (s: Editable?) -> Unit) =
    addTextChangedListener(afterTextChanged = action)


inline fun TextView.beforeTextChanged(crossinline action: (s: CharSequence?, start: Int, count: Int, after: Int) -> Unit) =
    addTextChangedListener(beforeTextChanged = action)


inline fun TextView.onTextChanged(crossinline action: (s: CharSequence?, start: Int, before: Int, count: Int) -> Unit) =
    addTextChangedListener(onTextChanged = action)


inline fun TextView.addTextChangedListener(
    crossinline afterTextChanged: (s: Editable?) -> Unit = {},
    crossinline beforeTextChanged: (s: CharSequence?, start: Int, count: Int, after: Int) -> Unit = { _, _, _, _ -> },
    crossinline onTextChanged: (s: CharSequence?, start: Int, before: Int, count: Int) -> Unit = { _, _, _, _ -> }
): TextWatcher {
    val listener = object : TextWatcher {
        override fun afterTextChanged(s: Editable?) = afterTextChanged(s)

        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) =
            beforeTextChanged(s, start, count, after)

        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) =
            onTextChanged(s, start, before, count)
    }
    addTextChangedListener(listener)
    return listener
}
