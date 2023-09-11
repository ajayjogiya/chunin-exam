run: 
	javac -d target/classes src/main/java/com/exam/*.java 
	java -cp target/classes com.exam.Main 

test: 
	mvn test