#!/bin/bash

for i in grammars/*.g4; do
    [ -f "$i" ] || break
    java -Xmx500M -cp '/usr/local/lib/antlr-4.13.1-complete.jar:$CLASSPATH' org.antlr.v4.Tool -Dlanguage=JavaScript -lib grammars -o src/lib -visitor -Xexact-output-dir $i
done

