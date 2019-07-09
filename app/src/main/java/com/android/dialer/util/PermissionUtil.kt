package com.android.dialer.util

import android.Manifest
import androidx.fragment.app.FragmentActivity
import com.kotlinpermissions.KotlinPermissions

fun requestPermissions(act: FragmentActivity) {

    KotlinPermissions.with(act) // where this is an FragmentActivity instance
        .permissions(
            Manifest.permission.READ_CALL_LOG,
            Manifest.permission.WRITE_CALL_LOG
        )
        .onAccepted { permissions ->
            //List of accepted permissions
        }
        .onDenied { permissions ->
            //List of denied permissions
        }
        .onForeverDenied { permissions ->
            //List of forever denied permissions
        }
        .ask()
}