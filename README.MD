# An illustration of sbt-docker plugin issue #44

(see here: https://github.com/marcuslonnberg/sbt-docker/issues/44)

So it seems that it's not possible to scope `dockerfile` setting to standard sbt scopes. In this example, I use sbt task to try and have 2 different dockerfiles, one in global scope, and other in the task scope.

The unscoped, global `sbt docker` invocation should produce an image that prints "unscoped". The `sbt 'dockerTask::docker'` should produce an image that prints "scoped". Currently both commands produce an image that prints "unscoped".
