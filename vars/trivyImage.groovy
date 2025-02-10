def call() {
    sh 'trivy image siya/youtube:latest > trivyimage.txt'
}