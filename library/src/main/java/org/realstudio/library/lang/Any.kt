package org.realstudio.library.lang

import com.blankj.utilcode.util.ObjectUtils


/**
 * @author         yanjie
 * @date           2019-10-28 00:25
 * @version        1.0
 */

/**
 * @author         yanjie
 * @date           2019-10-23 17:23
 * @version        1.0
 * @description
 */

/**
 * 判断对象是否为空
 */
fun <T> T.isEmpty(): Boolean {
    return ObjectUtils.isEmpty(this)
}

/**
 * 判断对象是否为空
 */
fun <T> T.isNotEmpty(): Boolean {
    return ObjectUtils.isNotEmpty(this)
}

/**
 * 判断对象为空
 */
inline fun <T> T.isEmpty(block: T.() -> Unit): T {
    if (ObjectUtils.isEmpty(this)) {
        block()
    }
    return this
}


/**
 * 判断对象不为空
 */
inline fun <T> T.isNotEmpty(block: T.() -> Unit): T {
    if (ObjectUtils.isNotEmpty(this)) {
        block()
    }
    return this
}
