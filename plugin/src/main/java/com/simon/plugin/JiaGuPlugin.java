package com.simon.plugin;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class JiaGuPlugin implements Plugin<Project> {
    @Override
    public void apply(Project project) {
        System.out.println("hello plugin");
    }
}