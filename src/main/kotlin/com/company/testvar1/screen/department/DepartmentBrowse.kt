package com.company.testvar1.screen.department

import io.jmix.ui.screen.*
import com.company.testvar1.entity.Department

@UiController("Department.browse")
@UiDescriptor("department-browse.xml")
@LookupComponent("departmentsTable")
class DepartmentBrowse : StandardLookup<Department>()