package com.sokrat.tictactoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.example.tictactoe.R

class MainActivity : AppCompatActivity() {
    var lastClicked = "o"
    private var win = false
    private var gameIsOver = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttons: Array<Button> = arrayOf(findViewById(R.id.button1), findViewById(R.id.button2), findViewById(R.id.button3), findViewById(R.id.button4),
                findViewById(R.id.button5), findViewById(R.id.button6), findViewById(R.id.button7), findViewById(R.id.button8), findViewById(R.id.button9))
        val reset: Button = findViewById(R.id.reset)

        reset.setOnClickListener {
            for (item in buttons)
                item.text = ""
            win = false
            gameIsOver = false
            lastClicked = "o"

        }
    }



    fun fieldOnclick(view: View){
        val buttons: Array<Button> = arrayOf(findViewById(R.id.button1), findViewById(R.id.button2), findViewById(R.id.button3),
                findViewById(R.id.button4), findViewById(R.id.button5), findViewById(R.id.button6),
                findViewById(R.id.button7), findViewById(R.id.button8), findViewById(R.id.button9))
        view as Button
        if (!win && !gameIsOver){
            if (view.text == "") {
                if (lastClicked == "o")
                    view.text = "x"
                else
                    view.text = "o"
                lastClicked = view.text.toString()
                when (view) {
                    buttons[0] -> {
                        if (view.text == buttons[1].text && view.text == buttons[2].text ||
                                view.text == buttons[3].text && view.text == buttons[6].text ||
                                view.text == buttons[4].text && view.text == buttons[8].text
                        ) {
                            if (view.text == "x")
                                Toast.makeText(this, "Player 1 win", Toast.LENGTH_SHORT).show()
                            else
                                Toast.makeText(this, "Player 2 win", Toast.LENGTH_SHORT).show()

                            win = true
                        }
                    }

                    buttons[1] -> {
                        if (view.text == buttons[0].text && view.text == buttons[2].text ||
                                view.text == buttons[4].text && view.text == buttons[7].text
                        ) {
                            if (view.text == "x")
                                Toast.makeText(this, "Player 1 win", Toast.LENGTH_SHORT).show()
                            else
                                Toast.makeText(this, "Player 2 win", Toast.LENGTH_SHORT).show()

                            win = true
                        }
                    }

                    buttons[2] -> {
                        if (view.text == buttons[1].text && view.text == buttons[0].text ||
                                view.text == buttons[4].text && view.text == buttons[6].text ||
                                view.text == buttons[5].text && view.text == buttons[8].text
                        ) {
                            if (view.text == "x")
                                Toast.makeText(this, "Player 1 win", Toast.LENGTH_SHORT).show()
                            else
                                Toast.makeText(this, "Player 2 win", Toast.LENGTH_SHORT).show()

                            win = true
                        }
                    }

                    buttons[3] -> {
                        if (view.text == buttons[4].text && view.text == buttons[5].text ||
                                view.text == buttons[0].text && view.text == buttons[6].text
                        ) {
                            if (view.text == "x")
                                Toast.makeText(this, "Player 1 win", Toast.LENGTH_SHORT).show()
                            else
                                Toast.makeText(this, "Player 2 win", Toast.LENGTH_SHORT).show()

                            win = true
                        }
                    }

                    buttons[4] -> {
                        if (view.text == buttons[1].text && view.text == buttons[7].text ||
                                view.text == buttons[3].text && view.text == buttons[5].text ||
                                view.text == buttons[0].text && view.text == buttons[8].text ||
                                view.text == buttons[2].text && view.text == buttons[6].text
                        ) {
                            if (view.text == "x")
                                Toast.makeText(this, "Player 1 win", Toast.LENGTH_SHORT).show()
                            else
                                Toast.makeText(this, "Player 2 win", Toast.LENGTH_SHORT).show()

                            win = true
                        }
                    }

                    buttons[5] -> {
                        if (view.text == buttons[2].text && view.text == buttons[8].text ||
                                view.text == buttons[3].text && view.text == buttons[4].text
                        ) {
                            if (view.text == "x")
                                Toast.makeText(this, "Player 1 win", Toast.LENGTH_SHORT).show()
                            else
                                Toast.makeText(this, "Player 2 win", Toast.LENGTH_SHORT).show()

                            win = true
                        }
                    }

                    buttons[6] -> {
                        if (view.text == buttons[0].text && view.text == buttons[3].text ||
                                view.text == buttons[7].text && view.text == buttons[8].text ||
                                view.text == buttons[4].text && view.text == buttons[2].text
                        ) {
                            if (view.text == "x")
                                Toast.makeText(this, "Player 1 win", Toast.LENGTH_SHORT).show()
                            else
                                Toast.makeText(this, "Player 2 win", Toast.LENGTH_SHORT).show()

                            win = true
                        }
                    }

                    buttons[7] -> {
                        if (view.text == buttons[1].text && view.text == buttons[4].text ||
                                view.text == buttons[6].text && view.text == buttons[8].text
                        ) {
                            if (view.text == "x")
                                Toast.makeText(this, "Player 1 win", Toast.LENGTH_SHORT).show()
                            else
                                Toast.makeText(this, "Player 2 win", Toast.LENGTH_SHORT).show()

                            win = true
                        }
                    }

                    buttons[8] -> {
                        if (view.text == buttons[0].text && view.text == buttons[4].text ||
                                view.text == buttons[2].text && view.text == buttons[5].text ||
                                view.text == buttons[6].text && view.text == buttons[7].text
                        ) {
                            if (view.text == "x")
                                Toast.makeText(this, "Player 1 win", Toast.LENGTH_SHORT).show()
                            else
                                Toast.makeText(this, "Player 2 win", Toast.LENGTH_SHORT).show()

                            win = true
                        }
                    }
                }

                gameIsOver = true
                for (item in buttons) {
                    if (item.text == "")
                        gameIsOver = false
                }
            } else
                Toast.makeText(this, "This field is also selected", Toast.LENGTH_SHORT).show()
        } else
            Toast.makeText(this, "Game over, please, click reset button to play again.", Toast.LENGTH_SHORT).show()
    }



}