# PermissionX

添加远程依赖

- settings.gradle

  ```groovy
  dependencyResolutionManagement {
      repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
      repositories {
          google()
          mavenCentral()
          maven { url 'https://jitpack.io' }
      }
  }
  ```

- 添加依赖（项目app模块下的`build.gradle`文件中加入）

  ```groovy
  dependencies {
      ...
      implementation 'com.github.xuan51:PermissionX:1.0.0'
  }
  ```

