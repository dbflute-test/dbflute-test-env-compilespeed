Compile Speed Test
=======================
test project to improve compile speed using Spring and H2

# Structure
- magicpile-base: has magicpile-dfgenerated.jar in repo as maven repository
- magicpile-common: has DBFlute client, extended-classes without base-classes, refers jar
- magicpile-dfgenerated: has base-classes with dummy extended-classes, becomes jar

```
dbflute-test-env-compilespeed
 |-src/main/java
 |  |-org.docksidestage.compilespped
 |     |-dbflute // generated classes
 |
 |-src/main/java
 |  |-org.docksidestage.compilespped
 |     |-AnalyzeCompileTimeTest // analyze here
 |
 |-dbflute_magicpiledb
 |-mydbflute
 |-...
```

# Information
## License
Apache License 2.0

## Official site
coming soon...
