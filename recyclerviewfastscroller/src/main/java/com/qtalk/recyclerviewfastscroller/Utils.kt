package com.qtalk.recyclerviewfastscroller

import android.content.Context
import android.widget.RelativeLayout

fun isRTL(context: Context): Boolean =
    context.resources.configuration.layoutDirection == RelativeLayout.LAYOUT_DIRECTION_RTL
