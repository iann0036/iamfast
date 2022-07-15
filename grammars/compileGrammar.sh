#!/bin/bash

java -Xmx500M -cp '/usr/local/lib/antlr-4.9.2-complete.jar:$CLASSPATH' org.antlr.v4.Tool -Dlanguage=JavaScript -lib grammars -o src/lib -visitor -Xexact-output-dir grammars/JSON.g4
