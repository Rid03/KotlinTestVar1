package com.company.testvar1.screen.department

import io.jmix.ui.screen.*
import com.company.testvar1.entity.Department

@UiController("Department.edit")
@UiDescriptor("department-edit.xml")
@EditedEntityContainer("departmentDc")
class DepartmentEdit : StandardEditor<Department>() {
    @Subscribe
    private fun onInitEntity(event: InitEntityEvent<Department>) {
        //
    }}