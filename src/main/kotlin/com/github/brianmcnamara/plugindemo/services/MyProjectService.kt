package com.github.brianmcnamara.plugindemo.services

import com.intellij.openapi.project.Project
import com.github.brianmcnamara.plugindemo.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))

    }
}
