#!/bin/sh
DIRNAME=$(dirname "$0")
java -classpath "$DIRNAME/gradle/wrapper/gradle-wrapper.jar" org.gradle.wrapper.GradleWrapperMain "$@"

