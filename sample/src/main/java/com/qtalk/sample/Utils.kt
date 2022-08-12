package com.qtalk.sample

import android.graphics.drawable.GradientDrawable

object Utils {
    fun drawRectDrawable(
        backgroundColor: Int = -1,
        borderColor: Int = -1,
        borderWidth: Int = -1,
        corner: Float
    ): GradientDrawable {
        return GradientDrawable().apply {
            shape = GradientDrawable.RECTANGLE
            cornerRadii =
                floatArrayOf(corner, corner, corner, corner, corner, corner, corner, corner)
            if (backgroundColor != -1) setColor(backgroundColor)
            if (borderWidth != -1 && borderColor != -1) {
                setStroke(borderWidth, borderColor)
            } else if (borderColor != -1) {
                setStroke(3, borderColor)
            }
        }
    }
}