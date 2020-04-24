package com.deflatedpickle.ducknroll.common.common.registry

import com.deflatedpickle.ducknroll.common.api.command.ICommand

@ThreadLocal
object Registries {
    val command = Registry<String, () -> ICommand>()
}