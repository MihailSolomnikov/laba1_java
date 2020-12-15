echo off
set path=C:\Program Files\Java\jdk1.8.0_201\bin
set include=C:\Program Files\Java\jdk1.8.0_201\include
set lib=C:\Program Files\Java\jdk1.8.0_201\lib
set link=C:\Program Files\Java\jdk1.8.0_201\bin
javac -version laba1.java
java laba1
javap -c laba1>1.txt
javadoc laba1.java -d 1
pause