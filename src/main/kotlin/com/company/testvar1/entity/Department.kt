package com.company.testvar1.entity

import io.jmix.core.entity.annotation.JmixGeneratedValue
import io.jmix.core.metamodel.annotation.InstanceName
import io.jmix.core.metamodel.annotation.JmixEntity
import java.util.*
import javax.persistence.*
import javax.validation.constraints.NotNull

@JmixEntity
@Table(name = "DEPARTMENT", indexes = [
    Index(name = "IDX_DEPARTMENT_HR_MANAGER", columnList = "HR_MANAGER_ID")
], uniqueConstraints = [
    UniqueConstraint(name = "IDX_DEPARTMENT_UNQ_NAME", columnNames = ["NAME"])
])
@Entity
open class Department {
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

    @JoinColumn(name = "HR_MANAGER_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    var hrManager: User? = null
}