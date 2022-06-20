# Code-Retreat

Welcome to the George Backend Chapter - Code Retreat!  
Have a wonderful and fun day.

## Setup

This project is already setup to be used with `gradle` as well as `maven`.  
You can code in `java` or `kotlin`.

### Gradle

Import `gradle.kts` into IntelliJ
Run:

```shell
./gradlew clean check
```

### Maven

Import `pom.xml` into IntelliJ
Run:

```shell
./mvnw clean verify
```

# Game of Life

## Rules

### Underpopulation

Any live cell with fewer than two live neighbours dies.

```
┌─┬─┬─┐    ┌─┬─┬─┐  
│ │ │ │    │ │ │ │  
├─┼─┼─┤    ├─┼─┼─┤  
│ │█│ │ => │ │ │ │  
├─┼─┼─┤    ├─┼─┼─┤  
│ │ │░│    │ │ │ │  
└─┴─┴─┘    └─┴─┴─┘
```

### Stagnation

Any live cell with two or three live neighbours lives on.

```
┌─┬─┬─┐    ┌─┬─┬─┐  
│ │ │ │    │ │ │ │  
├─┼─┼─┤    ├─┼─┼─┤  
│░│█│ │ => │ │█│ │  
├─┼─┼─┤    ├─┼─┼─┤  
│░│░│ │    │ │ │ │  
└─┴─┴─┘    └─┴─┴─┘
```

### Overpopulation

Any live cell with more than three live neighbours dies.

```
┌─┬─┬─┐    ┌─┬─┬─┐  
│░│░│░│    │ │ │ │  
├─┼─┼─┤    ├─┼─┼─┤  
│░│█│░│ => │ │ │ │  
├─┼─┼─┤    ├─┼─┼─┤  
│░│░│░│    │ │ │ │  
└─┴─┴─┘    └─┴─┴─┘
```

### Reproduction

Any dead cell with exactly three live neighbours becomes alive.

```
┌─┬─┬─┐    ┌─┬─┬─┐  
│ │ │ │    │ │ │ │  
├─┼─┼─┤    ├─┼─┼─┤  
│░│ │ │ => │ │█│ │  
├─┼─┼─┤    ├─┼─┼─┤  
│ │░│░│    │ │ │ │  
└─┴─┴─┘    └─┴─┴─┘  
```
