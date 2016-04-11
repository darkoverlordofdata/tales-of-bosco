package com.darkoverlordofdata.talesofbosco

import com.badlogic.gdx.Game
class Tob : Game() {
    override fun create() {
        println("create game")
        this.setScreen(MainScene())
    }
}
