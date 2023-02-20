package com.github.brianmcnamara.plugindemo

import com.intellij.lang.annotation.HighlightSeverity
import com.intellij.util.xml.DomFileDescription
import com.intellij.util.xml.highlighting.DomElementsAnnotator

class DomDescriptor: DomFileDescription<XmlFile>(XmlFile::class.java, "test") {
    override fun createAnnotator(): DomElementsAnnotator? {
        return DomElementsAnnotator { element, holder ->
            holder.createProblem(element, HighlightSeverity.ERROR, "testing")
        }
    }
}