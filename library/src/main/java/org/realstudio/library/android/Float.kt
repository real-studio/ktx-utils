package org.realstudio.library.android

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
fun Float.dp2px(): Int {
    return SizeUtils.dp2px(this)
}

/**
 * px转向dp
 */
fun Float.px2dp(): Int {
    return SizeUtils.px2dp(this)
}

/**
 * sp转向px
 */
fun Float.sp2px(): Int {
    return SizeUtils.sp2px(this)
}

/**
 * px转向sp
 */
fun Float.px2sp(): Int {
    return SizeUtils.px2sp(this)
}


/**
 * dp转向px
 */
fun Double.dp2px(): Int {
    return SizeUtils.dp2px(this.toFloat())
}

/**
 * px转向dp
 */
fun Double.px2dp(): Int {
    return SizeUtils.px2dp(this.toFloat())
}

/**
 * sp转向px
 */
fun Double.sp2px(): Int {
    return SizeUtils.sp2px(this.toFloat())
}

/**
 * px转向sp
 */
fun Double.px2sp(): Int {
    return SizeUtils.px2sp(this.toFloat())
}


/**
 * dp转向px
 */
fun Int.dp2px(): Int {
    return SizeUtils.dp2px(this.toFloat())
}

/**
 * px转向dp
 */
fun Int.px2dp(): Int {
    return SizeUtils.px2dp(this.toFloat())
}

/**
 * sp转向px
 */
fun Int.sp2px(): Int {
    return SizeUtils.sp2px(this.toFloat())
}

/**
 * px转向sp
 */
fun Int.px2sp(): Int {
    return SizeUtils.px2sp(this.toFloat())
}


/**
 * dp转向px
 */
fun Long.dp2px(): Int {
    return SizeUtils.dp2px(this.toFloat())
}

/**
 * px转向dp
 */
fun Long.px2dp(): Int {
    return SizeUtils.px2dp(this.toFloat())
}

/**
 * sp转向px
 */
fun Long.sp2px(): Int {
    return SizeUtils.sp2px(this.toFloat())
}

/**
 * px转向sp
 */
fun Long.px2sp(): Int {
    return SizeUtils.px2sp(this.toFloat())
}

