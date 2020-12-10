package com.simon.plugin;

import org.gradle.api.Action;
import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class JiaguPlugin implements Plugin<Project> {
    @Override
    public void apply(Project project) {
        final JiaguExt jiagu = project.getExtensions().create("Jiagu", JiaguExt.class);

        project.afterEvaluate(new Action<Project>() {
            @Override
            public void execute(Project project) {
                System.out.println(jiagu.getUserName());
            }
        });
    }


}