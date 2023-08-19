# selenium-deadlock
Sample project to reproduce deadlock in Selenium

1. Run `mvn test`
2. The test is hanging
3. Take thread dump using command `jstack PID` (where PID is ID of the java process running tests)

A sample thread dump is stored in file "thread-dump.txt".
It contains two threads blocking each other: "main" #1 and "CDP Connection" #57.