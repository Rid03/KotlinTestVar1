package com.company.testvar1.entity

import io.jmix.core.entity.annotation.JmixGeneratedValue
import io.jmix.core.metamodel.annotation.JmixEntity
import java.time.LocalDate
import java.util.*
import javax.persistence.*
import javax.validation.constraints.NotNull

@JmixEntity
@Table(name = "USER_STEP", indexes = [
    Index(name = "IDX_USER_STEP_USER", columnList = "USER_ID"),
    Index(name = "IDX_USER_STEP_STEP", columnList = "STEP_ID")
])
@Entity
open class UserStep {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    var id: UUID? = null

    @Column(name = "VERSION", nullable = false)
    @Version
    var version: Int? = null

    @JoinColumn(name = "USER_ID", nullable = false)
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    var user: User? = null

    @JoinColumn(name = "STEP_ID", nullable = false)
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    var step: Step? = null

    @Column(name = "DUE_DATE", nullable = false)
    @NotNull
    var dueDate: LocalDate? = null

    @Column(name = "COMPLETED_DATE")
    var completedDate: LocalDate? = null

    @Column(name = "SORT_VALUE", nullable = false)
    @NotNull
    var sortValue: Int? = null
}