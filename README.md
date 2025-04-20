# TaskScheduler---Java

This project is a Java-based implementation of common task scheduling algorithms, primarily **Priority Scheduling** and **Round Robin Scheduling**. It simulates how operating systems manage tasks or processes based on various parameters like priority and time quantum.

The primary goal of this project is to deepen understanding of scheduling algorithms and how efficient task management plays a critical role in both operating systems and real-world applications such as project management tools.

---

## Features

- Implements Priority Scheduling based on task urgency
- Implements Round Robin Scheduling with customizable time quantum
- Clear console output showing task start and end times
- Designed with readability and modularity in mind for easier understanding

---

## Learning Objectives

- Gain a practical understanding of CPU scheduling algorithms
- Learn how to manage tasks using different scheduling strategies
- Improve Java programming skills through an applied, real-world problem
- Understand basic performance considerations in task management systems

---

## How to Run

### 1. Clone the repository
```bash
git clone https://github.com/yourusername/task-scheduler.git
cd task-scheduler
```

### 2. Compile and run the code:
```bash
    javac TaskScheduler.java
    java TaskScheduler
```

## Sample Output
```
=== Priority Scheduling ===
Priority Scheduling Order:
Task: T2  | Start:  0 | End:  5
Task: T1  | Start:  5 | End: 15
Task: T3  | Start: 15 | End: 23

=== Round Robin Scheduling ===

Round Robin Scheduling (Quantum = 4):
Task: T1  | Start:  0 | End:  4
Task: T2  | Start:  4 | End:  8
Task: T3  | Start:  8 | End: 12
Task: T1  | Start: 12 | End: 16
Task: T2  | Start: 16 | End: 17
Task: T3  | Start: 17 | End: 21
Task: T1  | Start: 21 | End: 23

```


## Real-World Applications

- Process scheduling in operating systems for CPU time management
- Workload balancing in project management tools
- Queue management in service-oriented applications
- Resource optimization in time-critical systems

## Author

**Jiya**  
Second-year engineering student(IT) at MAIT, Delhi.
Passionate about building real-world solutions  
Linkedin - https://www.linkedin.com/in/jiyachugh/

## License
This project is open source and available under the [MIT License](https://opensource.org/licenses/MIT).

---

