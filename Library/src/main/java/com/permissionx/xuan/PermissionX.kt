package com.permissionx.xuan

import androidx.fragment.app.FragmentActivity

object PermissionX {

    private const val TAG = "InvisibleFragment"

    //FragmentActivity是AppCompatActivity的父类
    fun request(activity: FragmentActivity, vararg permissions: String, callback: PermissionCallback) {
        val fragmentManager = activity.supportFragmentManager
        val existedFragment = fragmentManager.findFragmentByTag(TAG)
        val fragment = if (existedFragment != null) {
            existedFragment as InvisibleFragment
        } else {
            val invisibleFragment = InvisibleFragment()
            //不能调用commit()方法,因为该方法不会立即执行添加操作,因而无法保证下一行代码执行时该碎片已经被添加
            fragmentManager.beginTransaction().add(invisibleFragment, TAG).commitNow()
            invisibleFragment
        }
        //*表示将一个数组转换成可变长度参数
        fragment.requestNow(callback, *permissions)
    }
}