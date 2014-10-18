Maven Archetype Plugin
======================

   mvn archetype:generate
   mvn archetype:create-from-project
   mvn archetype:crawl

Creating Maven Archetypes
=========================

Archetypes use Velocity tempaltes to create new projects. All the archetype
artifacts are placed under `src\main\resources`.

The configuration file of the archetype is the
`src\main\resources\META-INF\maven\archetype-metadata.xml`. This file contains
the soruce files to be included in the generated project, and the configurable
properties of the archetype.

Resource files are stored under `src\main\resources\archetype-resources`.

Placeholders which can be used in the archetype resource files:
* ${groupId}
* ${artifactId}
* ${version}
* ${package}

Java source files are placed under
`src\main\resources\archetype-resources\src\main\java`. All the files
in this directory will be moved to the package specified during
project creation time. All the sources files use the ${package} to
inject the new package name into the files.

Archetypes are usually generated using the `mvn
archetype:create-from-project` command.
