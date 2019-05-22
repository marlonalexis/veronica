String template = new File("${project.basedir}/src/docker/DockerfileTemplate".toString()).getText()

def dockerFileText = new groovy.text.SimpleTemplateEngine().createTemplate(template)
        .make([fileName: project.build.finalName])

println "writing dir " + "${project.basedir}/target/dist"
new File("${project.basedir}/target/dist/".toString()).mkdirs()

println "writing file"
File dockerFile = new File("${project.basedir}/target/dist/Dockerfile".toString())

dockerFile.withWriter('UTF-8') { writer ->
    writer.write(dockerFileText)
}