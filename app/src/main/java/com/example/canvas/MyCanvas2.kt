package com.example.canvas

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.RectF
import android.view.View

class MyCanvas2(context: Context):View(context) {

    var fillPaint = Paint()
    var strokePaint = Paint()

    var r = RectF(30f, 30f, 1000f, 500f)

    fun initPaints() {

        // fill
        fillPaint.style = Paint.Style.FILL
        fillPaint.color = Color.YELLOW

        // stroke
        strokePaint.style = Paint.Style.STROKE
        strokePaint.color = Color.YELLOW
        strokePaint.strokeWidth = 10f
    }

    override fun onDraw(canvas: Canvas):Unit {

        // Second rectangle
        val cornerRadius = 50
        canvas.drawRoundRect(r, cornerRadius.toFloat(), cornerRadius.toFloat(), fillPaint) // fill
        canvas.drawRoundRect(r, cornerRadius.toFloat(), cornerRadius.toFloat(), strokePaint) // stroke



    }

}