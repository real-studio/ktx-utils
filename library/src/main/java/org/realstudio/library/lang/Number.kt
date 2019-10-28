package org.realstudio.library.lang

import com.blankj.utilcode.util.SizeUtils


/**
 * @author         yanjie
 * @date           2019-10-28 16:04
 * @version        1.0
 * @description
 */

/**
 * dp转向px
 */
fun Number.dp2px(): Int {
    return when (this) {
        is Int -> SizeUtils.dp2px(this.toFloat())
        is Long -> SizeUtils.dp2px(this.toFloat())
        is Double -> SizeUtils.dp2px(this.toFloat())
        is Float -> SizeUtils.dp2px(this)
        else -> 0
    }
}

/**
 * px转向dp
 */
fun Number.px2dp(): Int {
    return when (this) {
        is Int -> SizeUtils.px2dp(this.toFloat())
        is Long -> SizeUtils.px2dp(this.toFloat())
        is Double -> SizeUtils.px2dp(this.toFloat())
        is Float -> SizeUtils.px2dp(this)
        else -> 0
    }
}

/**
 * sp转向px
 */
fun Number.sp2px(): Int {
    return when (this) {
        is Int -> SizeUtils.sp2px(this.toFloat())
        is Long -> SizeUtils.sp2px(this.toFloat())
        is Double -> SizeUtils.sp2px(this.toFloat())
        is Float -> SizeUtils.sp2px(this)
        else -> 0
    }
}

/**
 * px转向sp
 */
fun Number.px2sp(): Int {
    return when (this) {
        is Int -> SizeUtils.px2sp(this.toFloat())
        is Long -> SizeUtils.px2sp(this.toFloat())
        is Double -> SizeUtils.px2sp(this.toFloat())
        is Float -> SizeUtils.px2sp(this)
        else -> 0
    }
}