#!/bin/bash
javac -cp lib/Matematica.jar com/holbertonschool/main/Program.java
jar -cvmf MANIFEST.MF executavel.jar com
java -jar Excecutavel.jar