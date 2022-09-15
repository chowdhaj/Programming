# JavaScript Notes

The following notes are based off of [JavaScript Tutorial](https://codewithmosh.com/p/javascript-basics-for-beginners), by Code With Mosh.

## Notes

- Companies like Walmart, Netflix, Microsoft, etc. use JavaScript is used to build entire applications.

- JavaScript developers can work as `Frontend` developers, `Backend` developers, or `Full Stack` developers.

- Full stack developers work on both the Frontend and Backend.

- For a long time, JavaScript was only used in browsers to build interactive web pages.

- Today, you can use JavaScript to build:
    - Full-fledged web or mobile applications
    - Real-time networking applications like messengers and video streaming services
    - Command-line tools
    - Video games

- Initially, JavaScript was designed to run only in browsers.

- Every browser has a JavaScript engine, that can execute JavaScript code.
    - The JavaScript engine in `Chrome is V8`.
    - The JavaScript engine in `FireFox is SpiderMonkey`.

- In 2009, an engineer named Ryan Dahl, took the open-source JavaScript engine in Chrome and embedded it inside a C++ program.
    - He called it `Node`.

- Node is a C++ program that includes Google's V8 JavaScript engine.

- With Node, we can run JavaScript code outside of a browser.
    - We can pass our JavaScript code to Node for execution.
    - We can use JavaScript to build the Backend for our web and mobile applications.

- In a nutshell, JavaScript code can be run inside of a browser or in Node.

- Browsers and node provide a runtime environment for JavaScript code.

- `ECMAscript` is a specification.
    - JavaScript confirms to the ECMAscript specification.

- An organization called `ECMA` is responsible for defining standards.
    - They take care of the `ECMAscript` specification.

- The first version (v1) of `ECMAscript` was released in 1997.

- Starting from 2015, ECMA has been working on releasing annual specifications.
    - In 2015, they released `ES2015`, which is also called `ES6` (version 6).

- Every browser has a JavaScript engine.
    - We can use this to write and execute JavaScript code, via the console.

- In the browser's console we can run commands like:
    - console.log("Test")
    - 2 + 2
    - alert("Message")

- In order to write JavaScript code, you need a code editor. For example:
    - Visual Studio Code (VScode)
    - Sublime Text
    - Atom

- You can download Node from `nodejs.org`.

- Technically, you do not need Node to execute JavaScript, because you can execute JavaScript inside of a browser.
    - But it is good to have Node on your machine, to install 3rd party libraries.

- If you want to be a Front-end developer, you should know HTML really well.

- The `index.html` file is used as a host for the JavaScript code.

- Install `Live Server` on VScode.

- In order to write JavaScript code, a script element is needed.
    - e.g. `<script type="text/javascript"></script>`

- There are 2 places the script element can be added:
    - `<head>` section
    - `<body>` section

- The best practice is to put the script element at the end of the `<body>` section, after all the existing elements.

- The browser parses the file from top to bottom.
    - Putting a script element before other elements will not render those elements in a timely manner.
        - This creates a bad user experience.

- The code between the script elements need to talk to the elements on the webpage.
    - For example, we may want to show or hide some elements.

- Adding a script element at the end allows the preceeding elements to be rendered by the browser.

- Some 3rd party code has to be placed in the `<head>` section; there is no way around this.

- It is good practice for you to add your JavaScript code at the end.

- A statement is a piece of code that expresses an action to be carried out.

- All statements in JavaScript should be terminated in a semi-colon.

- Anything between quotations is a String.

- A String is a sequence of characters.

- In JavaScript, two forward slashes represent a comment.
    - We can use this to add description to our code.

- Comments are ignored by the JavaScript engine; they are not executed.

- Comments are for documenting code, and explaining to other developers your rationale behind the code.

- Avoid using comments to explain what the code does, because the code should explain itself.

- Use comments to explain "why" and "how".

- Use the console in the browser to see messages.
    - e.g. "Hello world" messages.

- 11:47
