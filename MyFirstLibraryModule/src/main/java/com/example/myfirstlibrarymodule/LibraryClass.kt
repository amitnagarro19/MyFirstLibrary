package com.example.myfirstlibrarymodule

import android.content.Context
import android.widget.Toast

public class LibraryClass {
    companion object{
        fun showToast(context:Context){
            Toast.makeText(context,"My First Toast",Toast.LENGTH_LONG).show()
        }
    }
}