package com.github.yiding123.intellijplatformplugindevcloud.services

import com.intellij.openapi.project.Project
import com.github.yiding123.intellijplatformplugindevcloud.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
