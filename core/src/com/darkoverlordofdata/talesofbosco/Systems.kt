package com.darkoverlordofdata.talesofbosco

import com.badlogic.gdx.Input
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.graphics.g2d.TextureAtlas

class Systems(textureAtlas : TextureAtlas, width:Int, height:Int, width2:Int, height2:Int) {

    val Random = java.util.Random()
    val Timer1 = 2f
    val Timer2 = 6f
    val Timer3 = 12f
    val FireRate = .1f
    val width = width
    val height = height
    val width2 = width2
    val height2 = height2
    val textureAtlas = textureAtlas

    var mouseX = 0f
    var mouseY = 0f
    var shoot = false
    //var level:List<Entity> = createLevel()
    val scale = 2f/3f /* Global scaling factor */

    fun touchDown(x: Int, y: Int, pointer: Int, button: Int) : Unit {
        if (Input.Buttons.LEFT == button) shoot = true
    }

    fun touchUp(x: Int, y: Int, pointer: Int, button: Int) : Unit {
        if (Input.Buttons.LEFT == button) shoot = false
    }

    fun mouseMoved(x: Int, y: Int) : Unit {
    }

    fun keyDown(keycode: Int) : Unit {
        if (Input.Keys.Z == keycode) shoot = true
    }

    fun keyUp(keycode: Int) : Unit {
        if (Input.Keys.Z == keycode) shoot = false
    }

    /**
     * Call every frame to re-calc the game state
     *
     * @param delta the time since last update
     */
    fun update(delta: Float) {
//        level = collisionSystem(
//            enemySpawningSystem(level, delta)
//                .map { inputSystem(it, delta) }
//                .map { entitySystem(it, delta) }
//                .map { movementSystem(it, delta) }
//                .map { tweenSystem(it, delta) }
//                .map { expiringSystem(it, delta) }
//                .map { removeOffscreenSystem(it, delta) }, delta)
    }

    /**
     * Call every frame to render the game
     *
     * @param mainBatch LibGDX sprite batch
     */
    fun render(mainBatch: SpriteBatch) {
//        level.filter { it.active }
//            .sortedBy { it.layer }
//            .map { spriteRenderSystem(it, mainBatch) }
    }

}