pipelineJob('pipeline') {
    description('Pipeline')
    definition {
        cps {
            script(readFileFromWorkspace('pipelines/hello-boot.groovy'))
        }
    }
}