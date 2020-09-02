package chapter_6

import java.io.File
import java.io.FileOutputStream
import java.io.PrintWriter

fun main(args: Array<String>) {
    PrintWriter(FileOutputStream("d:\\test\\output.txt")).use {
        it.println("hello")
    }
}