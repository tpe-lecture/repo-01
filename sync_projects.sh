#!/bin/sh
pushd ../../../Development/game-framework
cd javadoc ; zip -r ../game_framework-javadoc.zip * ; cd ..
mv game_framework-javadoc.zip ../../Vorlesungen/TPE/11_Labs/lib/
cp out/artifacts/game_framework_jar/game_framework.jar ../../Vorlesungen/TPE/11_Labs/lib/
popd
 
