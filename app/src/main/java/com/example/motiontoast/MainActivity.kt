package com.example.motiontoast

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.res.ResourcesCompat
import com.example.motiontoast.databinding.ActivityMainBinding
import www.sanju.motiontoast.MotionToast
import www.sanju.motiontoast.MotionToastStyle

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.TOASTSUCCESS.setOnClickListener {
            MotionToast.darkToast(
                this,
                "SUCCESS ✔\uFE0F",
                "SUCCESS!",
                MotionToastStyle.SUCCESS,
                MotionToast.GRAVITY_BOTTOM,
                MotionToast.LONG_DURATION,
                ResourcesCompat.getFont(this, www.sanju.motiontoast.R.font.helvetica_regular)
            )
        }

        binding.TOASTERROR.setOnClickListener {
            MotionToast.darkToast(
                this,
                "ERROR ❌",
                "ERROR!",
                MotionToastStyle.ERROR,
                MotionToast.GRAVITY_BOTTOM,
                MotionToast.LONG_DURATION,
                ResourcesCompat.getFont(this, www.sanju.motiontoast.R.font.helvetica_regular)
            )
        }

        binding.TOASTWARNING.setOnClickListener {
            MotionToast.darkToast(
                this,
                "WARNING ⚠\uFE0F",
                "WARNING",
                MotionToastStyle.WARNING,
                MotionToast.GRAVITY_BOTTOM,
                MotionToast.LONG_DURATION,
                ResourcesCompat.getFont(this, www.sanju.motiontoast.R.font.helvetica_regular)
            )
        }

        binding.TOASTINFO.setOnClickListener {
            MotionToast.darkToast(
                this,
                "INFO ℹ\uFE0F",
                "INFO",
                MotionToastStyle.INFO,
                MotionToast.GRAVITY_BOTTOM,
                MotionToast.LONG_DURATION,
                ResourcesCompat.getFont(this, www.sanju.motiontoast.R.font.helvetica_regular)
            )
        }

        binding.TOASTDELETE.setOnClickListener {
            MotionToast.darkToast(
                this,
                "DELETE \uD83D\uDDD1",
                "DELETE",
                MotionToastStyle.DELETE,
                MotionToast.GRAVITY_BOTTOM,
                MotionToast.LONG_DURATION,
                ResourcesCompat.getFont(this, www.sanju.motiontoast.R.font.helvetica_regular)
            )
        }
    }
}