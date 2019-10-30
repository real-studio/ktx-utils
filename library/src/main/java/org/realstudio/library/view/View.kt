package org.realstudio.library.view

import android.view.View

/**
 * @author         yanjie
 * @date           2019-10-28 00:00
 * @version        1.0
 */

/**
 * view是否隐藏
 */
fun View.visible(visible: Boolean) {
    this.visibility = if (visible) View.VISIBLE else View.GONE
}


/**
 * view是否显示
 */
fun View.invisible(visible: Boolean) {
    this.visibility = if (visible) View.VISIBLE else View.INVISIBLE
}

