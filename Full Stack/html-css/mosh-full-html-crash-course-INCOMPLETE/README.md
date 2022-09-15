# Notes For HTML & CSS

The following notes are based off of [HTML Tutorial for Beginners: HTML Crash Course](https://codewithmosh.com/p/the-ultimate-html-css), by Code With Mosh.

## Notes

- Visual Studio Code (VScode) is a decent editor (for HTML and CSS).
    - If you are using VScode, then download the following extensions:
        - Live Server
        - Prettier

- To view and test web pages, use a Chromium based browser like Google Chrome, Brave, etc.

- Every website has two parts: `Frontend` and `Backend`

- The Frontend is the part that users see in their browser and interact with. It contains all the visual parts

- The Backend powers the Frontend. It is mainly about storing data in databases and providing it to the Frontend.

- Web development jobs fall into 3 categories: Frontend, Backend, and `Full Stack`.

- Full Stack encompasses both the Frontend and Backend.

- Frontend developers use HTML, CSS, and JavaScript.

- Backend developers have different sets of tools available to them.

- `HTML` is short for `Hypertext Markup Language`. It is used to define the building blocks of webpages.

- `CSS` stands for `Cascading Stylesheet`. It is used for styling webpages and making them look good.

- JavaScript is used for adding functionality to webpages. For example, a building in the real world is like a webpage on the Internet. In a building, pressing the elevator button will cause it to ascend/descend. 

- HTML is used to build the webpage, and CSS is used to add visual effects.

- JavaScript adds functionality or behavior to webpages.

- JavaScript is a programming language. HTML and CSS are not.

- Frameworks/libraries come with code that can be reused. They help us get the job done faster.

- Examples of Frameworks are: React, Angular, Vue.

- Technically, `React` is not a Framework, but a library.

- React is the most popular in web development.

- Version control systems are used to track project history and work collaboratively with others.

- Examples of version control systems: `Git`, SVN, Mercurial.

- Git is the most popular version control system. It is used by 70% of software companies.

- The address in the browser address bar is called URL.

- `URL` stands for Uniform Resource Locator. It is a way to locate a resource on the Internet.

- Resources can be:
    - Web pages (also called HTML documents)
    - Images
    - Video files
    - Fonts

- There are 2 things involved in loading a website: a client and a server.

- In the client-server model, the client requests a service, and the server provides a service.

- Requests from the client are typically sent by the browser.

- HTTP is a language that clients and servers use to talk to each other. It is not a programming language.

- `HTTPS` is HTTP with encryption. The messages exchanged with the server and the client are encrypted.

- `index.html` (typically) represents the homepage of websites.

- In the client-server model, the first message is called `HTTP Request` and the second message is called `HTTP Response`.

- All data exchanged via the HTTP protocol involves 2 messages: a request and a response.

- Response `200` means successful or okay.

- As the browser reads the HTML document, sent by the server, it constructs a `Document Object Model (DOM)`.

- The DOM is a model that represents the objects or elements in the HTML document, such as paragraphs, images, etc.

- Each resource in a HTML document requires the client to send another request to fetch the resource.

- Many HTTP requests are sent in parallel.

- Rendering an HTML document means displaying it.

- Chrome Developer Tools (CDT) is used by frontend developers.

- CDT can be used to inspect traffic to/from a website.

- The `GET` request retrieves information from the server.

- `DOCTYPE` stands for Document Type. It tells browsers that this is an `HTML5` document.

- `HTML5` is not a case-sensitive language.

- Most HTML elements have an opening and closing tag.

- The `<title>` element specifies the title of the page that appears in the tab.

- The IP address `127.0.0.1` represents the local computer (i.e. `localhost`).

- After the IP address is a colon and port number. This means that the web server is listening on port XYZ (e.g. `127.0.0.1:5500/index.html`).

- `<img>` specifies an image element. Image elements only have an opening tag, but no closing tag. This is because the image element cannot have any child elements.

- `alt` is short for alternative text. It is used to give the browser some text to display, in case the image cannot be displayed.

- `<p>` is short for paragraph, and is used to add text elements.

- With Live Server, you don't have to manually refresh the webpage, everytime you make changes.

- HTML is used to define the building blocks of webpages.

- Each CSS declaration contains a property and a value.

- Lines are terminated with a semi-colon. So we can write multiple CSS values.

- Setting the `border-radius` to half of the width gives a round image.

- The `float` property pushes the image element to the left side of the text elements.

- Class is short for Classification. This attribute is used to put this element inside a different class, or different category; just like products in a supermarket.

- Browsers ignore whitespaces in HTML and CSS. You can put everything on a single line, and everything will still work.

- Browsers do not care how we format our code.

- Formatting is important for reading and maintaining code.

- The `Prettier` plugin can format code in a consistent manner. This is useful for when working in a team.

- VScode comes with its own formatter for HTML files. Prettier is a separate formatter.

- You can configure VScode to automatically format code when you save the document.

- When the browser reads the HTML document that is returned from the server, it constructs a Document Object Model (DOM).

- You can use Chrome Developer Tools (CDT) to inspect the DOM.

- With CDT, we can experiment with styles in real time, without having to refresh the page. Frontend developers use CDT to figure out the style, and then apply the values to the HTML document.

- If you have a typo in your code then the webpage may not perform or look as expected.

- You can use a validator to identify problems in the HTML document.
    - e.g. validator.w3.org

- There are 3 ways to validate HTML:
    1. Validate By URI
    2. Validate By File Upload
    3. Validate By Direct Input

- The `lang` attribute tells search engines the language of the webpage. This helps them do a better job at displaying results.

- For CSS, we use a different validator from HTML.
    - e.g. https://jigsaw.w3.org/css-validator/

- There are 3 ways to validate CSS; same as HTML.

- As websites get large, we should separate HTML and CSS into their respective documents.

- If your webpages are not properly displayed, always troubleshoot with a quick validation.

- In VScode, if you type `!` and press tab, then VScode will generate the basic HTML boilerplate. In Sublime, type `html` and then press tab.

- `meta` elements give information about the webpage.

- Computers do not understand characters like [A..Z]. They only understand numbers, which are represented in the binary format [0,1]. Using a character set, we can turn a character to a numeric value.

- The first character set designed was the `ASCII` character set.

- ASCII is short for American Standard Code For Information Interchange

- ASCII can only represent characters in the English language. It is very limited.

- Different character sets have to be created to represent characters in international languages.

- The most common character set is UTF-8, which can represent almost all characters in the world.

- The meta element `charset` defines the character set used in the HTML document.

- The viewport is the visible area of the webpage.

- On a desktop/laptop, you can change the size of the viewport by resizing the browser.

- Properly defining the viewport allows the webpage to look good on all devices.

- It is good practice to add the `charset` and `viewport` meta elements.

- There are lots of meta elements in HTML.

- In the past, `meta` elements were used for search engine optimization (`SEO`).

- The `description` meta element provides an overview of the website, and it will appear on Google and other search engines.

- The `<p>` element is used to display text. It stands for paragraph.

- The `<em>` element represents stress emphasis of its contents.

- By default, browsers display emphasized content in italics. But as a web-developer, do not use the `<em>` element to display italicized text.

- The `<em>` element helps search engines extract important content in the document.

- Anything to do with styling should be done in CSS, and NOT in HTML.

- The `<i>` element is used to italicized text. However, this is depcrecated because HTML is not meant for styling.

- Only use HTML for structuring content.

- The `<strong>` element represents strong importance, seriousness, or urgency for its contents. It is similar to the `<em>` element.

- By default, `<strong>` elements are displayed as bold. Do not use it to bold text.

- The `<b>` element is used to bold text. However, this element is depcrecated because styling should be done in CSS.

- With VScode you can wrap text inside elements without needing to manually move text.

- In HTML, we have 6 heading elements:
    - `<h1>` --> Heading 1
    - `<h2>` --> Heading 2
    - `<h3>` --> Heading 3
    - `<h4>` --> Heading 4
    - `<h5>` --> Heading 5
    - `<h6>` --> Heading 6

- Heading 1 (`h1`) represents the most important heading.

- Heading 6 (`h6`) represents the least important heading.

- Do not choose headings based on size. Rather, use them based on hierarchy.

- A webpage should have only one `<h1>` element. It tells you (and search engines) what the page is all about.

- Having more than one `<h1>` element will confuse search engines, because they will not be able to determine what the webpage is really about.

- After using `<h1>`, use `<h2>`. Do not jump to `<h4>` or `<h5>`.

- With headings, create a hierarchy.

- A well structured HTML document helps with search engine optimization (SEO).

- Some characters are reserved in HTML and require special notation to display them.

- Use HTML entities to display special characters.
    - e.g.
        - `&lt`;
        - `&gt`;
        - `&copy`;

- [Here is a complete list of HTML entities](https://www.toptal.com/designers/htmlarrows/symbols/).

- In VScode, you can generate dummy text by typing `lorem` followed by the number of words, and then press tab.
    - e.g. `lorem50`

- In Sublime, you can generate dummy text by typing `lorem`, and then press tab.

- The HTML entity `&nbsp;` stands for non-breaking space. It makes sure that words remain on the same line.

- To create links in HTML, use the `<a>` element. It stands for "anchor".

- Every `<a>` element should have an `href` attribute.

- `href` is short for Hypertext reference, which basically means URl or link.

- With `href`, you can use an absolute or relative URL.

- A relative URl starts from the current page.

- You can also use an image to link other webpages.

- The mouse icon changes to a hand to indicate that an image is clickable.

- To specify one level up in a directory, use double periods followed by a slash.
    - e.g. `../file.html`

- A single forward slash specifies the root of the website.
    - e.g. `/index.html`

- You can link to non-HTML documents like images, PDFs, powerpoints, etc.

- You can add the `download` attribute to an image to prompt users to download it.

- The `download` attribute does not have a value.

- Every element on a page can have a unique identifier. This allows you to easily link to them. This is known as defining a fragment.

- An empty fragment is a pound sign (#). It contains no identifier.

- Linking to another website requires using a protocol, like HTTPS.

- Use the `target` attribute to open websites in a new tab.

- The `<a>` element can also link to emails via `mailto`. This will open the mail client and the email address will be pre-populated.
    - e.g. `mailto:your-email-here@something.com`

- Link VS. Hyperlink
    - A link is an address, a URl, a location of the target page.
    - A hyperlink is an element the user can click on to navigate to the target page.

- Link and hyperlink are used interchangeably, often times.

- Use `unsplash.com` to find free high quality images.

- On mobile devices, you should serve a small image. On desktops, you should serve a large image.

- Provide descriptive names for images so search engines can better understand and index your pages.

- The `alt` attribute is used to provide textual information of the image. It is not compulsory, but is highly recommended because:
    - It makes webpages accessible to visually impaired individuals.
    - Search engines can read the text and understand the content.
    - If the image cannot be loaded, the alternative text is shown.

- CSS can be used to resize elements.

- The `object-fit` property helps size the image appropriately.

- Every HTMl element has a box around it. It is not visible to us, but the browser uses it to figure out how the page should be displayed.

- Most of the time, use `cover` with `object-fit`, so the image covers the entire box.

- HTML5 has support for embedding video and audio.

- Use `pexels.com` to find free high quality videos and images.

- To embed videos, use the `video` element.

- You don't need to specify both height and width, just specify one and the browser will automatically calculate the other one.

- To show the control bar to a video, add the `controls` attribute.

- The `controls` attribute is a boolean attribute. Boolean attributes in HTML do not work the same way in programming languages.

- The presence of a boolean attribute represents true, while its absence represents false.

- The `autoplay` boolean attribute automatically starts the video when the page is loaded.

- The `loop` boolean attribute plays the video continuously.

- Most modern browsers have excellent support for video.

- The website `caniuse.com` is a great place to see what browsers support what features.

- If a browser does not support video elements, then provide some fallback text.
    - e.g. "Your browser does not support video playback"

- The `<audio>` element is exactly like the video element. You need to specify a source and have boolean attributes

- Note: Your browser settings can override the websites' settings. For example, if your browser does not automatically play videos, then the site cannot force them to play.

- In HTML, there are 3 type of list elements:
    - `<ul>` (Unordered list)
    - `<ol>` (Ordered list)
    - `<dl>` (Description list)

- Unordered lists are used when the order of the list does not matter. These are commonly used in navigation menus.

- The element `<li>` is short for list item.

- By default, items in a list are displayed as bullet points. However, the format can be changed because it is a matter of styling.

- CSS can be used to change the shape of bullet points to square, remove them altogether, layout the options horizontally, etc.

- Lists can be nested to create a hierarchy.

- In an ordered list, the order of items matter. Changing the order can change the meaning.

- Ordered lists are created using the `<ol>` element.

- Description lists are used to implement glossaries or display meta-data.

- Tables are no longer used to layout webpages; this is bad practice.

- The `<table>` element should only be used for displaying tabular data.

- To define a row, use the `<tr>` element. `tr` stands for table row.

- The cells in the first row are called header cells, because the labels define what each column represents.

- All the other cells in a table are called data cells.

- To define a data cell, use the `<td>` element.

- `td` stands for table data cell.

- To style a table, use the `border` attribute in CSS. You must define 3 values: thickness_of_border, style_of_border, color_of_border.
    - This creates a border around the table element.

- To change the style of the rows and columns, you need to define styling for the `<td>` element.

- Styling the `<table>` and `<td>` attributes are bad because duplication of code is bad.
    - DRY = Don't Repeat Yourself

- To style multiple elements at once, separate them with a comma.

- The `border-collapse` property merges the borders of neighbouring cells into a single border.

- Use `padding` to add some space between the border and data.

- To define a header cell, use the `<th>` element.

- `<th>` stands for table header-cell.

- To optimize tables for SEO, use `<thead>` and `<tbody>`. This does not change the appearance of the table, but makes the markup more meaningful to search engines and screen readers.
    - This is called semantic HTML
        - Semantic means meaningful

- The `colspand` attributes determines how many columns a cell should expand to.
    - The default value is 1.

- To add a footer to a table, use the `<tfoot>` element.

- In header cells, the text is bold and aligned to the center. This is by default.

- In data cells, the text is aligned to the left.

- Containers are frequently used in webpages. They are useful for grouping elements together.

- The most common container element is `<div>`.

- `<div>`, by itself, has no visual appearance.

- Applying a CSS rule to a `<div>` element applies the rule(s) to all the `<div>` elements
    - Hence, it is a good idea to group `<div>` elements by class.

- To apply a style to any element with a certain class, remove the element type.
    - e.g. `.product {...}`

- `<div>` elements are `Block-level Elements`.

- Block-level elements always start on a new line, and always fill up the entire space.

- We can use CSS to change the width of Block-level elements.

- The `<span>` element is often used to style text.

- `<span>` is an `Inline element`; it does not take up the entire width of the page.

- `<div>` and `<span>` are general purpose elements.

- Semantic elements are more descriptive/meaningful than generic elements.
    - e.g.
        - `<article>`
        - `<figure>`
        - `<mark>`
        - `<time>`

- Semantic elements help search engines understand our webpages better.

- Use the `<article>` element for independent, self-contained content such as:
    - Forum post
    - Comments
    - Reviews
    - Product cards

- Wrapping an `<img>` element inside a `<figure>` element tells search engines that this is a figure, and not just an image.

- The `<figure>` element is just a container for figures. It does not have any visual appearance.

- Use `<figcaption>` to generate a figure caption tag. Captions can be above or below the image.

- Use `<mark>` to highlight elements in a yellow color.

- Use `<time>` to encapsulate date/time.

- Set the `datetime` attribute in `<time>` to help search engines process the page.

- The format for `datetime` is: `2022-01-01 17:00`.
    - Note that time is optional.

- Most webpages have 3 main building blocks:
    - `<header>`
    - `<main>`
    - `<footer>`

- After the `<main>` element, you can have an `<aside>` element for advertising.

- The `<header>` contains a `<nav>` bar with a list of items.

- Use `<section>` element to group related content.

- Elements can be used however you want to structure a webpage.
    - There is no set rule for structuring a webpage.

- The `<main>` element is used to represent the main content of the page.
    - Every page can only have 1 `<main>` element.
    - Using more than 1 `<main>` element will product a validation error.

- The `<section>` element is used to group related content.

- The `<header>` element is used to represent introductory content, which can belong to the page, a section, or an article.

- The `<footer>` element can be used in the same way as the `<header>` element.

- The `<aside>` element is used to represent content that is not directly related to the main content, like advertisements.

- LESSON 26
