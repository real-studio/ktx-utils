package org.realstudio.library.activity

import android.app.Activity
import com.blankj.utilcode.util.ActivityUtils


/**
 * @author         yanjie
 * @date           2019-10-28 15:31
 * @version        1.0
 * @description
 */

/**
 * 是否还存活
 */
fun Activity.isAlive() {
    ActivityUtils.isActivityAlive(this)
}