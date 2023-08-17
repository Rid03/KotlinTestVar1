package com.company.testvar1.screen.step

import io.jmix.ui.screen.*
import com.company.testvar1.entity.Step

@UiController("Step.edit")
@UiDescriptor("step-edit.xml")
@EditedEntityContainer("stepDc")
class StepEdit : StandardEditor<Step>()