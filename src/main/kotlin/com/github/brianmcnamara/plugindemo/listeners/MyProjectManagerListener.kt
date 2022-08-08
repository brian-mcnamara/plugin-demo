package com.github.brianmcnamara.plugindemo.listeners

import com.intellij.openapi.project.Project
import com.intellij.openapi.project.ProjectManagerListener
import org.jetbrains.jps.incremental.BuilderService
import org.jetbrains.jps.service.JpsServiceManager

internal class MyProjectManagerListener : ProjectManagerListener {

    override fun projectOpened(project: Project) {
        JpsServiceManager.getInstance().getExtensions(BuilderService::class.java)
    }
}
