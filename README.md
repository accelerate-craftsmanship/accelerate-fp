# Accelerate - Functional Programming

This repo acts as a starter for the hands-on workshop.

## Get ready!

Before the workshop starts, complete the following pre-requisites so that you can make a rolling start during the workshop.

TLDR: Install **IntelliJ Community Edition, Java 17 and Node 18**

## Install IntelliJ & Java 17

- Download and install the [Community Edition of IntelliJ](https://www.jetbrains.com/idea/download/). If you have an IntelliJ Ultimate license, use Ultimate.
- You can then [use IntelliJ to download Java 17](https://www.jetbrains.com/idea/guide/tips/download-jdk/).

## Install Node 18

There are many ways to get Node installed. Choose whichever way works best for you.

- You can download a [Node 18 Installer](https://nodejs.org/en/download)
- Or you can [use NVM](https://github.com/nvm-sh/nvm#installation-and-update), this project has a `.nvmrc` file, so if you have nvm you only have to run the `nvm -i` command in this folder.

## Clone the project

In IntelliJ, use `New project from version control` to open this repository or clone it using the terminal:

```bash
git clone https://github.com/accelerate-craftsmanship/accelerate-fp.git
```

## Download dependencies

Now you should be able to open this folder in IntelliJ. It should automatically recognize the Java Maven project and download any dependencies. **Wait for the 'Importing Maven projects' progress bar at the bottom to be finished.**

For the NPM dependencies, you have to open a terminal in this folder and run:

```bash
npm install
```

_Note: you can click the green arrow right here in the README if IntelliJ shows it._

## Check if tests run

If you have IntelliJ Ultimate, you can run both the Java and TypeScript tests from there. If you have IntelliJ Community, you can only run the Java tests there. For the TypeScript tests you can run them from the terminal.

- **IntelliJ Ultimate:** At the top-right of the IntelliJ window, select the `All Tests (Ultimate)` run configuration and click on the play icon. This will run both Java and TypeScript tests. _Note: you can also click the green arrow right here in the README if IntelliJ shows it._

- **IntelliJ Community Edition:** At the top-right of the IntelliJ window, select the `All Tests (Community)` run configuration and click on the play icon. This will run both Java and TypeScript tests. _Note: you can also click the green arrow right here in the README if IntelliJ shows it._

- **VS Code:** You can install the [Vitest](https://marketplace.visualstudio.com/items?itemName=ZixuanChen.vitest-explorer) extension, or open the terminal and run `npm test`. **This will run only TypeScript tests.**

A `sample` test of a simple `sum` function should run for both TypeScript and Java. Make sure all are green.

If this works, you're all set. If for any reason you can't get it to work, don't worry. During the workshop you'll work in pairs again, so big chance your partner already has a working setup.

Now all you have to do is look forward to the workshop!