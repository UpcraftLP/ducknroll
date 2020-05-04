package com.deflatedpickle.ducknroll.common.api.component

import kotlin.reflect.KClass

interface ComponentHolder {
    fun addComponent(component: IComponent): IComponent

    fun getComponent(index: Int): IComponent
    fun <T : IComponent> getComponent(type: KClass<T>): T?

    fun getAllComponents(): List<IComponent>
    fun getAllComponents(type: KClass<IComponent>): List<IComponent>
}
