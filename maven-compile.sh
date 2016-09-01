#!/bin/bash

if [ `uname` = "Darwin" ]; then
  export JAVA_HOME=$(/usr/libexec/java_home -v 1.8)
fi

# path does not have /usr/local/bin from Java for unexplained reason
/usr/local/bin/mvn -e clean compile