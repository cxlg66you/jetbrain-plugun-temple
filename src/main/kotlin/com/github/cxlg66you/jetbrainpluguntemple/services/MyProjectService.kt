package com.github.cxlg66you.jetbrainpluguntemple.services

import com.intellij.openapi.project.Project
import com.github.cxlg66you.jetbrainpluguntemple.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
