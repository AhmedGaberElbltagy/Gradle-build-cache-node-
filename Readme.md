The Gradle build cache is a cache mechanism that aims to save time by reusing outputs produced by other builds. The build cache works by storing (locally or remotely) build outputs and allowing builds to fetch these outputs from the cache when it is determined that inputs have not changed, avoiding the expensive work of regenerating them.


the local cache can speed up switching branches and doing git bisect. On CI machines the local cache can act as a mirror of the remote cache, significantly reducing network usage.

to enable the build cache node in your project add this block to your setting.gradle
buildCache {
            local {
                enabled = false
            }
            remote(HttpBuildCache) {
                url = "${{ cacheUrl }}"
                enabled = true
                push = true
                allowUntrustedServer = true
                allowInsecureProtocol = true
                System.setProperty("http.nonProxyHosts",
                    "${System.getProperty("http.nonProxyHosts")}|${{ parameters.nonProxyHost }}")
            }
        }

the command to be used to utilize the build cacge node during the build is 
./gradlew build --build-cache .
