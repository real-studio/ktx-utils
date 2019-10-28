package org.realstudio.library.lang

import com.blankj.utilcode.util.ObjectUtils


/**
 * @author         yanjie
 * @date           2019-10-28 00:25
 * @version        1.0
 */

/**
 * 判断对象为空
 */
fun Any?.isEmpyt(){
    ObjectUtils.isEmpty(this)
}


/**
 * 判断对象不为空
 */
fun Any?.isNotEmpyt(){
    ObjectUtils.isNotEmpty(this)
}

