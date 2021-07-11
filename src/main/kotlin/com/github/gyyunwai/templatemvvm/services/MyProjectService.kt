package com.github.gyyunwai.templatemvvm.services

import com.github.gyyunwai.templatemvvm.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
