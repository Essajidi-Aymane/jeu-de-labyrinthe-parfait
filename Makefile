JC = javac
JV = java
JD = javadoc


cls: 
	$(JC) -sourcepath src -d classes src/main/MainAlgo.java 

doc : 
	$(JD) -sourcepath src -d docs algo cellule grille objects persos main
	
clean :
	rm  ./classes/*/*.class
	rmdir ./classes/*
	rmdir classes
	rm -r docs

.PHONY: clean all