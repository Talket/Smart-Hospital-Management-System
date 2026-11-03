# MediCore — Hospital Management UI Prototype

A browser-based hospital-management interface prototype accompanied by small Java demonstrations of common data structures and algorithms.

> **Scope:** This repository is a learning/demo project. The interface is not connected to a production hospital database, and it is not suitable for storing or processing real patient information.

## What's included

- A dark-themed hospital dashboard interface prototype.
- Separate Java examples for binary search, graph traversal, priority queues, queues, and sorting.
- Tailwind CSS and Phosphor Icons loaded from public CDNs.

## Run the interface

No build step is required. Open index.html in a modern browser.

Some styling and icons are loaded from external CDNs, so an internet connection is needed for those assets.

## Run the Java examples

Install a JDK, then compile and run an example from the repository root:

    javac QueueDemo.java
    java QueueDemo

Repeat with another source file, such as BinarySearchDemo.java or GraphDemo.java.

## Repository map

| File | Purpose |
|---|---|
| index.html | Hospital dashboard UI prototype |
| BinarySearchDemo.java | Binary search example |
| GraphDemo.java | Graph algorithm example |
| PriorityQueueDemo.java | Priority queue example |
| QueueDemo.java | Queue example |
| SortingDemo.java | Sorting example |

Compiled .class files are intentionally not tracked; compile the source files locally.
