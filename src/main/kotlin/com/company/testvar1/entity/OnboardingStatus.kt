package com.company.testvar1.entity

import io.jmix.core.metamodel.datatype.impl.EnumClass

enum class OnboardingStatus(private val id: Int) : EnumClass<Int> {
    NOT_STARTED(10),
    IN_PROGRESS(20),
    COMPLETED(30);

    override fun getId() = id

    companion object {

        @JvmStatic
        fun fromId(id: Int): OnboardingStatus? = OnboardingStatus.values().find { it.id == id }
    }
}