package com.example.canvas

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.animation.PropertyValuesHolder
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Rect
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    lateinit var myCanvas : MyCanvas
    lateinit var myCanvas2 : MyCanvas2
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rect:Rect
        myCanvas = MyCanvas(this)
        setContentView(myCanvas)


        fun fadeInFadeOutAnimation():ObjectAnimator{

            val fadeIn = PropertyValuesHolder.ofFloat("alpha",0.0f,1.0f)
            val fadeOut: PropertyValuesHolder = PropertyValuesHolder.ofFloat("alpha",1.0f,0.0f)
            val scaleAnimation = ObjectAnimator.ofPropertyValuesHolder(myCanvas,fadeIn,fadeOut).apply {
                duration = 6000
            }
            return scaleAnimation
        }

        fun fadeInAnimation(): ObjectAnimator {

            val animacao2 = ObjectAnimator.ofFloat(myCanvas, "alpha", 0.0f, 1.0f).apply {
                duration = 6000
            }
            return animacao2
        }
        fun fadeOutAnimation(): ObjectAnimator {

            val animacao2 = ObjectAnimator.ofFloat(myCanvas2, "alpha", 1.0f, 0.0f).apply {
                duration = 6000
            }
            return animacao2
        }
        val animator = AnimatorSet()
        animator.play(fadeInAnimation())
        animator.start();

    }
}