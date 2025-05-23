# Gradle Build Cache

This project utilizes the **Gradle Build Cache** to optimize build performance by reusing outputs from previous builds.

## 🚀 What is the Gradle Build Cache?

The **Gradle Build Cache** is a feature that saves build outputs and reuses them in subsequent builds to avoid re-executing tasks that produce the same output. This significantly reduces build time, especially in large projects or CI environments.

There are two types of build caches:

- **Local Cache**: Stored on the local machine.
- **Remote Cache**: Shared cache that multiple developers or CI machines can access.

## 💡 Benefits

- Faster builds by reusing outputs.
- Improved CI efficiency.
- Consistent build results across environments.

## 🛠️ Enabling the Build Cache

To enable the build cache, add the following to your `settings.gradle` or `settings.gradle.kts`:

```groovy
buildCache {
    local {
        enabled = true
    }
    remote(HttpBuildCache) {
        url = 'https://your-cache-server/cache/'
        push = true
    }
}
Ensure you replace 'https://your-cache-server/cache/' with your actual cache server URL.
