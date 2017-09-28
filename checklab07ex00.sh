#!/bin/bash
cd "${1}"
trash-put bin -r
trash-put .hgignore
trash-put *
hg update tip --clean
echo "Directory content:"
ls -ahl
echo
echo "Content of .hgignore:"
cat .hgignore
echo
echo "Content of HelloWorld.java"
cat HelloWorld.java
echo
hg update -r4 --clean
echo "Working directory at r4:"
ls -a
echo
hg update tip --clean
hg log -G
hg heads