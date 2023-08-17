package com.company.testvar1.entity

import io.jmix.core.entity.annotation.JmixGeneratedValue
import io.jmix.core.metamodel.annotation.InstanceName
import io.jmix.core.metamodel.annotation.JmixEntity
import java.util.*
import javax.persistence.*
import javax.validation.constraints.NotNull

@JmixEntity
@Table(name = "STEP")
@Entity
open class Step {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    var id: UUID? = null

    @Column(name = "VERSION", nullable = false)
    @Version
    var version: Int? = null

    @InstanceName
    @Column(name = "NAME", nullable = false)
    @NotNull
    var name: String? = null

    @Column(name = "DURATION", nullable = false)
    @NotNull
    var duration: Int? = null

    @Column(name = "SORT_VALUE", nullable = false)
    @NotNull
    var sortValue: Int? = null
}