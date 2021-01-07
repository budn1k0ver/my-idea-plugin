package com.github.budn1k0ver.myideaplugin.services

import com.intellij.openapi.project.Project
import com.github.budn1k0ver.myideaplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
