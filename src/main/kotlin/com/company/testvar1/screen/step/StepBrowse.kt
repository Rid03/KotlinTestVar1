package com.company.testvar1.screen.step

import io.jmix.ui.screen.*
import com.company.testvar1.entity.Step

@UiController("Step.browse")
@UiDescriptor("step-browse.xml")
@LookupComponent("stepsTable")
class StepBrowse : StandardLookup<Step>()