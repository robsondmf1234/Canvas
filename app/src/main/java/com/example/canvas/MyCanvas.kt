package com.example.canvas

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.RectF
import android.view.View

class MyCanvas(context: Context):View(context) {

    var fillPaint = Paint()
    var strokePaint = Paint()

    var r = RectF(30f, 30f, 1000f, 1000f)

    fun initPaints() {

        // fill
        fillPaint.style = Paint.Style.FILL
        fillPaint.color = Color.YELLOW

        // stroke
        strokePaint.style = Paint.Style.STROKE
        strokePaint.color = Color.BLACK
        strokePaint.strokeWidth = 30f
    }

    override fun onDraw(canvas: Canvas):Unit {

        // First rectangle
        canvas.drawRect(r, fillPaint) // fill
        canvas.drawRect(r, strokePaint) // stroke
        canvas.translate(0f, 600f)

    }

}