#!groovy
multibranchPipelineJob('example') {
    
   branchSources {
        git {
            remote('https://github.com/Tejeshwarraju/GitTest.git')
            credentialsId('')
            includes('*')
        }
    }
   orphanedItemStrategy {
        discardOldItems {
            numToKeep(20)
        }
    }
    
}
