pipelineJob('hello_boot') {
    description('Pipeline')
    definition {
        cps {
            script(readFileFromWorkspace('pipelines/hello_boot.groovy'))
        }
    }
}