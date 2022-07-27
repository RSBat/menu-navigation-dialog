package dev.rsbat.dialognavigation

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.DialogFragment

class MyDialog: DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val alertDialog: AlertDialog = activity?.let {
            val builder = AlertDialog.Builder(it)
            builder.apply {
                setMessage("Alert")
                setTitle("Dialog")
            }

            // Create the AlertDialog
            builder.create()
        } ?: throw IllegalStateException("Activity cannot be null")
        return alertDialog
    }
}